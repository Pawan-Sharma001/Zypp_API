package com.Request_ChargingStation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import io.restassured.response.Response;
@Test
public class Kazam {
	
	public static void Kazam_API()
	{
	given()
	.queryParam("loc", "[28.404297,77.058925]")
	.queryParam("fullAddress", "true")
	
	.header("Content-Type","application/json")
	.header("Authorization","Bearer ywjNHF2uamzD.eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpYXQiOjE3MTAyMzUxMTY4MjIsImVhdCI6MTcxODAxMTExNjgyMn0.hHh-Smf6BW_G_dDbh3aVXPRQw8YeQuUXPI6DH5CBDzc")
	.header("Token","7e262366694dd80a043d453154898866a63fe4cf855888b79b3dca2c7e4bbb30")
	//.body(com.Body.Body_Zypp_App_API.chargingstations)
	.when().get(com.Constants.Base_Uri.kazam)
	.then().statusCode(200).log().all();
    
}

}
