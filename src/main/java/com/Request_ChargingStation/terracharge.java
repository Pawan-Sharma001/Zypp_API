package com.Request_ChargingStation;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class terracharge {
	@Test
	public static void terracharge_API()
	{
	given()
	.header("Content-Type","application/json")
	//.body(com.Body.Body_Zypp_App_API.chargingstations)
	.when().get(com.Constants.Base_Uri.terracharge)
	.then().statusCode(202).log().all();
}

}
