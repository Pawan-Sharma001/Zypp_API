package com.Request_ChargingStation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Bolt {
	@Test
	public static void Bolt_API()
	{
	given().queryParam("latitude", "28.404297")
	       .queryParam("longitude", "77.058925")
	       .queryParam("radius", "1000")
	       .queryParam("vehicleType", "FOUR_WHEELER")
	       .queryParam("isVerified", "false")
	       .queryParam("usageType", "PRIVATE")
	       .queryParam("isAvailable", "false")
	       //.queryParam("connectorType", "TYPE_D%2C%20CCS2%2C%20CHAdeMO")
	       
	.header("Content-Type","application/json")
	.body(com.Body.Body_Zypp_App_API.chargingstations)
	.when().get(com.Constants.Uri.Bolt_API)
	.then().statusCode(200).log().all();
}

}
