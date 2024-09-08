grammar ComidaLang;

program: body EOF;

body: info (bloco_refeicao)* (bloco_gostos)? (bloco_planejamento)?;

info:
    'nome:' NOME
    'dia da semana:' NOME
    'data:' DATA
;

bloco_refeicao:
    'REFEICAO'
    'alimentos:' alimentos
    'tipo:' TIPO_REFEICAO
    'horario:' NUMINT 'horas e' NUMINT 'minutos'
    'calorias:' NUMINT 'kcal'
    'END_REFEICAO'
;

alimentos: NOME ('e' NOME)*;

bloco_gostos:
    'GOSTOS'
    (gosto)+
    'END_GOSTOS'
;

gosto:
    'gosto de' NOME
;

bloco_planejamento:
    'PLANEJAMENTO'
    (planejamento)+
    'END_PLANEJAMENTO'
;

planejamento:
    'dia:' DATA 'refeicao:' NOME
;

NOME: '"' (~('"'|'\\'|'\n'|'\r'))* '"';
TIPO_REFEICAO: 'Café da Manhã' | 'Almoço' | 'Lanche' | 'Jantar';
NUMINT: ('0'..'9')+;
DATA: NUMINT '/' NUMINT '/' NUMINT;

WS: [ \t\r\n]+ -> skip;
