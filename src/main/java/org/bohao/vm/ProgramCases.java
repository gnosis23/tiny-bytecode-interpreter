package org.bohao.vm;

import static org.bohao.vm.InstructionSetDefinition.*;

/**
 * bytecode testcases for the Interpreter
 * Created by bohao on 2016/3/10.
 */
public class ProgramCases {
    // GG
    public static Program gg = new Program(
            new byte[]{
                    41
            },
            1
    );

    // movir 1, r1
    // movir 2, r2
    // addi r1, r2, r3
    // print r3
    public static Program easy1 = new Program(
            new byte[]{
                    INST_MOVIR, 0, 0, 0, 1, 1,
                    INST_MOVIR, 0, 0, 0, 2, 2,
                    INST_ADDI, 1, 2, 3,
                    INST_PRINT, 3,
                    INST_GG
            },
            19
    );

    // movir 0, r1
    // movir 0, r2
    // movir 10, r3
    // movir 1, r4
    // LOOP:
    // jmpe r2, r3, DONE
    // addi r1, r2, r1
    // addi r2, r4, r2
    // print r1
    // jmp LOOP
    // DONE:
    // gg
    public static Program loop1 = new Program(
            new byte[] {
                    INST_MOVIR, 0, 0, 0, 0, 1,
                    INST_MOVIR, 0, 0, 0, 0, 2,
                    INST_MOVIR, 0, 0, 0, 10, 3,
                    INST_MOVIR, 0, 0, 0, 1, 4, // LOOP:
                    INST_JMPE, 2, 3, 0, 0, 0, 46,
                    INST_ADDI, 1, 2, 1,
                    INST_ADDI, 2, 4, 2,
                    INST_PRINT, 1,
                    INST_JMP, 0, 0, 0, 24, // DONE:
                    INST_GG
            },
            47
    );

    public static Program func1 = new Program(
            // g():
            // movir, 1, r1
            // PRINT r1
            // main():
            // movir, 1024, r1
            // PRINT r1
            // call g
            // movir, 2, r1
            // PRINT 1
            new byte[] {
                    INST_MOVIR, 0, 0, 0, 1, 1,
                    INST_PRINT, 1,
                    INST_RET,
                    INST_MOVIR, 0, 0, 4, 0, 1,
                    INST_PRINT, 1,
                    INST_CALL, 0, 0, 0, 0,
                    INST_MOVIR, 0, 0, 0, 2, 1,
                    INST_PRINT, 1,
                    INST_GG
            },
            100,
            new FunctionSymbol[]{
                    new FunctionSymbol("g", 0, 0, 0),
                    new FunctionSymbol("main", 9, 0, 0)
            }
    );

    public static Program func2 = new Program(
            // g():
            // addi, r1, r2, r0
            // RET
            // main():
            // movir 1, r1
            // movir 9, r2
            // call g r1 r2
            // PRINT r0
            // GG
            new byte[] {
                    INST_ADDI, 1, 2, 0,
                    INST_RET,
                    INST_MOVIR, 0,0,0,1, 1,
                    INST_MOVIR, 0,0,0,9, 2,
                    INST_CALL,  0,0,0,0, 1, 2,
                    INST_PRINT, 0,
                    INST_GG
            },
            100,
            new FunctionSymbol[]{
                    new FunctionSymbol("g", 0, 2, 0),
                    new FunctionSymbol("main", 5, 0, 0)
            }
    );
}
