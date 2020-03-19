package com.srijit.maven.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Deletefirst2ATest {
	
	/* TODO LIST
	 * 1. first position ABCD=>BCD --success
	 * 2. first 2 position AACD=>CD--success
	 * 3. second position BACD=>BCD--success
	 * 4. other position BBAA=>BBAA--success
	 * 5. twoA AA=>""
	 */

	@Test
	    void firstposition()
		{
		Delete2a delete2a=new Delete2a();
		assertEquals("BCD",delete2a.execute("ABCD"));
		}
	@Test
	  void first2position()
	  {
		  	Delete2a delete2a=new Delete2a();
			assertEquals("CD", delete2a.execute("AACD"));
		  
	  }
	@Test
	  void secondposition()
	  {
		  	Delete2a delete2a=new Delete2a();
			assertEquals("BCD", delete2a.execute("BACD"));
		  
	  }
	@Test
	  void otherposition()
	  {
		  	Delete2a delete2a=new Delete2a();
			assertEquals("BBAA", delete2a.execute("BBAA"));
		  
	  }
	@Test
	  void twoA()
	  {
		  	Delete2a delete2a=new Delete2a();
			assertEquals("", delete2a.execute("AA"));
		  
	  }
	
	

}
