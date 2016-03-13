package org.bohao.vm.utils;

import org.bohao.vm.exception.BytecodeParsingException;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class ByteUtils {
    public static int byteToInt(byte[] code, int ip) {
        int a = 0;
        for (int i = 0; i < 4; i++) {
            a = (a << 8) + code[ip+i];
        }

        return a;
    }

    public static byte[] intToByte(int a) {
        return new byte[] {
                (byte) ((a >> 24) & 0xff),
                (byte) ((a >> 16) & 0xff),
                (byte) ((a >> 8) & 0xff),
                (byte) (a & 0xff),
        } ;
    }

    public static byte[] intToByte(String a) throws BytecodeParsingException {
        try {
            Integer num = Integer.valueOf(a);
            return intToByte(num);
        } catch (NumberFormatException e) {
            throw new BytecodeParsingException(a + " is not a number");
        }
    }

    public static byte[] registerToByte(String r) throws BytecodeParsingException {
        if (!r.startsWith("r") && !r.startsWith("R"))
            throw new BytecodeParsingException(r + " is not a register");

        int num = Integer.valueOf(r.substring(1));
        return new byte[] {(byte) (num & 0xff)};
    }
}
