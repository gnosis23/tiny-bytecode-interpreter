package org.bohao.vm;

/**
 * Function infos
 * Created by bohao on 2016/3/11.
 */
public class FunctionSymbol {
    public int address;

    public String functionName;

    public int nParams;

    public int nLocals;

    public FunctionSymbol(String functionName, int address, int nParams, int nLocals) {
        this.address = address;
        this.functionName = functionName;
        this.nParams = nParams;
        this.nLocals = nLocals;
    }
}
