package com.yoogesh.hello;

public class hello {
	
	
	public String greeting (String name)
	{
		if ( name == null)
		{
			throw new IllegalArgumentException();	
		}
		
		return "Hello " + name;
	}

}


/* i changed it second time */