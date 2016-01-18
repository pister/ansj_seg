package org.ansj.test;

import java.util.List;

import junit.framework.TestCase;
import org.ansj.domain.Term;
import org.ansj.recognition.NatureRecognition;
import org.ansj.splitWord.analysis.ToAnalysis;

/**
 * 词性标注的一个例子
 * 
 * @author ansj
 * 
 */
public class NatureRecognitionTest extends TestCase {
	
	public void test(){
		String str = "结婚的和尚未结婚的孙建是一个好人";
		List<Term> terms = ToAnalysis.parse(str);
		new NatureRecognition(terms).recognition();
		System.out.println(terms);
	}
}
