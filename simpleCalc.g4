grammar simpleCalc;
 
start   : as+=assign*  e=expr EOF ;

assign  : x=ID '=' e=expr ;


prog : stmt ;

stmt: VAR '=' expr
    | IF(cond) prog
    | IF(cond) prog ELSE prog
    | WHILE(cond) prog
    ;

/*
stmts: stmt  ;
*/


cond: expr '==' expr
    | expr '!==' expr
    | cond '&&' cond
    | cond '||' cond
    ;

expr: e1=expr op=OPERATOR e2=expr # Calculate
	| n=NUM  	        # Constant
	| x=ID            # Variable
	| '(' e=expr ')'  # Parenthesis
	| VAR   #Var
	;

OPERATOR : ('+'|'-'|'*'|'/') ;
NUM 	: ('0'..'9')+ ;
ID	: ('A'..'Z'|'a'..'z')+ ;
WHITESPACE : [ \n\t\r]+ -> skip;
COMMENT : '//' ~('\n')* -> skip;
VAR : 'var';
CONST : 'const';
IF : 'if';
ELSE : 'else';
WHILE : 'while';

