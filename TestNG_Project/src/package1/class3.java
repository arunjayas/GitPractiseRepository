package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class3 
{
	@Test(groups= {"Smoke"})
	public void method1()
	{
		System.out.println("class3_method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("class3_method2");
	}
	
	@Test
	public void method3()
	{
		System.out.println("class3_method3");
	}
	
	@Test
	public void method4()
	{
		System.out.println("class3_method4");
	}
	
	
}
