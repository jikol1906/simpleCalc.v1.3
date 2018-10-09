grammar simpleCalc;
 
start   : as+=assign*   e=expr EOF ;

assign  : x=ID '=' e=expr ;


prog : stmt ;

stmt: VAR '=' expr
    | IF'('expr')' prog
    | IF'('expr')' prog ELSE prog
    | WHILE'('expr')' expr
    ;

stmts: stmt  ;





expr: e1=expr op=OP1 e2=expr # Calculate
    | e1=expr op=OP2 e2=expr # Calculate
	| n=NUM  	        # Constant
	| x=ID            # Variable
	| '(' e=expr ')'  # Parenthesis
	| VAR   #Var
	| stmts #Statement
	| e1=expr  op='==' e2=expr #Comparison
        | e1=expr op='!==' e2=expr #Comparison
        | e1=expr op='&&' e2=expr #Comparison
        | e1=expr op='||' e2=expr #Comparison
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

