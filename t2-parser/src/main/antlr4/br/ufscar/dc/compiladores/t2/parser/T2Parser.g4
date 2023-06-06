grammar T2Parser;

// Máquina de estados que verifica o comentário corretamente, em que se inicia com o '{' aceita qualquer 
// caracter dentro deste, sem ter quebra de linha e finaliza com '}'.
COMENTARIO       : '{' ~('\n')*? '}' {skip();};

// Palavras chaves.
ALGORITMO        : 'algoritmo';
FIM_ALGORITMO    : 'fim_algoritmo';
DECLARE          : 'declare';
CONSTANTE        : 'constante';
LITERAL          : 'literal';
INTEIRO          : 'inteiro';
REAL             : 'real';
LOGICO           : 'logico';
TRUE             : 'verdadeiro';
FALSE            : 'falso';
AND              : 'e';
OR               : 'ou';
NOT              : 'nao';
IF               : 'se';
THEN             : 'entao';
ELSE             : 'senao';
ENDIF            : 'fim_se';
CASO             : 'caso';
SEJA             : 'seja';
FIM_CASO         : 'fim_caso';
PARA             : 'para';
ATE              : 'ate';
FACA             : 'faca';
FIM_PARA         : 'fim_para';
WHILE            : 'enquanto';
ENDWHILE         : 'fim_enquanto';
TIPO             : 'tipo';
REGISTRO         : 'registro';
FIM_REGISTRO     : 'fim_registro';
PROCEDIMENTO     : 'procedimento';
VAR              : 'var';
FIM_PROCEDIMENTO : 'fim_procedimento';
FUNCAO           : 'funcao';
RETORNE          : 'retorne';
FIM_FUNCAO       : 'fim_funcao';
LEIA             : 'leia';
ESCREVA          : 'escreva';

// Intervalo de valores.
INTERVALO        : '..';

// Operadores Relacionais.
MENOR            : '<';
MENORIGUAL       : '<=';
MAIOR            : '>';
MAIORIGUAL       : '>=';
IGUAL            : '=';
DIFERENTE        : '<>';

// Delimitadores.
DELIM            : ':';
ABREPAR          : '(';
FECHAPAR         : ')';
ABRECHAVE        : '[';
FECHACHAVE       : ']';
VIRGULA          : ',';
ASPAS            : '"';

// Operadores aritméticos.
DIVISAO          : '/';
MOD              : '%';
SOMA             : '+';
SUBTRACAO        : '-';
MULTIPLICACAO    : '*';

// Operadores de manipulação de memória.
ATRIBUICAO       : '<-';
PONTEIRO         : '^';
ENDERECO         : '&';
PONTO            : '.';

// Números.
NUM_INT          : ('0'..'9')+;
NUM_REAL         : ('0'..'9')+ ('.' ('0'..'9')+)?;

// Identificadores.
// Identificadores começam com qualquer letra, maiúscula 
// ou minuscula, seguida de qualquer letra, ou digito, ou '_' 
IDENT            : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Cadeia de string.
// Cadeias de strings são iniciadas por '"', seguidos por quaisquer caracter, sem 
// ser o caracter '\n' e finalizados por '"'.
CADEIA           : '"' ( ~('\n') )*? '"';

// Erro de cadeia de string
// Verifica qualquer cadeia que não foi fechada. Deve vir abaixo da CADEIA
// pois senão pode gerar conflito de nunca encontrar a cadeia.
CADEIA_N_FECHADA : '"' ( ~('\n'|'"') )*? '\n';

// Espaço em branco.
WS               : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

// Erro de comentário não fechado.
COMENT_N_FECHADO : '{' ~('\n'|'}')*? '\n';

// Caso não for identificado nenhuma regra acima, gera um erro.
ERRO             : .;

programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo'
    ;
    
declaracoes
    : {decl_local_global}
    ;
    
decl_local_global
    : declaracao_local 
    | declaracao_global
    ;
    
declaracao_local
    : 'declare' variavel 
    | 'constante' IDENT ':' tipo_basico '=' valor_constate 
    | 'tipo' IDENT ':' tipo
    ;
    
variavel
    : identificador {',' identificador} ':' tipo
    ;
    
identificador
    : IDENT {'.' IDENT} dimensao
    ;
    
dimensao
    : {'[' exp_aritmetica ']'}
    ;
    
tipo
    : registro 
    | tipo_estendido
    ;
    
tipo_basico
    : 'literal' 
    | 'inteiro' 
    | 'real' 
    | 'logico'
    ;
    
tipo_basico_ident
    : tipo_basico 
    | IDENT
    ;
    
tipo_estendido
    : ['^'] tipo_basico_ident
    ;
    
valor_constante
    : CADEIA 
    | NUM_INT 
    | NUM_REAL 
    | 'verdadeiro' 
    | 'falso'
    ;
    
registro
    : 'registro' {variavel} 'fim_registro'
    ;

parametro
    : ['var'] identificador {',' identificador} ':' tipo_estendido
    ;

parametros
    : parametro {',' parametro}
    ;

declaracao_global
    : 'procedimento' IDENT '(' [parametros] ')' {declaracao_local} {cmd} 'fim_procedimento' 
    | 'funcao' IDENT '(' [parametros] ')' ':' tipo_estendido {declaracao_local} {cmd} 'fim_funcao'
    ;
    
corpo
    : {declaracao_local} {cmd}
    ;
    
cmd
    : cmdLeia 
    | cmdEscreva 
    | cmdSe 
    | cmdCaso 
    | cmdPara 
    | cmdEnquanto 
    | cmdFaca 
    | cmdAtribuicao 
    | cmdChamada 
    | cmdRetorne
    ;
    
cmdLeia
    : 'leia' '(' ['^'] identificador {',' ['^'] identificador} ')'
    ;
    
cmdEscreva
    : 'escreva' '(' expressao {',' expressao} ')'
    ;
    
cmdSe
    : 'se' expressao 'entao' {cmd} ['senao' {cmd}] 'fim_se'
    ;
    
cmdCaso
    : 'caso' exp_aritmetica 'seja' selecao ['senao' {cmd}] 'fim_caso'
    ;
    
cmdPara
    : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' {cmd} 'fim_para'
    ;
    
cmdEnquanto
    : 'enquanto' expressao 'faca' {cmd} 'fim_enquanto'
    ;
    
cmdFaca
    : 'faca' {cmd} 'ate' expressao
    ;
    
cmdAtribuicao
    : ['^'] identificador '<-' expressao
    ;
    
cmdChamada
    : IDENT '(' expressao {',' expressao} ')'
    ;
    
cmdRetorne
    : 'retorne' expressao
    ;
    
selecao
    : {item_selecao}
    ;
    
item_selecao
    : constantes ':' {cmd}
    ;
    
constantes
    : numero_intervalo {',' numero_intervalo}
    ;
    
numero_intervalo
    : [op_unario] NUM_INT ['..' [op_unario] NUM_INT]
    ;
    
op_unario
    : '-'
    ;
    
exp_aritmetica
    : termo {op1 termo}
    ;
    
termo
    : fator {op2 fator}
    ;
    
fator
    : parcela {op3 parcela}
    ;
    
op1
    : '+' | '-'
    ;
    
op2
    : '*' | '/'
    ;
    
op3
    : '%'
    ;
    
parcela
    : [op_unario] parcela_unario | parcela_nao_unario
    ;
    
parcela_unario
    : ['^'] identificador
	| IDENT '(' expressao {',' expressao} ')'
	| NUM_INT
	| NUM_REAL
	| '(' expressao ')'
    ;
    
parcela_nao_unario
    : '&' identificador | CADEIA
    ;
    
exp_relacional
    : exp_aritmetica [op_relacional exp_aritmetica]
    ;
    
op_relacional
    : '=' | '<>' | '>=' | '<=' | '>' | '<'
    ;
    
expressao
    : termo_logico {op_logico_1 termo_logico}
    ;
    
termo_logico
    : fator_logico {op_logico_2 fator_logico}
    ;
    
fator_logico
    : ['nao'] parcela_logica
    ;
    
parcela_logica
    : ( 'verdadeiro' | 'falso' )
	| exp_relacional
    ;
    
op_logico_1
    : 'ou'
    ;
    
op_logico_2
    : 'e'
    ;