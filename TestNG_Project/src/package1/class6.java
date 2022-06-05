package package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class class6 
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="Username 1";
		data[0][1]="Password 1";
		
		data[1][0]="Username 2";
		data[1][1]="Password 2";
		
		data[2][0]="Username 3";
		data[2][1]="Password 3";
		
		return data;
	}
	
	@Test(dataProvider ="getData")
	public void dataProviderTesting(String a,String b)
	{
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
}
