package package1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1 
{
	
	@Test
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
		System.out.println("This line has been added from GIT 2 FOLDER");
	}
	
	
	
	
}
