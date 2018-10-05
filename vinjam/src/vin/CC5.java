package vin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CC5 {
	CC4 v=new CC4();
	@Test
	public void f() throws InterruptedException{
		v.mai();
	}
  @BeforeTest
  public void beforeTest() {
	  v.reg();
	  
  }

  @AfterTest
   public void afterTest() {
	  v.cnf();
  }

  @BeforeSuite
  public void beforeSuite() {
	  v.home();
  }

  @AfterSuite
  public void afterSuite() {
	  v.TearDown();
  }

}
