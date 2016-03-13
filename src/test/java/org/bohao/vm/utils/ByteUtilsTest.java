package org.bohao.vm.utils;

import org.bohao.vm.exception.BytecodeParsingException;
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

    @Test
    public void testInttoByte() throws Exception {
        byte[] x = ByteUtils.intToByte(0x01020304);
        assertArrayEquals(x, new byte[]{1, 2, 3, 4});

        x = ByteUtils.intToByte(0x81020304);
        assertArrayEquals(x, new byte[]{(byte) 129, 2, 3, 4});
    }

    @Test(expected = BytecodeParsingException.class)
    public void testInttoByte2() throws Exception {
        byte[] x = ByteUtils.intToByte("r123");
        assertArrayEquals(x, new byte[]{(byte) 129, 2, 3, 4});
    }

    @Test
    public void testRegtoByte() throws Exception {
        byte[] x = ByteUtils.registerToByte("r12");
        assertArrayEquals(x, new byte[]{12});
    }

    @Test(expected = BytecodeParsingException.class)
    public void testRegtoByte2() throws Exception {
        byte[] x = ByteUtils.registerToByte("12");
        assertArrayEquals(x, new byte[]{12});
    }
}