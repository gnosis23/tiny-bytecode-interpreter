package org.bohao.vm.parser;

import org.antlr.v4.runtime.TokenStream;
import org.bohao.vm.FunctionSymbol;
import org.bohao.vm.Instruction;
import org.bohao.vm.exception.BytecodeParsingException;

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
    }

    @Override
    void addCode(String instruction, String a, String b, String c) {
        System.out.printf("Instruction %s %s, %s, %s%n", instruction, a, b, c);
    }

    private void handleParam(int type, String operand) throws BytecodeParsingException{
        switch (type) {
            case Instruction.TYPE_INT:
                try {
                    int num = Integer.valueOf(operand);
                } catch (NumberFormatException e) {
                    throw new BytecodeParsingException(operand + " cannot be int");
                }
                break;
        }
    }
}
