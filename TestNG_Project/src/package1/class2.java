package package1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class class2 
{
	@Test(groups= {"Smoke"})
	public void method1()
	{
		System.out.println("class1_method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("class1_method2");
	}
	
	
	
	@Test
	public void method3()
	{
		System.out.println("class1_method3");
	}
	
	@Test
	public void method4()
	{
		System.out.println("class1_method4");
	}
}
