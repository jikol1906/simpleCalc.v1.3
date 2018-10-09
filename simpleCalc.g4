grammar simpleCalc;
 
start   : as+=prog*   e=expr EOF ;



prog : stmt ;

stmt:
     IF '(' cond ')' prog
    | WHILE '('cond')' prog
   | ID '=' expr
    ;

stmts: stmt  ;
assign  : x=ID '=' e=expr ;


cond:     e1=expr  op='==' e2=expr #Comparison
        | e1=expr op='!=' e2=expr #Comparison
        | e1=cond op='&&' e2=cond #LogOp
        | e1=cond op='||' e2=cond #LogOp

;

expr: e1=expr op=OP1 e2=expr # Calculate
    | e1=expr op=OP2 e2=expr # Calculate
	| n=NUM  	        # Constant
	| x=ID            # Variable
	| '(' e=expr ')'  # Parenthesis
	| VAR   #Var
	| stmts #Statement

	;

OP1 : ('*'|'/') ;
OP2 : ('+'|'-') ;
NUM 	: ('0'..'9')+ ;
ID	: ('A'..'Z'|'a'..'z')+ ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT :    '//' ~('\n')* -> skip;
VAR : 'var';
CONST : 'const';
IF : 'if';
ELSE : 'else';
WHILE : 'while';