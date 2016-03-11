package org.bohao.vm;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class Program {

    public byte[] code;
    public int codeSize;

    // start point, main
    public int initialAddress = 0;
    public FunctionSymbol[] functionPool;

    public Program(byte[] code, int codeSize, FunctionSymbol[] pool) {
        this.code = code;
        this.codeSize = codeSize;
        this.functionPool = pool;
    }

    public Program(byte[] code, int codeSize) {
        this.code = code;
        this.codeSize = codeSize;
        this.functionPool = new FunctionSymbol[0];
    }

}
