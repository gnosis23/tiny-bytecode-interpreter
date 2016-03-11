package org.bohao.vm;

/**
 * a stackFrame consists of:
 * - registers
 * - local variables
 * - start code address
 *
 *
 * Created by bohao on 2016/3/11.
 */
public class StackFrame {
    public static final int MAX_REGISTER_COUNT = 100;
    public Object[] registers = new Object[MAX_REGISTER_COUNT];
    public Object[] locals;
    public int retAddress;

    public StackFrame(int nlocals, int retAddress) {
        this.locals = new Object[nlocals];
        this.retAddress = retAddress;
    }

    public StackFrame(int retAddress) {
        this(0, retAddress);
    }

    public void setRegisterAt(int n, Object value) {
        registers[n] = value;
    }

    public void setLocalsAt(int n, Object value) {
        locals[n] = value;
    }

    public Object getRegistersAt(int n) {
        return registers[n];
    }

    public Object getLocalsAt(int n) {
        return locals[n];
    }
}
