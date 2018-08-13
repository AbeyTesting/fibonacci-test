package apiTests;

import static io.restassured.RestAssured.*;

import org.junit.Assert;

//This class performs automated checks against third interface (@Path("/range")) == baseURL/fib/range
public class Interface_3 
{

	public void testResponseCode() 
	{
		int statuscode = get("baseURL/fib/range").getStatusCode();
		Assert.assertEquals("Status Check Failed!", 200, statuscode);
		System.out.println("Actual response stautus code is: "+ statuscode);
	}
	
	public void testContentType() 
	{
		String contentType = get("baseURL/fib/range").getContentType();
		Assert.assertTrue(contentType.contains("json"));
	}

}
