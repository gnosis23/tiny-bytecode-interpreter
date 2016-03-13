package org.bohao.vm.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.bohao.vm.Instruction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * Created by bohao on 2016/3/12.
 */
public class ByteCodeParserTest {
    private ByteCodeParser parser;

    @Before
    public void setUp() throws Exception {
        String inputFile;
        inputFile = "t0.vm";


        InputStream is;
        is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ByteLexer lexer = new ByteLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new ByteCodeParser(tokens);

    }

    @Test
    public void testAddFunction() throws Exception {
        parser.line();
    }


    @Test
    public void testFindInstruction() throws Exception {
        Instruction x = parser.findInstruction("movir");
        Assert.assertEquals("movir", x.name);
    }
}