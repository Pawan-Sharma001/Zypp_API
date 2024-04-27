package com.Constants;

public class Base_Uri {
	//=========================DB Configuration================================
	public static String stagedbUrl="jdbc:mysql://35.207.233.77:3306/mobycy";
	
	//================================================================================
	public static String Stage_Uri="http://35.200.242.94/mobycy/api";
	public static String Stage_Uri_Secure="http://35.200.242.94/mobycy/api/secure";
	public static String Pre_Prod_uri="http://35.200.242.94/mobycy/api/secure/";
	public static String BlueTooth_uri="http://35.207.233.77:80/mobycy/api/secure/startNew/bluetooth/EB17925512/ride";
	
	public static String Bolt_API="https://api.bolt.earth/discovery/v1/chargers/from-center";
	public static String terracharge="https://api.terracharge.net/api/v1/client/zypp/map/plot/facility/";
    public static String kazam="https://platform.kazam.in/getDeviceDetails";
 //==================TL DashBaord {Fleet_App}===============================================
    public static String Login="http://35.200.242.94/mobycy/api/secure/user/login";
    public static String data_about_tl_above_the_table="http://35.200.242.94/mobycy/api/ops/secure/get/tl/performance/data";
    public static String api_for_table_of_drivers_under_a_tl="http://35.200.242.94/mobycy/api/ops/secure/get/rider/details/list";
    public static String api_for_leader_board ="http://35.200.242.94/mobycy/api/ops/secure/get/tl/leaderboard";
    public static String api_for_earning_criteria="http://35.200.242.94/mobycy/api/ops/secure/get/tl/earning/slabs";
//=======================Aadhar, Pan, DL OCR======================================================
    public static String Pan_OCR="https://data.bcykal.com/document_ocr/pan/pan_ocr";
    public static String Aadhaar_OCR_Front="https://data.bcykal.com/document_ocr/aadhaar/adhaar_front_ocr";
    public static String Aadhaar_OCR_Back="https://data.bcykal.com/document_ocr/aadhaar/adhaar_back_ocr";
    public static String Dl_Ocr="https://data.bcykal.com/document_ocr/dl/dl_ocr";
    public static String Compare_Ocr_API="https://data.bcykal.com/document_ocr/compare/match_names";
}
