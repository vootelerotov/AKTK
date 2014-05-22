grammar bilbo;

header
    : Visibility? 'static' type nimi '(' type nimi ')' '{' body '}'
    ;

body
    :    (line ';')*
    ;

line
    :   head '~>' tava
    ;

tava
    :    '{' Code  '}'
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
    :   [a-z][a-z0-9_]*
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

Code
    : (~'}')*?
    ;
