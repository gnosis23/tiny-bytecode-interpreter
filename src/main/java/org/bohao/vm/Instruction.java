package org.bohao.vm;

/**
 *
 * Created by bohao on 2016/3/12.
 */
public class Instruction {
    public static final int TYPE_INT = 1;
    public static final int TYPE_REGISTER = 2;
    public static final int TYPE_LABEL = 3;
    public static final int TYPE_FUNC = 4;

    public int a, b, c;
    public int id;
    public String name;
    public int nParams;

    public Instruction(int id, String name) {
        this.id = id;
        this.name = name;
        this.nParams = 0;
    }

    public Instruction(int id, String name, int a) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.nParams = 1;
    }

    public Instruction(int id, String name, int a, int b) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.nParams = 2;
    }

    public Instruction(int id, String name, int a, int b, int c) {
        this.id = id;
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

}