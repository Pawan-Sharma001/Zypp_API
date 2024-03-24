package com.Request_ChargingStation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

@Test
public class Kazam {
	
	public static void Kazam_API()
	{
	given()
	.queryParam("loc", "[28.404297,77.058925]")
	.queryParam("fullAddress", "true")
	
	.header("Content-Type","application/json")
	.body(com.Body.Body_Zypp_App_API.chargingstations)
	.when().get(com.Constants.Uri.kazam)
	.then().statusCode(202).log().all();
}

}
