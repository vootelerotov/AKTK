grammar Bilbo;

header
    : Visibility 'static' type name '(' type tree ')' '{' body '}'
    ;

Visibility
    : ('public' | 'private' | 'protected')?
    ;

body
    :    (line  ';')+
    ;

line
    :   head '~>' java
    ;

java
    :   Simplejava
    |   '{' (Simplejava ';')+ '}'
    ;

Simplejava
    :   (.)*
    ;


head
    :   type '(' args? ')'
    ;

args
    :   arg (',' arg)*
    ;

arg
    :   var
    |   match
    ;

var
    :   Name
    ;

match
    :   Number
    |   String
    ;
Number
    :   [-+]?[0-9]*'.'?[0-9]+
    ;

String
    :   '"' [a-zA-Z0-9]* '"'
    ;

name
    :   Name
    ;

Name
    :   [a-z][a-z0-9_]*
    ;

type
    :   TypeName
    ;

TypeName
    :   [A-Z][a-z0-9_]*
    ;

Whitespace
    :   [ \t\r\n]+ -> skip
    ;


tree
    :   Name
    ;