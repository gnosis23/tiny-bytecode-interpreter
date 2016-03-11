package org.bohao.vm;

import org.bohao.vm.utils.ByteUtils;

import java.util.Objects;

import static org.bohao.vm.InstructionSetDefinition.*;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class Interp {
    public static final int MAX_STACK_DEPTH = 1000;
    public static final int MAX_REGISTER_COUNT = 100;

    int ip = 0;
    byte[] code;

    int codeSize;

    int sp = 0; // stack pointer
    StackFrame[] stackFrames = new StackFrame[MAX_STACK_DEPTH];
    FunctionSymbol[] functionPool;

    public void load(Program prog) {
        this.code = prog.code;
        this.codeSize = prog.codeSize;
        this.functionPool = prog.functionPool;
        initStack(functionPool);
    }

    private void initStack(FunctionSymbol[] functionPool) {
        FunctionSymbol main = null;
        for (FunctionSymbol aFunctionPool : functionPool) {
            if (Objects.equals(aFunctionPool.functionName, "main")) {
                main = aFunctionPool;
                break;
            }
        }

        if (main == null) {
            stackFrames[sp] = new StackFrame(0, 0);
            this.ip = 0;
        }
        else {
            stackFrames[sp] = new StackFrame(main.nLocals, main.address);
            this.ip = main.address;
        }
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
                        stackFrames[sp].registers[nReg] = operand;
                        break;
                    case INST_ADDI:
                        // addi reg1, reg2, reg3
                        int nReg1 = code[ip++];
                        int nReg2 = code[ip++];
                        int nReg3 = code[ip++];
                        Integer reg1 = (Integer) stackFrames[sp].registers[nReg1];
                        Integer reg2 = (Integer) stackFrames[sp].registers[nReg2];
                        stackFrames[sp].registers[nReg3] = reg1 + reg2;
                        break;
                    case INST_PRINT:
                        nReg = code[ip++];
                        System.out.println(stackFrames[sp].registers[nReg]);
                        break;
                    case INST_JMPE:
                        nReg1 = code[ip++];
                        nReg2 = code[ip++];
                        int address = ByteUtils.byteToInt(code, ip);
                        ip += 4;
                        if (Objects.equals(stackFrames[sp].registers[nReg1], stackFrames[sp].registers[nReg2])) {
                            ip = address;
                        }
                        break;
                    case INST_JMP:
                        address = ByteUtils.byteToInt(code, ip);
                        ip = address;
                        break;
                    default:
                        throw new RuntimeException("not support opcode: " + opcode);
                }
            }
            System.out.println("Code length error: " + codeSize);
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

}
