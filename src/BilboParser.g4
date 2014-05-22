parser grammar BilboParser;

options { tokenVocab=BilboLexer; }


source
    : outsideJava (bilbo outsideJava?)* outsideJava
    ;

outsideJava
    : JavaBlockOutSide
    | FinalJavaBlock
    ;

bilbo
    : header
    ;

header
    : Visibility? Static type nimi LParen type nimi RParen LBrace body RBrace
    ;

body
    :    (line SemiColon)+
    ;

line
    :   head JavaStart java
    ;

java
    : JavaBlock
    ;

head
    :   type LParen args? RParen
    |   Bottom
    ;

args
    :   arg (Coma arg)*
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

nimi
    :   Name
    ;

type
    :   TypeName
    ;


