grammar Byte;

@members {
    void gameOver(){;}
    void addFunction(String name, int nArgs){;}
    void addLabel(String name){;}
    void addCode(String instruction){;}
    void addCode(String instruction, String a){;}
    void addCode(String instruction, String a, String b){;}
    void addCode(String instruction, String a, String b, String c){;}
}

line:   stat+
        {gameOver();}
    ;

stat:   func NEWLINE
    |   label NEWLINE
    |   command NEWLINE
    |   NEWLINE;

func:   '.func' NAME '.arg=' INT    {addFunction($NAME.text, $INT.int);}
    ;

command
    :   NAME    {addCode($NAME.text);}
    |   NAME a=operand
        {addCode($NAME.text, $a.text);}
    |   NAME a=operand ',' b=operand
        {addCode($NAME.text, $a.text, $b.text);}
    |   NAME a=operand ',' b=operand ',' c=operand
        {addCode($NAME.text, $a.text, $b.text, $c.text);}
    ;

label
    :   NAME ':'    {addLabel($NAME.text);}
    ;

operand :   INT
        |   REGISTER
        |   NAME
        ;

// lexical

INT :   DIGIT+ ;
REGISTER: [rR] INT ;
NAME :   CHAR (CHAR | DIGIT)+ ;

fragment CHAR    :   [a-zA-Z] ;
fragment DIGIT   :   [0-9];

NEWLINE :  ('//' .*?)? '\r'? '\n' ;
WS  :   [ \t]+ -> skip;
