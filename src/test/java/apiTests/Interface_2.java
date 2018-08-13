package apiTests;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

//This class performs automated checks against second interface (@Path("/{index}")) == baseURL/fib/{index}
public class Interface_2 
{

	public void testResponseCode() 
	{
		int statuscode = get("baseURL/fib/{index}").getStatusCode();
		Assert.assertEquals("Status Check Failed!", 200, statuscode);
		System.out.println("Actual response stautus code is: "+ statuscode);
	}
	
	public void testContentType() 
	{
		String contentType = get("baseURL/fib/{index}").getContentType();
		Assert.assertTrue(contentType.contains("json"));
	}

}
