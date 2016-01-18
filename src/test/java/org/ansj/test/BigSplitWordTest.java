package org.ansj.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

import junit.framework.TestCase;
import org.ansj.util.MyStaticValue;

public class BigSplitWordTest extends TestCase {
	
	public void testCRFSplit() {
		List<String> cut = MyStaticValue.getCRFSplitWord().cut("协会主席亚拉·巴洛斯说他们是在1990年开始寻找野生金刚鹦鹉的");
		Set<String> words = new HashSet<String>(cut) ;
		Assert.assertTrue(words.contains("亚拉·巴洛斯")) ;
	}
}
