package vin;

import org.testng.annotations.Test;

public class CC {
	@Test(priority=0)
	public void name(){
		System.out.println("test is sucess");
	}
	@Test(priority=1)
	public void exam(){
		System.out.println("test is pass");
		}
	@Test(priority=2)
	public void first(){
		System.out.println("never failed");
	}
	@Test(priority=3)
	public void jum(){
		System.out.println("fail is next step to pass");
		
	}
	}


