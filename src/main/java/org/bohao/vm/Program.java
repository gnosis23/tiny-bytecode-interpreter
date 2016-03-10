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

    public Program(byte[] code, int codeSize) {
        this.code = code;
        this.codeSize = codeSize;
    }

}
