package org.ansj.test;

import junit.framework.TestCase;
import org.ansj.util.MyStaticValue;
import org.nlpcn.commons.lang.util.IOUtil;

import java.io.BufferedReader;
import java.io.IOException;

public class SplitWordTest extends TestCase {

    public void cohesionTest() throws IOException {
        BufferedReader reader = IOUtil.getReader(MyStaticValue.userLibrary, IOUtil.UTF8);

        String temp = null;

        long start = System.currentTimeMillis();
        while ((temp = reader.readLine()) != null) {
            String word = temp.split("\t")[0];
            double value = MyStaticValue.getCRFSplitWord().cohesion(word);
            System.out.println(word + "\t" + value);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
