grammar adsl;

@header {package xpr;}


prog :    (class_definition  terminator*) * ;


class_definition: class_declaration  OBRACKET (crlf)* class_body  (crlf)* CBRACKET ;

class_declaration: CLASS class_name (EXTEND class_parent)?  ;
class_body:   (action_definition  terminator*) * ;

class_name: ID;
class_parent: ID;
action_definition: action_declaration  OBRACKET (crlf)* action_body  (crlf)* CBRACKET ;


action_declaration: ACTION   action_name   ;

action_name: ID;


action_body: (expression crlf)* ;

expression :  assignment |delete_statement | cc_statement |assert_statement |if_statement |  id |foreach_statement |EMPTY  |find_statement
| dynamic_assignment |create_statement | RAISE  |bool_t | com |foreach_statement;

bool_t: TRUE|FALSE;
dynamic_assignment : id op=( PLUS_ASSIGN | MINUS_ASSIGN  ) (id |EMPTY);

foreach_statement:  FOREACH id  COLON ( id |find_statement) OBRACKET  crlf  action_body  CBRACKET;

if_statement : IF  LEFT_RBRACKET cond_expression   RIGHT_RBRACKET OBRACKET crlf*  action_body  CBRACKET (else_token)?;

else_token: ELSE OBRACKET  crlf* (else_statement crlf)*  CBRACKET;
else_statement: find_statement |id |assignment |if_statement |bool_t |EMPTY | com | dynamic_assignment |create_statement;
cond_expression:  comparison_list  |   '*'   | block_st |EMPTY | NEG comparison_list ;
inusergroup: ISINGROUP LEFT_RBRACKET exppp (COMMA exppp)* RIGHT_RBRACKET;
block_st: OBRACKET crlf (delete_statement crlf)* CBRACKET;

comparison_list :  LEFT_RBRACKET    comparison_list  OR  comparison_list   RIGHT_RBRACKET | com  ;

com :inusergroup| id  LEFT_RBRACKET id RIGHT_RBRACKET   | NEG com | equal_func |in_func |  isempty_st  ;

in_func: id IN id;
equal_func:  EQUAL LEFT_RBRACKET id ',' id RIGHT_RBRACKET ;
isempty_st: ISEMPTY LEFT_RBRACKET id RIGHT_RBRACKET | ISEMPTY LEFT_RBRACKET assignment RIGHT_RBRACKET |
ISEMPTY LEFT_RBRACKET find_statement RIGHT_RBRACKET ;

assert_statement : ASSERT assert_body   ;
assert_body:   LEFT_RBRACKET assert_expr RIGHT_RBRACKET | assert_expr  ;
assert_expr:  LEFT_RBRACKET inusergroup  AND  ID IN set_expr  RIGHT_RBRACKET| inusergroup | ID IN id | com |
LEFT_RBRACKET assert_expr OR assert_expr RIGHT_RBRACKET |LEFT_RBRACKET assert_expr AND assert_expr RIGHT_RBRACKET ;
set_expr: id | id LEFT_RBRACKET  id ( COMMA id)* RIGHT_RBRACKET;

 exppp: ID |find_statement;
cc_statement : cc_unique ;
cc_unique : CC_UNIQUE ID ;
assignment :  id   ASSIGN  primary_expr | id   ASSIGN OBRACKET crlf  multi_expr*  crlf CBRACKET ;

multi_expr:crlf id | create_statement  | find_statement  |EMPTY | crlf if_statement |crlf delete_statement |assignment;
primary_expr:   id | create_statement  | find_statement  |EMPTY |if_statement |delete_statement |assignment
 | OBRACKET crlf action_body CBRACKET | union_st  ;

 union_st: UNION LEFT_RBRACKET element (COMMA element)* RIGHT_RBRACKET;
 element: id | find_statement;
create_statement :   CREAT  id (DOT id)? | CREAT LEFT_RBRACKET create_expr RIGHT_RBRACKET;
create_expr: LEFT_RBRACKET find_statement  DOT ID RIGHT_RBRACKET( DOT ID)?  | id;

delete_statement :  DEL  LEFT_RBRACKET id RIGHT_RBRACKET | DEL LEFT_RBRACKET  find_statement RIGHT_RBRACKET;

find_statement:  ONEOF LEFT_RBRACKET id RIGHT_RBRACKET  (DOT ID)?| SUBSET LEFT_RBRACKET (id |if_statement) RIGHT_RBRACKET
|TRY LEFT_RBRACKET id RIGHT_RBRACKET;



crlf : CRLF;



terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;
id
   : ID | STRING | STRR  | NUMBER | id DOT id
   ;

OR:'or';
AT: 'at';
UNDER: '__' ;
COMMA : ',';
SEMICOLON : ';';
CRLF : '\r'? '\n';
COLON: ':';
DOT: '.';
ASSIGN: '=';
PLUS_ASSIGN:'+=';
MINUS_ASSIGN:'-=';


ACTION: 'action' ;
CLASS: 'class';
CREAT: 'create';
DEL: 'delete';
ONEOF: 'oneof'  ;
SUBSET:  'subset' ;
CC_UNIQUE:'cc_unique';
ASSERT: 'assert' ;
IF:'if';
FOREACH: 'foreach' ;
EXTEND:'extends';
EMPTY:'empty';
EQUAL:'equal';
NEG:'not';
ISINGROUP: 'inusergroup';
AND: 'and';
IN: 'in';
TRY:'tryoneof';
ELSE:'else';
ISEMPTY:'isempty';
RAISE: 'raise';
TRUE: 'true';
FALSE: 'false';
UNION: 'union';

OBRACKET: '{';
CBRACKET: '}';
LEFT_RBRACKET : '(';
RIGHT_RBRACKET : ')';


/** "a numeral [-]?(.[0-9]+ | [0-9]+(.[0-9]*)? )" */ NUMBER
   : '-'? ( '.' DIGIT+ | DIGIT+ ( '.' DIGIT* )? )
   ;


fragment DIGIT
   : [0-9]
   ;


 STRING
   : '"' ID  '"'
   ;
 STRR
   :  ID '.' ID
   ;

ID_GLOBAL: ID':';
/** "Any string of alphabetic ([a-zA-Z\200-\377]) characters, underscores
 *  ('_') or digits ([0-9]), not beginning with a digit"
 */ ID
   : LETTER ( LETTER | DIGIT )*
   ;

fragment LETTER
   : [a-zA-Z\u0080-\u00FF_]
   ;


COMMENT
   : '/*' .*? '*/' -> skip
   ;


WS : (' '|'\t')+ -> skip;