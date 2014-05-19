grammar bilbo;

header
    : Visibility? 'static' type nimi '(' type trree ')' '{' body '}'
    ;

body
    :    (line  ';')*
    ;

line
    :   head '~>' Javva
    ;

Javva
    :   '[' .*? ']'
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
    |   String_match
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

String_match
    :   '"' [a-zA-Z0-9+-/*!"#%&/()=]* '"'
    ;

Somethingthatdontwork
    :   .*?
    ;

Kommentaar
    :   '/*' .*? '*/' -> skip
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;