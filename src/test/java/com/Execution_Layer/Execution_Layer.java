package com.Execution_Layer;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class Execution_Layer {
	
	@Test(priority = 0)
	public static void BlueTooth_Zypp_App_Request() throws IOException
	{
	com.Request_BlueTooth.BlueTooth_Zypp_App_Request.BlueTooth();
	
	}
	@Test(priority = 1)
	public static void Request_ChargingStation()
	{
		com.Request_ChargingStation.Kazam.Kazam_API();	
	}

}
