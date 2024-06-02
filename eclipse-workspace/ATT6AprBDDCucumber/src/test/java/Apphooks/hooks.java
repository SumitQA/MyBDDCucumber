package Apphooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.de.Aber;

public class hooks {
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("BeforeAll is Executing");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("AfterAll is Executing");
	}
	
	@Before ("@Regression")
	public void  beforeHook1 ()
	{
		System.out.println("Before Hook1 is executing");
	}
	
	@BeforeStep ("@Regression")
	public void beforestep()
		{
			System.out.println("BeforeStep");
		}
	
	@AfterStep
	public void afterstep()
	{
		System.out.println("afterStep");
	}

//	
//	@Before (order = 2)
//	public void  beforeHook2 ()
//	{
//		System.out.println("Before Hook2 is executing");
//	}
  @After ("@sanity")
  public void afetrHook1()
  {
	  System.out.println("after hook 1 is Executing");
  } 
//  @After (order = 2)
//  public void afetrHook2()
//  {
//	  System.out.println("after hook 2 is Executing");
//  }
}
