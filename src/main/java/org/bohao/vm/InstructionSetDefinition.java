package org.bohao.vm;

import static org.bohao.vm.Instruction.*;

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

    public static Instruction[] IS = {
            new Instruction(INST_MOVIR, "movir", TYPE_INT, TYPE_REGISTER),
            new Instruction(INST_JMP, "jmp", TYPE_LABEL),
            new Instruction(INST_JMPE, "jmpe", TYPE_REGISTER, TYPE_REGISTER, TYPE_LABEL),
            new Instruction(INST_ADDI, "addi", TYPE_REGISTER, TYPE_REGISTER, TYPE_REGISTER),
            new Instruction(INST_SUBI, "subi", TYPE_REGISTER, TYPE_REGISTER, TYPE_REGISTER),
            new Instruction(INST_CALL, "call", TYPE_FUNC),
            new Instruction(INST_RET, "ret"),
            new Instruction(INST_GG, "gg"),
            new Instruction(INST_PRINT, "print", TYPE_REGISTER)
    };
}
