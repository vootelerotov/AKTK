lexer grammar BilboLexer;

@members{
static int i =0;
}


Static
    : 'static'
    ;

LParen
    : '('
    ;

RParen
    : ')'
    ;

LBrace
    : '{'
    ;

RBrace
    : '}'
    ;

Coma
    : ','
    ;

SemiColon
    : ';'
    ;

Visibility
    : ('public' | 'private' | 'protected')
    ;

TypeName
    :   [A-Z][a-z0-9_]*
    ;

Bottom
    :  '_'
    ;

JavaStart
    : '~>' -> pushMode(JAVABLOCK)
    ;

Name
    :   [a-z][a-z0-9_]*
    ;

Number
    :   [-+]?[0-9]*'.'?[0-9]+
    ;

String
    :   '"' [a-zA-Z0-9+-/*!"#%&/()=]* '"'
    ;


Whitespace
    :   [ \t\r\n]+ -> skip
    ;

//Java mode
mode JAVABLOCK;

OpeningBracket
    : '{' {i++;} -> more
    ;

JavaBlock
    : '}' {if (i ==1){ popMode();} else if (i > 1) { more();} i--;}
    ;

Any
    : ~[{}] -> more
    ;


