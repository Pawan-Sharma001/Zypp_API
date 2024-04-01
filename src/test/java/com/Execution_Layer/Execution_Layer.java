package com.Execution_Layer;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

public class Execution_Layer {
	
	//@Test(priority = 0)
	public static void BlueTooth_Zypp_App_Request() throws IOException
	{
	com.Request_BlueTooth.BlueTooth_Zypp_App_Request.BlueTooth();
	
	}
	//@Test(priority = 1)
	public static void Request_ChargingStation()
	{
		com.Request_ChargingStation.Kazam.Kazam_API();	
	}
	@Test(priority = 2)
	public static void TL_DashBaord()
	{
	com.TLDashbaord.TL_1_Api_to_login_in_fleet_app_existing_api.TL_Login_With_Valid_Cred();
	com.TLDashbaord.TL_2_data_about_tl_above_the_table.data_about_tl_above_the_table();
	com.TLDashbaord.TL_3_api_for_table_of_drivers_under_a_tl.api_for_table_of_drivers_under_a_tl();
	com.TLDashbaord.TL_4_api_for_leader_board.api_for_leader_board();
	com.TLDashbaord.TL_5_api_for_earning_criteria.api_for_earning_criteria();
	}
}
