grammar Bilbo;

header
    : Visibility 'static' type name '(' treeClass tree ')' '{' body '}'
    ;

Visibility
    : ('public' | 'private' | 'protected')
    ;