package com.cal;
import java.util.*;
public class RestApi {
	public List<String> getCountries(){
		//external api ...
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ex) {}
		
		return Arrays.asList("india","usa","canada");
		
	}
}
