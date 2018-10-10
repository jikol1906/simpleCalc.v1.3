import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {

        // we expect exactly one argument: the name of the input file
        if (args.length != 1) {
            System.err.println("\n");
            System.err.println("Simple calculator\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename = args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        simpleCalcLexer lex = new simpleCalcLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        simpleCalcParser parser = new simpleCalcParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        AST result = interpreter.visit(parseTree);

        System.out.println("The result is: " + result);
    }
}

// We write an interpreter that implements interface
// "simpleCalcVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<AST> implements simpleCalcVisitor<AST> {

    static Environment env = new Environment();

    public AST visitStart(simpleCalcParser.StartContext ctx) {
        for (simpleCalcParser.ProgContext a : ctx.as) {
            visit(a);
        }
        return visit(ctx.e);
    }


    public AST visitAssign(simpleCalcParser.AssignContext ctx) {
        AST d = visit(ctx.e);
       // env.setVariable(ctx.x.getText());
        return null;
    }

    public AST visitParenthesis(simpleCalcParser.ParenthesisContext ctx) {
        return visit(ctx.e);
    }


    public AST visitVariable(simpleCalcParser.VariableContext ctx) {
        return new Variable(ctx.x.getText());
    }


    public AST visitCalculate(simpleCalcParser.CalculateContext ctx) {

        switch (ctx.op.getText()) {
            case "+":
                return new Addition(Double.parseDouble(ctx.e1.getText()), Double.parseDouble(ctx.e2.getText()));
            case "*":
                return new Multiplication((Expr) visit(ctx.e1), (Expr) visit(ctx.e2));
            case "-":
                return new Subtraction((Expr) visit(ctx.e1), (Expr) visit(ctx.e2));
            default:
                return new Division((Expr) visit(ctx.e1), (Expr) visit(ctx.e2));
        }

    }

    public AST visitConstant(simpleCalcParser.ConstantContext ctx) {
        return new Constant(Double.parseDouble(ctx.n.getText())); // new Double(ctx.NUM()); // Integer.parseInt(string);
    }

    public AST visitComparison(simpleCalcParser.ComparisonContext ctx) {
        return new Comparison(ctx.e1.getText(), ctx.e2.getText(), ctx.op.getText()); // new Double(ctx.NUM()); // Integer.parseInt(string);
    }

    public AST visitLogOp(simpleCalcParser.LogOpContext ctx) {
        return new LogOp(ctx.e1.getText(), ctx.e2.getText(), ctx.op.getText()); // new Double(ctx.NUM()); // Integer.parseInt(string);
    }

    public AST visitStmt(simpleCalcParser.StmtContext ctx) {
        return null;
    }

    public AST visitStmts(simpleCalcParser.StmtsContext ctx) {
        return null;
    }

    public AST visitProg(simpleCalcParser.ProgContext ctx) {
        return null;
    }

    public AST visitStatement(simpleCalcParser.StatementContext ctx) {
        return null;
    }


}

abstract class AST {
    abstract public double eval(Environment env);
}

class Start extends AST {
    public List<Assignment> a;
    public Expr e;

    Start(List<Assignment> a, Expr e) {
        this.a = a;
        this.e = e;
    }

    public double eval(Environment env) {
        for (Assignment assign : a)
            assign.eval(env);
        return e.eval(env);
    }
}

class Assignment extends AST {
    public String varname;
    public Expr e;

    Assignment(String varname, Expr e) {
        this.varname = varname;
        this.e = e;
    }

    public double eval(Environment env) {
        double d = e.eval(env);
        env.setVariable(varname, d);
        return d;
    }
}

abstract class Expr extends AST {
}

class Addition extends Expr {
    public double e1;
    public double e2;

    Addition(Double e1, Double e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double eval(Environment env) {
        //return e1.eval(env) + e2.eval(env);
        return 0;
    }

    @Override
    public String toString() {
        return e1 + e2 + "";
    }
}

class Subtraction extends Expr {
    public Expr e1;
    public Expr e2;

    Subtraction(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double eval(Environment env) {
        return e1.eval(env) - e2.eval(env);
    }
}

class Multiplication extends Expr {
    public Expr e1;
    public Expr e2;

    Multiplication(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double eval(Environment env) {
        return e1.eval(env) * e2.eval(env);
    }
}

class Division extends Expr {
    public Expr e1;
    public Expr e2;

    Division(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public double eval(Environment env) {
        return e1.eval(env) / e2.eval(env);
    }
}

class Variable extends Expr {
    public String varname;

    Variable(String varname) {
        this.varname = varname;
    }

    public double eval(Environment env) {
        return env.getVariable(varname);
    }
}

class Constant extends Expr {
    public double d;

    Constant(double d) {
        this.d = d;
    }

    public double eval(Environment env) {
        return d;
    }
}

abstract class Cond extends AST {
}

class Comparison extends Cond {
    public String d1;
    public String d2;
    public String bl;

    public Comparison(String d1, String d2, String bl) {
        this.d1 = d1;
        this.d2 = d2;
        this.bl = bl;
    }

    public double eval(Environment env) {
        try {
            double e1 = Double.parseDouble(d1);
            double e2 = Double.parseDouble(d2);
            switch (bl) {
                case "==":
                    return e1 == e2 ? 1.0 : 0.0;
                case "!=":
                    return e1 != e2 ? 1.0 : 0.0;
                default:
                    return 0.0;
            }

        } catch (NumberFormatException ex) {
            return 0.0;
        }

    }
}

class LogOp extends Cond {

    public double d1;
    public double d2;
    public String bl;

    public LogOp(String d1, String d2, String bl) {
        this.d1 = Double.parseDouble(d1);
        this.d2 = Double.parseDouble(d2);
        this.bl = bl;
    }

    public double eval(Environment env) {
        try {
            switch (bl) {
                case "&&":
                    return d1 - d2 == 0.0 ? 1.0 : 0.0;
                case "||":
                    return d1 == 1.0 || d2 == 1.0 ? 1.0 : 0.0;
                default:
                    return 0.0;
            }

        } catch (NumberFormatException ex) {
            return 2.0;

        }

    }
}
