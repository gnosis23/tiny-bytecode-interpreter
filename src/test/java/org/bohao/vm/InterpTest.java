package org.bohao.vm;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * Created by bohao on 2016/3/10.
 */
public class InterpTest {
    private Interp interp;

    @Before
    public void setUp() throws Exception {
        interp = new Interp();
    }

    @Test
    public void testgg() throws Exception {
        interp.load(ProgramCases.gg);
        assertEquals(0, interp.cpu());
    }

    @Test
    public void testEasy1() throws Exception {
        interp.load(ProgramCases.easy1);
        assertEquals(0, interp.cpu());
    }

    @Test
    public void testLoop1() throws Exception {
        interp.load(ProgramCases.loop1);
        assertEquals(0, interp.cpu());
    }
}