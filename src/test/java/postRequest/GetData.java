package postRequest;

import org.apache.http.util.Asserts;
import org.codehaus.groovy.ast.stmt.AssertStatement;
import org.hamcrest.Matcher;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GetData 
{
	@Test 
	public void testResponseCode() throws JSONException
	{
	
		RestAssured.baseURI ="https://sandbox.alloy.co/v1";
//second commitssss
		
		RequestSpecification request = RestAssured.given().auth().basic("26zelNJ6QuHeYgA0ePZMhROu0lOeEx4QY", "MjHRUnAgP8aR4D3bA3JipKJE3qpQI9ry");
	
		
		JSONObject requestParameters = new JSONObject();
		requestParameters.put("phone_number", "18042562188");
		requestParameters.put( "name_first","Thomas");
		requestParameters.put(  "name_last", "Nicholas");
		requestParameters.put("email_address", "tommy@alloy.co");
	 requestParameters.put("birth_date", "1985-01-23");
	 requestParameters.put("address_line_1", "1717 E Test St");
	 requestParameters.put("address_city", "Richmond");
	 requestParameters.put( "address_state", "VA");
	 requestParameters.put("document_ssn", "123456789");
	 requestParameters.put("address_postal_code", "23220");
	 requestParameters.put("address_country_code", "US");
	 requestParameters.put("social_twitter", "tommyrva");	
	 
	 request.header("authorization", "Basic RllpSUJmUEtsNjI2RDJpajBOaFFoUzRSenhlb3RqZXY6WHJ3Ym1HZ1pKc0xBMDBYN3FaYkNuc2lBTG56cVMyWWs=");
	// request.header("Content-Type", "application/json");
	 request.contentType("application/json");
	// request.
	 request.body(requestParameters.toString());
//	 request.auth().basic("FYiIBfqPKl626D2ij0NhQhS4Rzxeotjev", "XrwbmGgZJsLA00X7qZbCnsiALnzqS2Yk");
	 System.out.println("objects "+ requestParameters.toString());
	// request.header("authorization", "Basic dsd");
	 Response response = request.post("/evaluations");
	 //String authToken = new String);
	// System.out.println("rwwww " +authToken);
	 
	 
	 
	 System.out.println("rwwww "+ request.post("/evaluations"));
	 System.out.println("response "+ response.body().asString());
	 
	 
	 
	 
	 
	 
//	
	 
	 
	 System.out.println("The status code recieved:sssssssssssssssssss " +response.getStatusCode());
//	 int statusCode = response.getStatusCode();
//	 Assert.assertEquals(statusCode, "201");
	// String body = response.getBody().toString();
	 
	 

	}
	
	

	
}