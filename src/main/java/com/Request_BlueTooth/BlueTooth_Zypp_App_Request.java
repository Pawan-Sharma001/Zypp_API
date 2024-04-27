package com.Request_BlueTooth;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BlueTooth_Zypp_App_Request {
	
	public static String user_Name="9469469469";
	public static String pass="$2a$15$GzhMI.YnJM2tUG3L17FR5.oZBxwuiTKWMgbC4WEicvxXuHojZLjmW";
	@Test
	public static void BlueTooth()
	{
	given().auth().basic(user_Name,pass)
	.queryParam("isInsured","true")
	.queryParam("idType","1").queryParam("id",":1")
	.queryParam("latitude","28.45") //("latitude","28.452652")
	.queryParam("longitude","77.07")//("longitude","77.0701033")
	.queryParam("imei","864356064443717")
	.queryParam("rideStatus", "3")
	
	.header("Authorization",com.Constants.Authorization.Authorization)
	.header("Cookie", "JSESSIONID=CDFE6A7383177EABC2F3F2C845AC0E69")
	
	.body(com.Body.Body_Zypp_App_API.BlueTooth_Body)
	.when()
	.post(com.Constants.Base_Uri.BlueTooth_uri)
	.then().statusCode(200).log().all();
	}
}






