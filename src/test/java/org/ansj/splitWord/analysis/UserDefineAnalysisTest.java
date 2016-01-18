package org.ansj.splitWord.analysis;

import junit.framework.TestCase;
import org.ansj.library.UserDefineLibrary;

import java.io.IOException;

public class UserDefineAnalysisTest extends TestCase {

    public void test() throws IOException {
        UserDefineLibrary.insertWord("金水区", "ad", 1000);
        UserDefineLibrary.insertWord("渝北区", "ad", 1000);
        UserDefineLibrary.insertWord("金童路", "ad", 1000);
        UserDefineLibrary.insertWord("奥山", "ad", 1000);
        UserDefineLibrary.insertWord("来自大", "ab", 1000);
        UserDefineLibrary.insertWord("自大学", "ab", 2000);
        UserDefineLibrary.insertWord("网大学", "ab", 1000);

        System.out.println(UserDefineAnalysis.parse("重庆重庆市渝北区金童路奥山别墅162"));
        System.out.println(UserDefineAnalysis.parse("河南省郑州市金水区金水区农科路与文博西路交叉口向东２００米路南"));
        System.out.println(UserDefineAnalysis.parse("来自大学生小说网大学"));


    }

}
