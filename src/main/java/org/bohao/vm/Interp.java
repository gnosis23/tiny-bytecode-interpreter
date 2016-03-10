package org.bohao.vm;

import org.bohao.vm.utils.ByteUtils;

import static org.bohao.vm.InstructionSetDefinition.*;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class Interp {
    int ip = 0;
    byte[] code;
    int codeSize;

    // TODO stackframe
    public static final int MAX_REGISTER_COUNT = 1000;
    Object[] register;

    public void load(Program prog) {
        this.code = prog.code;
        this.codeSize = prog.codeSize;
        this.ip = prog.initialAddress;
        register = new Object[MAX_REGISTER_COUNT];
    }

    /**
     *
     * @return 0 = ok, else error
     */
    public int cpu() {
        try {
            while (ip < codeSize) {
                int opcode = code[ip];
                ip++;
                switch (opcode) {
                    case INST_GG:
                        return 0;
                    case INST_MOVIR:
                        // movir int, register
                        int operand = ByteUtils.byteToInt(code, ip);
                        ip += 4;
                        int nReg = code[ip++];
                        register[nReg] = operand;
                        break;
                    case INST_ADDI:
                        // addi reg1, reg2, reg3
                        int nReg1 = code[ip++];
                        int nReg2 = code[ip++];
                        int nReg3 = code[ip++];
                        Integer reg1 = (Integer) register[nReg1];
                        Integer reg2 = (Integer) register[nReg2];
                        register[nReg3] = reg1 + reg2;
                        break;
                    case INST_PRINT:
                        nReg = code[ip++];
                        System.out.println(register[nReg]);
                        break;
                    default:
                        throw new RuntimeException("not support opcode: " + opcode);
                }
            }
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

}
