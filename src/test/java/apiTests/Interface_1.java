package apiTests;

import org.junit.Assert;

import static io.restassured.RestAssured.*;
 
// This class performs automated checks against first interface (@Path("/fib")) == baseURL/fib
public class Interface_1 
{
	
	public void testResponseCode() 
	{
		int statuscode = get("baseURL/fib").getStatusCode();
		Assert.assertEquals("Status Check Failed!", 200, statuscode);
		System.out.println("Actual response stautus code is: "+ statuscode);
	}
	
	public void testContentType() 
	{
		String contentType = get("baseURL/fib").getContentType();
		Assert.assertTrue(contentType.contains("json"));
	}
}
