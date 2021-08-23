package com.cal;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestApiTest {

	private RestApi restApi;
	
	@Before
	public void setUp() throws Exception {
		restApi=new RestApi();
	}
	

	@Test(timeout = 6000)
	public void restApiTest() {
		List<String> list=restApi.getCountries();
		assertEquals(3, list.size());
	}


	@After
	public void tearDown() throws Exception {
		restApi=null;
	}

}
