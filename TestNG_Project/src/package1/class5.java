package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class5 
{
	@Test(groups= {"Smoke"})
	public void method1()
	{
		System.out.println("class5_method1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("class5_method2");
	}
	
	@Test
	public void method3()
	{
		System.out.println("class5_method3");
	}
	
	@Parameters({"URL"})
	@Test
	public void method4(String url)
	{
		System.out.println("class5_method4"+url);
	}
	
	
}
