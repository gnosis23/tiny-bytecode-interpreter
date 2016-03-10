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
}
