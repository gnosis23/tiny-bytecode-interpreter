package org.bohao.vm.utils;

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
}
