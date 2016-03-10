package org.bohao.vm.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class ByteUtilsTest {

    @Test
    public void testByteToInt() throws Exception {
        byte[] code = new byte[] {0, 0, 0, 1, 1, 1, 1};
        assertEquals(1, ByteUtils.byteToInt(code, 0));
        assertEquals(257, ByteUtils.byteToInt(code, 1));
        assertEquals(0x010101, ByteUtils.byteToInt(code, 2));
        assertEquals(0x01010101, ByteUtils.byteToInt(code, 3));
    }
}