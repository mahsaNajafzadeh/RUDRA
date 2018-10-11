grammar model;

@header {package xpr;}


 prog: (class_definition  terminator*) *;

class_definition: class_declaration  class_body END  ;

class_declaration: CLAS class_name LESS  PARENT (crlf)+;

class_name: ID;


class_body: (expression terminator+)* ;

expression : function_definition
           | function_inline_call
           | require_block
           | if_statement
           | unless_statement
           | rvalue
           | return_statement
           | while_statement
           | for_statement
           | pir_inline
           | validate_presence
           | validate_num
           | belong_statement
           | put_statement
           |return_statement
           |render_statement
           |validate_statement
           | cc_statement
           |  validate_u
           | has_many_statement
           |has_one_statement
            | validates_associated
           | attr_statement
           |validate_function
           ;

 validate_function: VALIDAT ID_GLOBAL (COMMA  on_statement)?;

 on_statement: ON ID_GLOBAL;
attr_statement:  ATTR ID_GLOBAL (COMMA ID_GLOBAL)* (ID_GLOBAL)?  ;
has_many_statement:  HASMANY ID_GLOBAL  (COMMA FORIGN IMPLIES string_result)?  (COMMA AS  id_global)?    (COMMA order_st)? (COMMA through_st  )? (COMMA depend_st)? ;

has_one_statement: HASONE ID_GLOBAL (COMMA AS  id_global)? (COMMA depend_st)? ;
order_st:  IMPLIES literal_t ;
through_st: THRO ID_GLOBAL ;
depend_st: DEPEN ID_GLOBAL | DEPEN (IMPLIES )? DESTROY  | DEPEN (IMPLIES)? NULLIFY | DEPEN (IMPLIES)? ERROR ;
 validate_u:  VALIDATEUNI (id_global  COMMA)*   ( SENSETIVE IMPLIES bool_t)?;
cc_statement :  CC_UNIQUE ID ;

validate_statement: VALIDATE  id_global  (COMMA id_global )* (COMMA presentce)? (COMMA lengthst)?  (COMMA  numericallyst)?   (COMMA validate_unique)?  (belong_expr)? ;

 validates_associated: ASSOCIATE id_global (COMMA id_global )* ;

presentce: (PRESENCE IMPLIES TRUE   )*  | PRESE  TRUE  ;

belong_expr: ID_GLOBAL IMPLIES bool_t;

lengthst: (ID_GLOBAL IMPLIES OBRAKET     (MIN IMPLIES  rvalue COMMA)? ( MAX IMPLIES rvalue  CBRACKET)? )*;

 numericallyst: (NUMERICALLY (IMPLIES)? '{'  cond_num  (IMPLIES | COLON) rvalue  '}'  )* ;

 validate_unique :    UNIQUE  IMPLIES TRUE  | UNI   TRUE |   (OBRAKET SCOPE ID_GLOBAL CBRACKET)? ;
render_statement: REND WEB '{'  ID_FUNCTION bool_t  '}';
put_statement : PUT string_result ;
global_get : var_name=lvalue op=ASSIGN global_name=id_global;

global_set : global_name=id_global op=ASSIGN result=all_result;

global_result : id_global;

function_inline_call : function_call;

require_block : REQUIRE literal_t;

pir_inline : PIR crlf pir_expression_list END;

pir_expression_list : expression ;

function_definition : function_definition_header (function_definition_body)* (crlf)* END;

function_definition_body :  put_statement | new_statement | assignment | crlf  |remove_statement | return_statement | trans_statement | function_inline_call |
save_statement |if_statement |render_statement |set_statement;

set_statement: LEFT_RBRACKET id0 MINUS id1  RIGHT_RBRACKET DOT EMPTY ;
id1: ID;
id0:ID;

trans_statement : TRANS DO  crlf (function_definition_body)*   END ;

function_definition_header : DEF function_name crlf
                           | DEF function_name function_definition_params crlf
                           ;

function_name : id_function
              | id
              ;

function_definition_params : LEFT_RBRACKET RIGHT_RBRACKET
                           | LEFT_RBRACKET id ( COMMA function_definition_param_id)* RIGHT_RBRACKET
                           ;

function_definition_params_list : function_definition_param_id
                                | function_definition_params_list COMMA function_definition_param_id
                                ;

function_definition_param_id : id;

new_statement:NEW | NEW LEFT_RBRACKET arguments RIGHT_RBRACKET | NEW LEFT_RBRACKET RIGHT_RBRACKET;
remove_statement:DEL ;

arguments:  (COMMA id)* lvalue  ;

validate_presence: VPRE    ID_GLOBAL  (COMMA  ID_GLOBAL)*
;

validate_num:  VNUM   ID_GLOBAL ( COMMA cond_num (IMPLIES)? rvalue)+
;
cond_num: VGE | VGT  | VLE | VLT;

belong_statement: BELONG  lvalue  belong_options*  | MIXED lvalue    ;
 belong_options: (COMMA FORIGN IMPLIES string_result)|  COMMA POLY bool_t | COMMA ':class_name' IMPLIES  literal_t
 | COMMA depend_st;

return_statement : RETURN all_result;

save_statement:  (class_name DOT )? SAVE;



function_call : name=function_name LEFT_RBRACKET params=function_call_param_list RIGHT_RBRACKET
              | name=function_name params=function_call_param_list
              | name=function_name LEFT_RBRACKET RIGHT_RBRACKET
              ;

function_call_param_list : function_call_params;

function_call_params : function_param (  COMMA function_param)*
                     ;

function_param : ( function_unnamed_param | function_named_param );

function_unnamed_param : ( int_result | float_result | string_result | dynamic_result |lvalue);

function_named_param : id op=ASSIGN ( int_result | float_result | string_result | dynamic_result );

function_call_assignment : function_call;

all_result : ( int_result | float_result | string_result | dynamic_result | global_result | bool_t)+ ( expression)?;

elsif_statement : if_elsif_statement;

if_elsif_statement : ELSIF cond_expression crlf statement_body
                   | ELSIF cond_expression crlf statement_body else_token crlf statement_body
                   | ELSIF cond_expression crlf statement_body if_elsif_statement
                   ;

if_statement : IF cond_expression crlf statement_body END
             | IF cond_expression crlf statement_body else_token crlf statement_body END
             | IF cond_expression crlf statement_body elsif_statement END
             | IF cond_expression
             ;

unless_statement : UNLESS cond_expression crlf statement_body END
                 | UNLESS cond_expression crlf statement_body else_token crlf statement_body END
                 | UNLESS cond_expression crlf statement_body elsif_statement END
                 | UNLESS function_call
                 | UNLESS id
                 ;

while_statement : WHILE cond_expression crlf statement_body END;

for_statement : FOR LEFT_RBRACKET init_expression SEMICOLON cond_expression SEMICOLON loop_expression RIGHT_RBRACKET crlf statement_body END
              | FOR init_expression SEMICOLON cond_expression SEMICOLON loop_expression crlf statement_body END
              ;

init_expression : for_init_list;

all_assignment : ( int_assignment | float_assignment | string_assignment | dynamic_assignment );

for_init_list : for_init_list COMMA all_assignment
              | all_assignment
              ;

cond_expression : comparison_list;

loop_expression : for_loop_list;

for_loop_list : for_loop_list COMMA all_assignment
              | all_assignment
              ;

statement_body : statement_expression_list;

statement_expression_list : expression terminator
                          | RETRY terminator
                          | break_expression terminator
                          | statement_expression_list expression terminator
                          | statement_expression_list RETRY terminator
                          | statement_expression_list break_expression terminator
                          | (expression)*
                          ;


assignment : var_id=lvalue (op=ASSIGN)* primary_expr ;

primary_expr: int_result | int_plus | int_minus | new_statement  ;

dynamic_assignment : var_id=lvalue op=ASSIGN dynamic_result
                   | var_id=lvalue op=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN ) dynamic_result
                   ;

int_assignment : var_id=lvalue op=ASSIGN (int_result | dynamic_result) ;
int_plus: var_id=lvalue  PLUS   ( int_result| dynamic_result) | PLUS_ASSIGN (int_result | dynamic_result);
int_minus: var_id=lvalue  MINUS (int_result | dynamic_result) | MINUS_ASSIGN (int_result | dynamic_result);

float_assignment : var_id=lvalue op=ASSIGN float_result
                 | var_id=lvalue op=( PLUS_ASSIGN | MINUS_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN | EXP_ASSIGN ) float_result
                 ;

string_assignment : var_id=lvalue op=ASSIGN string_result
                  | var_id=lvalue op=PLUS_ASSIGN string_result
                  ;

initial_array_assignment : var_id=lvalue op=ASSIGN LEFT_SBRACKET RIGHT_SBRACKET;

array_assignment : arr_def=array_selector op=ASSIGN arr_val=all_result;

array_definition : LEFT_SBRACKET array_definition_elements RIGHT_SBRACKET;

array_definition_elements : ( int_result | dynamic_result )
                          | array_definition_elements COMMA ( int_result | dynamic_result )
                          ;

array_selector : id LEFT_SBRACKET ( int_result | dynamic_result ) RIGHT_SBRACKET
               | id_global LEFT_SBRACKET ( int_result | dynamic_result ) RIGHT_SBRACKET
               ;

dynamic_result : dynamic_result op=( MUL | DIV | MOD ) int_result
               | int_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=( MUL | DIV | MOD ) float_result
               | float_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=( MUL | DIV | MOD ) dynamic_result
               | dynamic_result op=MUL string_result
               | string_result op=MUL dynamic_result
               | dynamic_result op=( PLUS | MINUS ) int_result
               | int_result op=( PLUS | MINUS ) dynamic_result
               | dynamic_result op=( PLUS | MINUS )  float_result
               | float_result op=( PLUS | MINUS )  dynamic_result
               | dynamic_result op=( PLUS | MINUS ) dynamic_result
               | LEFT_RBRACKET dynamic_result RIGHT_RBRACKET
               | dynamic
               ;

dynamic : id
        | function_call_assignment
        | array_selector
        ;

int_result : int_result op=( MUL | DIV | MOD ) int_result
           | int_result op=( PLUS | MINUS ) int_result
           | LEFT_RBRACKET int_result RIGHT_RBRACKET
           | int_t
           ;

float_result : float_result op=( MUL | DIV | MOD ) float_result
             | int_result op=( MUL | DIV | MOD ) float_result
             | float_result op=( MUL | DIV | MOD ) int_result
             | float_result op=( PLUS | MINUS ) float_result
             | int_result op=( PLUS | MINUS )  float_result
             | float_result op=( PLUS | MINUS )  int_result
             | LEFT_RBRACKET float_result RIGHT_RBRACKET
             | float_t
             ;

string_result : string_result op=MUL int_result
              | int_result op=MUL string_result
              | string_result op=PLUS string_result
              | literal_t
              ;



comparison_list : left=comparison op=BIT_AND right=comparison_list
                | left=comparison op=AND right=comparison_list
                | left=comparison op=BIT_OR right=comparison_list
                | left=comparison op=OR right=comparison_list
                | LEFT_RBRACKET comparison_list RIGHT_RBRACKET
                | comparison
                ;


comparison : left=comp_var op=( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) right=comp_var
           | left=comp_var op=( EQUAL | NOT_EQUAL ) right=comp_var
           | id AND negid  | id AND nil_expr | NOT |self_expr EQUAL  LITERAL | none_expr
           ;

self_expr: SELF LEFT_SBRACKET ID_GLOBAL  RIGHT_SBRACKET  ;
nil_expr: function_call DOT CNIL;
none_expr: id DOT NONE;
comp_var : all_result
         | array_selector
         | id
         ;

lvalue :  (class_name DOT)? id | id
       | id_global

       ;

rvalue : lvalue

       | initial_array_assignment
       | array_assignment

       | int_result
       | float_result
       | string_result

       | global_set
       | global_get
       | dynamic_assignment
       | string_assignment
       | float_assignment
       | int_assignment
       | assignment

       | function_call
       | literal_t
       | bool_t
       | float_t
       | int_t
       | nil_t

       | rvalue EXP rvalue

       | ( NOT | BIT_NOT )rvalue

       | rvalue ( MUL | DIV | MOD ) rvalue
       | rvalue ( PLUS | MINUS ) rvalue

       | rvalue ( BIT_SHL | BIT_SHR ) rvalue

       | rvalue BIT_AND rvalue

       | rvalue ( BIT_OR | BIT_XOR )rvalue

       | rvalue ( LESS | GREATER | LESS_EQUAL | GREATER_EQUAL ) rvalue

       | rvalue ( EQUAL | NOT_EQUAL ) rvalue

       | rvalue ( OR | AND ) rvalue

       | LEFT_RBRACKET rvalue RIGHT_RBRACKET
       ;

break_expression : BREAK;

literal_t : LITERAL;

float_t : FLOAT;

int_t : INT;

bool_t : TRUE
       | FALSE
       ;

nil_t : NIL;
negid:'!'ID;

id
   : ID   | NUMBER  |STRR;

id_global : ID_GLOBAL ;

id_function : (class_name DOT)?ID | (SELF DOT)? (ID | ID_FUNCTION);

terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;

else_token : ELSE;

crlf : CRLF;

fragment ESCAPED_QUOTE : '\\"';
LITERAL : '"' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '"'
        | '\'' ( ESCAPED_QUOTE | ~('\n'|'\r') )*? '\'' ;
COMMA : ',';
SEMICOLON : ';';
CRLF : '\r'? '\n';
COLON: ':';

REQUIRE : 'require';
END : 'end';
DEF : 'def';
RETURN : 'return';
PIR : 'pir';
NEW: 'new';
DEL: 'delete' | 'destroy' | 'destroy!'  ;
VPRE: 'validates_presence_of';
VNUM: 'validates_numericality_of';
VALIDATE: 'validates';
BELONG: 'belongs_to';
CLAS: 'class';
PARENT: 'ActiveRecord::Base' |'ApplicationRecord';
PUT: 'puts';
SELF:'self';
SAVE: 'save!';
TRANS: 'transaction';
DO: 'do';
REND:'render';
WEB: 'json:';
HASMANY:'has_many';
CAST:'DESC';
ATTR:'attr_accessible';
VGE: 'greater_then_or_equal_to:' | ':greater_then_or_equal_to' |' greater_than_or_equal_to';
VGT: 'greater_than:'|':greater_than';
VLE: 'less_than_or_equal_to:' |':less_than_or_equal_to';
VLT: 'less_than:';
POLY: 'polymorphic:';
FORIGN:':foreign_key';
DESTROY:':destroy' | ':delete_all';
VALIDAT:'validate';
ON:'on:';
EMPTY:'empty?';
NONE:'none?';

FALSE: 'false';
TRUE: 'true';
IF: 'if';
ELSE : 'else';
ELSIF : 'elsif';
UNLESS : 'unless';
WHILE : 'while';
RETRY : 'retry';
BREAK : 'break';
FOR : 'for';
MAX: ':maximum'  ;
MIN: ':minimum';
UNIQUE: ':uniqueness' ;
UNI: 'uniqueness:' ;
PRESENCE: ':presence';
PRESE:'presence:';
CC_UNIQUE: 'CC-UNIQUE' ;
VALIDATEUNI: 'validates_uniqueness_of';
SENSETIVE: ':case_sensitive';
NUMERICALLY: ':numericality'  | 'numericality:' ;
DEPEN:'dependent:' |':dependent' ;
THRO: 'through:';
SCOPE: 'scope:';
HASONE: 'has_one';
AS: 'as:' ;
MIXED:'has_and_belongs_to_many';
ASSOCIATE: 'validates_associated';
NULLIFY:':nullify';
ERROR:':restrict_with_exception';


IMPLIES: '=>';
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';
MOD : '%';
EXP : '**';

EQUAL : '==';
NOT_EQUAL : '!=';
GREATER : '>';
LESS : '<';
LESS_EQUAL : '<=';
GREATER_EQUAL : '>=';

ASSIGN : '=';
PLUS_ASSIGN : '+=';
MINUS_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
MOD_ASSIGN : '%=';
EXP_ASSIGN : '**=';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
BIT_NOT : '~';
BIT_SHL : '<<';
BIT_SHR : '>>';

AND : 'and' | '&&';
OR : 'or' | '||';
NOT : 'not' | '!';
DOT: '.';
LEFT_RBRACKET : '(';
RIGHT_RBRACKET : ')';
LEFT_SBRACKET : '[';
RIGHT_SBRACKET : ']';


OBRAKET:'{';
CBRACKET: '}';
CNIL : 'nil?';
NIL : 'nil';

 NUMBER
   : '-'? ( '.' DIGIT+ | DIGIT+ ( '.' DIGIT* )? )
   ;

INT : [0-9]+;
FLOAT : [0-9]*'.'[0-9]+;

fragment DIGIT
   : [0-9]
   ;

 STRR
   :  ID '.' ID
   ;
   ID_GLOBAL : ':'ID ;
   ID_FUNCTION : ID[?] | ID[:]  ;

 ID
   : LETTER ( LETTER | DIGIT )*
   ;

fragment LETTER
   : [a-zA-Z\u0080-\u00FF_]
   ;


COMMENT
   : '/*' .*? '*/' -> skip
   ;

WS : (' '|'\t')+ -> skip;
