package org.bohao.vm;

/**
 * Instruction Set
 * Created by bohao on 2016/3/10.
 */
public class InstructionSetDefinition {
    // Const
    public static final int INST_MOVIR = 1;

    // Branch
    public static final int INST_JMP = 11;
    public static final int INST_JMPE = 12;

    // Calc
    public static final int INST_ADDI = 21;
    public static final int INST_SUBI = 22;

    // Func
    public static final int INST_CALL = 31;
    public static final int INST_RET = 32;

    // Others
    public static final int INST_GG = 41;
    public static final int INST_SYSCALL = 42;
    public static final int INST_PRINT = 43;
}
