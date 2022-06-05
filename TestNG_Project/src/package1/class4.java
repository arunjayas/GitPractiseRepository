package package1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class4 
{
	@Test
	public void method1()
	{
		System.out.println("class4_method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("class4_method2");
	}
	
	@Test
	public void method3()
	{
		System.out.println("class4_method3");
		Assert.assertTrue(false);
	}
	
	@Test
	public void method4()
	{
		System.out.println("class4_method4");
	}
	
	
}
