package helloJUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.yoogesh.hello.hello;


public class helloTest {
	
	
	private hello h;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	@Before
	public void setUp() throws Exception { h = new hello(); }

	@After
	public void tearDown() throws Exception { h = null; }

	@Test
	public void should_return_name_with_greetings() {
		
		//hello h = new hello();
		String result = h.greeting("yoogesh");
	    Assert.assertNotNull(result);
	    Assert.assertEquals("Hello yoogesh", result);
	    	
		
	} 
	
	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_on_null() {
		
		//hello h = new hello();
		h.greeting(null); 	
		
	}

}
