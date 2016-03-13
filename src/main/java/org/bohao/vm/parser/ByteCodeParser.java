package org.bohao.vm.parser;

import org.antlr.v4.runtime.TokenStream;
import org.bohao.vm.FunctionSymbol;
import org.bohao.vm.Instruction;
import org.bohao.vm.InstructionSetDefinition;
import org.bohao.vm.exception.BytecodeParsingException;
import org.bohao.vm.utils.ByteUtils;

import java.util.ArrayList;

/**
 *
 * Created by bohao on 2016/3/12.
 */
public class ByteCodeParser extends ByteParser {
    public ArrayList<Byte> code = new ArrayList<>();
    public ArrayList<FunctionSymbol> funcPool = new ArrayList<>();
    int ip = 0;

    public ByteCodeParser(TokenStream input) {
        super(input);
    }

    @Override
    void addFunction(String name, int nArgs) {
        super.addFunction(name, nArgs);
    }

    @Override
    void addLabel(String name) {
        System.out.println("Label " + name);
    }

    @Override
    void addCode(String instruction) {
        System.out.println("Instruction " + instruction);
    }

    @Override
    void addCode(String instruction, String a) {
        System.out.println("Instruction " + instruction + " " + a);
    }

    @Override
    void addCode(String instruction, String a, String b) {
        System.out.printf("Instruction %s %s, %s%n", instruction, a, b);
        Instruction op = addOperator(instruction);
        addOperand(op.a, a);
        addOperand(op.b, b);
    }

    @Override
    void addCode(String instruction, String a, String b, String c) {
        System.out.printf("Instruction %s %s, %s, %s%n", instruction, a, b, c);
        Instruction op = addOperator(instruction);
        addOperand(op.a, a);
        addOperand(op.b, b);
        addOperand(op.c, c);
    }

    @Override
    void gameOver() {
        super.gameOver();
    }

    protected Instruction addOperator(String instruction)  {
        Instruction ins;
        try {
            ins = findInstruction(instruction);
        } catch (BytecodeParsingException e) {
            throw new RuntimeException(e);
        }
        code.add((byte) ins.id);
        return ins;
    }

    void addOperand(int opType, String op) {
        byte[] bytes;
        try {
            bytes = handleParam(opType, op);
        } catch (BytecodeParsingException e) {
            throw new RuntimeException(e);
        }
        for (byte b : bytes) {
            code.add(b);
        }
    }

    protected Instruction findInstruction(String name) throws BytecodeParsingException {
        for (Instruction i : InstructionSetDefinition.IS) {
            if (i.name.equals(name.toLowerCase()))
                return i;
        }

        throw new BytecodeParsingException(name + " instruction not find");
    }

    protected byte[] handleParam(int type, String operand) throws BytecodeParsingException{
        switch (type) {
            case Instruction.TYPE_INT:
                return ByteUtils.intToByte(operand);
            case Instruction.TYPE_REGISTER:
                return ByteUtils.registerToByte(operand);
            case Instruction.TYPE_LABEL:
                // TODO
                return new byte[] {0};
            case Instruction.TYPE_FUNC:
                // TODO
                return new byte[] {0};
        }

        throw new RuntimeException("unsupported operand type: " + operand);
    }


}
