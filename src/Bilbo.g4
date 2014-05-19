grammar bilbo;

header
    : Visibility? 'static' type nimi '(' type trree ')' '{' body '}'
    ;

body
    :    (line  ';')*
    ;

line
    :   head '~>' Java
    ;

Java
    :   '<java>'
    ;

head
    :   type '(' args? ')'
    |   Bottom
    ;

args
    :   arg (',' arg)*
    ;

arg
    :   var
    |   match
    ;

var
    :   NimiTest
    ;

match
    :   Number
    |   String
    ;

nimi
    :   NimiTest
    ;


type
    :   TypeName
    ;

trree
    :   NimiTest
    ;

Visibility
    : ('public' | 'private' | 'protected')
    ;

TypeName
    :   [A-Z][a-z0-9_]*
    ;

Bottom
    :   [_]
    ;

NimiTest
    :   [A-z][a-z0-9_]*
    ;
Number
    :   [-+]?[0-9]*'.'?[0-9]+
    ;

String
    :   '"' [a-zA-Z0-9+-/*!"#%&/()=]* '"'
    ;
Simplejava
    :   [a-b]
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;
