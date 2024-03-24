package com.Request_ChargingStation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class Charging_Station {
	
	public static String user_Name="9958934222";
	public static String Pass="$2a$15$BCTVycaXg6WM5qdQg.wUKubTzFA/zeM8xuytgMCY60AElXjZtIvs6";
	
	@Test
	public static void Charging_Stations()
	{
		given().auth().basic(user_Name, Pass).queryParam("latitude", "28.404297")
				.queryParam("longitude", "77.058925")
				.header("Content-Type","application/json")
				.body(com.Body.Body_Zypp_App_API.chargingstations)
				.when().get(com.Constants.Uri.Pre_Prod_uri.concat("chargingstations"))
				.then().statusCode(200).log().all();
	}

}
