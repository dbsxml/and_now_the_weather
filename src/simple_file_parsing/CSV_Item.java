package simple_file_parsing;

import java.util.HashMap;

public class CSV_Item {

	/*
	 *  A CSV_Item Object holds every entry (column) of a .csv row 
	 *  there are 38 entries (1-38 )per row. furthermore it has 
	 *  an itemID
	 */
	private HashMap hash = new HashMap();
//0  item ID
	private int itemID;
	
//1    WBANNO  [5 chars]  cols 1 -- 5 
//       The station WBAN number.
	private  String WBANNO = "wbanno";

	//2    UTC_DATE  [8 chars]  cols 7 -- 14 
//       The UTC date of the observation.
	private  String UTC_DATE;

//3    UTC_TIME  [4 chars]  cols 16 -- 19 
//       The UTC time of the observation. Time is the end of the observed 
//       hour, so the 0000 hour is actually the last hour of the previous 
//       day's observation (starting just after 11:00 PM through midnight).
	private  String UTC_TIME;

//4    LST_DATE  [8 chars]  cols 21 -- 28 
//       The Local Standard Time (LST) date of the observation.
	private  String LST_DATE;
//5    LST_TIME  [4 chars]  cols 30 -- 33 
//       The Local Standard Time (LST) time of the observation. Time is the 
//       end of the observed hour (see UTC_TIME description).
	private  String LST_TIME;
//6    CRX_VN  [6 chars]  cols 35 -- 40 
//       The version number of the station datalogger program that was in 
//       effect at the time of the observation. Note: This field should be 
//       treated as text (i.e. string).
	private  String CRX_VN;
//7    LONGITUDE  [7 chars]  cols 42 -- 48 
//       Station longitude, using WGS-84.
	private  String LONGITUDE;
//8    LATITUDE  [7 chars]  cols 50 -- 56 
//       Station latitude, using WGS-84.
	private  String LATITUDE;
//9    T_CALC  [7 chars]  cols 58 -- 64 
//       Average air temperature, in degrees C, during the last 5 minutes 
//       of the hour. See Note F.
	private  String T_CALC;
//10   T_HR_AVG  [7 chars]  cols 66 -- 72 
//       Average air temperature, in degrees C, for the entire hour. See Note 
//       F.
	private  String T_HR_AVG;
//11   T_MAX  [7 chars]  cols 74 -- 80 
//       Maximum air temperature, in degrees C, during the hour. See Note 
//       F.
	private  String T_MAX;
//12   T_MIN  [7 chars]  cols 82 -- 88 
//       Minimum air temperature, in degrees C, during the hour. See Note 
//       F.
	private  String T_MIN;
//13   P_CALC  [7 chars]  cols 90 -- 96 
//       Total amount of precipitation, in mm, recorded during the hour. See 
//       Note F.
	private  String P_CALC;
//14   SOLARAD  [6 chars]  cols 98 -- 103 
//       Average global solar radiation, in watts/meter^2.
	private  String SOLARAD;
//15   SOLARAD_FLAG  [1 chars]  cols 105 -- 105 
//       QC flag for average global solar radiation. See Note G.
	private  String  SOLARAD_FLAG;
//16   SOLARAD_MAX  [6 chars]  cols 107 -- 112 
//       Maximum global solar radiation, in watts/meter^2.
	private  String SOLARAD_MAX;
//17   SOLARAD_MAX_FLAG  [1 chars]  cols 114 -- 114 
//       QC flag for maximum global solar radiation. See Note G.
	private  String SOLARAD_MAX_FLAG;
//18   SOLARAD_MIN  [6 chars]  cols 116 -- 121 
//       Minimum global solar radiation, in watts/meter^2.
	private  String SOLARAD_MIN;
//19   SOLARAD_MIN_FLAG  [1 chars]  cols 123 -- 123 
//       QC flag for minimum global solar radiation. See Note G.
	private  String SOLARAD_MIN_FLAG;
//20   SUR_TEMP_TYPE  [1 chars]  cols 125 -- 125 
//       Type of infrared surface temperature measurement: 'R' denotes raw 
//       (uncorrected), 'C' denotes corrected, and 'U' when unknown/missing. 
//       See Note H.
	private  String SUR_TEMP_TYPE;
//21   SUR_TEMP  [7 chars]  cols 127 -- 133 
//       Average infrared surface temperature, in degrees C. See Note H.
	private  String SUR_TEMP;
//22   SUR_TEMP_FLAG  [1 chars]  cols 135 -- 135 
//       QC flag for infrared surface temperature. See Note G.
	private  String SUR_TEMP_FLAG;
//23   SUR_TEMP_MAX  [7 chars]  cols 137 -- 143 
//       Maximum infrared surface temperature, in degrees C.
	private  String SUR_TEMP_MAX;
//24   SUR_TEMP_MAX_FLAG  [1 chars]  cols 145 -- 145 
//       QC flag for infrared surface temperature maximum. See Note G.
	private  String SUR_TEMP_MAX_FLAG;
//25   SUR_TEMP_MIN  [7 chars]  cols 147 -- 153 
//       Minimum infrared surface temperature, in degrees C.
	private  String SUR_TEMP_MIN;
//26   SUR_TEMP_MIN_FLAG  [1 chars]  cols 155 -- 155 
//       QC flag for infrared surface temperature minimum. See Note G.
	private  String SUR_TEMP_MIN_FLAG;
//27   RH_HR_AVG  [5 chars]  cols 157 -- 161 
//       RH average for hour, in percentage. See Note I.
	private  String RH_HR_AVG;
//28   RH_HR_AVG_FLAG  [1 chars]  cols 163 -- 163 
//       QC flag for RH average. See Note G.
	private  String RH_HR_AVG_FLAG;
//29   SOIL_MOISTURE_5  [7 chars]  cols 165 -- 171 
//       Average soil moisture at 5 cm below the surface, in m^3/m^3. See 
//       Note K.
	private  String SOIL_MOISTURE_5;
//30   SOIL_MOISTURE_10  [7 chars]  cols 173 -- 179 
//       Average soil moisture at 10 cm below the surface, in m^3/m^3. See 
//       Note K.
	private  String SOIL_MOISTURE_10;
//31   SOIL_MOISTURE_20  [7 chars]  cols 181 -- 187 
//       Average soil moisture at 20 cm below the surface, in m^3/m^3. See 
//       Note K.
	private  String SOIL_MOISTURE_20;
//32   SOIL_MOISTURE_50  [7 chars]  cols 189 -- 195 
//       Average soil moisture at 50 cm below the surface, in m^3/m^3. See 
//       Note K.
	private static String SOIL_MOISTURE_50;
//33   SOIL_MOISTURE_100  [7 chars]  cols 197 -- 203 
//       Average soil moisture at 100 cm below the surface, in m^3/m^3. See 
//       Note K.
	private  String SOIL_MOISTURE_100;
//34   SOIL_TEMP_5  [7 chars]  cols 205 -- 211 
//       Average soil temperature at 5 cm below the surface, in degrees C. 
//       See Note K.
	private static String SOIL_TEMP_5;
//35   SOIL_TEMP_10  [7 chars]  cols 213 -- 219 
//       Average soil temperature at 10 cm below the surface, in degrees C. 
//       See Note K.
	private  String SOIL_TEMP_10;
//36   SOIL_TEMP_20  [7 chars]  cols 221 -- 227 
//       Average soil temperature at 20 cm below the surface, in degrees C. 
//       See Note K.
	private  String SOIL_TEMP_20;
//37   SOIL_TEMP_50  [7 chars]  cols 229 -- 235 
//       Average soil temperature at 50 cm below the surface, in degrees C. 
//       See Note K.
	private  String SOIL_TEMP_50;
//38   SOIL_TEMP_100  [7 chars]  cols 237 -- 243 
//       Average soil temperature at 100 cm below the surface, in degrees 
//       C. See Note K.
	private String SOIL_TEMP_100;

	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getWBANNO() {
		return WBANNO;
	}
	public void setWBANNO(String wBANNO) {
		WBANNO = wBANNO;
	}
	public String getUTC_DATE() {
		return UTC_DATE;
	}
	public void setUTC_DATE(String uTC_DATE) {
		UTC_DATE = uTC_DATE;
	}
	public String getUTC_TIME() {
		return UTC_TIME;
	}
	public void setUTC_TIME(String uTC_TIME) {
		UTC_TIME = uTC_TIME;
	}
	public String getLST_DATE() {
		return LST_DATE;
	}
	public void setLST_DATE(String lST_DATE) {
		LST_DATE = lST_DATE;
	}
	public String getLST_TIME() {
		return LST_TIME;
	}
	public void setLST_TIME(String lST_TIME) {
		LST_TIME = lST_TIME;
	}
	public String getCRX_VN() {
		return CRX_VN;
	}
	public void setCRX_VN(String cRX_VN) {
		CRX_VN = cRX_VN;
	}
	public String getLONGITUDE() {
		return LONGITUDE;
	}
	public void setLONGITUDE(String lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}
	public String getLATITUDE() {
		return LATITUDE;
	}
	public void setLATITUDE(String lATITUDE) {
		LATITUDE = lATITUDE;
	}
	public String getT_CALC() {
		return T_CALC;
	}
	public void setT_CALC(String t_CALC) {
		T_CALC = t_CALC;
	}
	public String getT_HR_AVG() {
		return T_HR_AVG;
	}
	public void setT_HR_AVG(String t_HR_AVG) {
		T_HR_AVG = t_HR_AVG;
	}
	public String getT_MAX() {
		return T_MAX;
	}
	public void setT_MAX(String t_MAX) {
		T_MAX = t_MAX;
	}
	public String getT_MIN() {
		return T_MIN;
	}
	public void setT_MIN(String t_MIN) {
		T_MIN = t_MIN;
	}
	public String getP_CALC() {
		return P_CALC;
	}
	public void setP_CALC(String p_CALC) {
		P_CALC = p_CALC;
	}
	public String getSOLARAD() {
		return SOLARAD;
	}
	public void setSOLARAD(String sOLARAD) {
		SOLARAD = sOLARAD;
	}
	public String getSOLARAD_FLAG() {
		return SOLARAD_FLAG;
	}
	public void setSOLARAD_FLAG(String sOLARAD_FLAG) {
		SOLARAD_FLAG = sOLARAD_FLAG;
	}
	public String getSOLARAD_MAX() {
		return SOLARAD_MAX;
	}
	public void setSOLARAD_MAX(String sOLARAD_MAX) {
		SOLARAD_MAX = sOLARAD_MAX;
	}
	public String getSOLARAD_MAX_FLAG() {
		return SOLARAD_MAX_FLAG;
	}
	public void setSOLARAD_MAX_FLAG(String sOLARAD_MAX_FLAG) {
		SOLARAD_MAX_FLAG = sOLARAD_MAX_FLAG;
	}
	public String getSOLARAD_MIN() {
		return SOLARAD_MIN;
	}
	public void setSOLARAD_MIN(String sOLARAD_MIN) {
		SOLARAD_MIN = sOLARAD_MIN;
	}
	public String getSOLARAD_MIN_FLAG() {
		return SOLARAD_MIN_FLAG;
	}
	public void setSOLARAD_MIN_FLAG(String sOLARAD_MIN_FLAG) {
		SOLARAD_MIN_FLAG = sOLARAD_MIN_FLAG;
	}
	public String getSUR_TEMP_TYPE() {
		return SUR_TEMP_TYPE;
	}
	public void setSUR_TEMP_TYPE(String sUR_TEMP_TYPE) {
		SUR_TEMP_TYPE = sUR_TEMP_TYPE;
	}
	public String getSUR_TEMP() {
		return SUR_TEMP;
	}
	public void setSUR_TEMP(String sUR_TEMP) {
		SUR_TEMP = sUR_TEMP;
	}
	public String getSUR_TEMP_FLAG() {
		return SUR_TEMP_FLAG;
	}
	public void setSUR_TEMP_FLAG(String sUR_TEMP_FLAG) {
		SUR_TEMP_FLAG = sUR_TEMP_FLAG;
	}
	public String getSUR_TEMP_MAX() {
		return SUR_TEMP_MAX;
	}
	public void setSUR_TEMP_MAX(String sUR_TEMP_MAX) {
		SUR_TEMP_MAX = sUR_TEMP_MAX;
	}
	public String getSUR_TEMP_MAX_FLAG() {
		return SUR_TEMP_MAX_FLAG;
	}
	public void setSUR_TEMP_MAX_FLAG(String sUR_TEMP_MAX_FLAG) {
		SUR_TEMP_MAX_FLAG = sUR_TEMP_MAX_FLAG;
	}
	public String getSUR_TEMP_MIN() {
		return SUR_TEMP_MIN;
	}
	public void setSUR_TEMP_MIN(String sUR_TEMP_MIN) {
		SUR_TEMP_MIN = sUR_TEMP_MIN;
	}
	public String getSUR_TEMP_MIN_FLAG() {
		return SUR_TEMP_MIN_FLAG;
	}
	public void setSUR_TEMP_MIN_FLAG(String sUR_TEMP_MIN_FLAG) {
		SUR_TEMP_MIN_FLAG = sUR_TEMP_MIN_FLAG;
	}
	public String getRH_HR_AVG() {
		return RH_HR_AVG;
	}
	public void setRH_HR_AVG(String rH_HR_AVG) {
		RH_HR_AVG = rH_HR_AVG;
	}
	public String getRH_HR_AVG_FLAG() {
		return RH_HR_AVG_FLAG;
	}
	public void setRH_HR_AVG_FLAG(String rH_HR_AVG_FLAG) {
		RH_HR_AVG_FLAG = rH_HR_AVG_FLAG;
	}
	public String getSOIL_MOISTURE_5() {
		return SOIL_MOISTURE_5;
	}
	public void setSOIL_MOISTURE_5(String sOIL_MOISTURE_5) {
		SOIL_MOISTURE_5 = sOIL_MOISTURE_5;
	}
	public String getSOIL_MOISTURE_10() {
		return SOIL_MOISTURE_10;
	}
	public void setSOIL_MOISTURE_10(String sOIL_MOISTURE_10) {
		SOIL_MOISTURE_10 = sOIL_MOISTURE_10;
	}
	public String getSOIL_MOISTURE_20() {
		return SOIL_MOISTURE_20;
	}
	public void setSOIL_MOISTURE_20(String sOIL_MOISTURE_20) {
		SOIL_MOISTURE_20 = sOIL_MOISTURE_20;
	}
	public String getSOIL_MOISTURE_50() {
		return SOIL_MOISTURE_50;
	}
	public void setSOIL_MOISTURE_50(String sOIL_MOISTURE_50) {
		SOIL_MOISTURE_50 = sOIL_MOISTURE_50;
	}
	public String getSOIL_MOISTURE_100() {
		return SOIL_MOISTURE_100;
	}
	public void setSOIL_MOISTURE_100(String sOIL_MOISTURE_100) {
		SOIL_MOISTURE_100 = sOIL_MOISTURE_100;
	}
	public String getSOIL_TEMP_5() {
		return SOIL_TEMP_5;
	}
	public void setSOIL_TEMP_5(String sOIL_TEMP_5) {
		SOIL_TEMP_5 = sOIL_TEMP_5;
	}
	public String getSOIL_TEMP_10() {
		return SOIL_TEMP_10;
	}
	public void setSOIL_TEMP_10(String sOIL_TEMP_10) {
		SOIL_TEMP_10 = sOIL_TEMP_10;
	}
	public String getSOIL_TEMP_20() {
		return SOIL_TEMP_20;
	}
	public void setSOIL_TEMP_20(String sOIL_TEMP_20) {
		SOIL_TEMP_20 = sOIL_TEMP_20;
	}
	public String getSOIL_TEMP_50() {
		return SOIL_TEMP_50;
	}
	public void setSOIL_TEMP_50(String sOIL_TEMP_50) {
		SOIL_TEMP_50 = sOIL_TEMP_50;
	}
	public String getSOIL_TEMP_100() {
		return SOIL_TEMP_100;
	}
	public void setSOIL_TEMP_100(String sOIL_TEMP_100) {
		SOIL_TEMP_100 = sOIL_TEMP_100;
	}
	@Override
	public String toString() {
		return "CSV_Item [itemID=" + itemID + ", WBANNO=" + WBANNO + ", UTC_DATE=" + UTC_DATE + ", UTC_TIME=" + UTC_TIME
				+ ", LST_DATE=" + LST_DATE + ", LST_TIME=" + LST_TIME + ", CRX_VN=" + CRX_VN + ", LONGITUDE="
				+ LONGITUDE + ", LATITUDE=" + LATITUDE + ", T_CALC=" + T_CALC + ", T_HR_AVG=" + T_HR_AVG + ", T_MAX="
				+ T_MAX + ", T_MIN=" + T_MIN + ", P_CALC=" + P_CALC + ", SOLARAD=" + SOLARAD + ", SOLARAD_FLAG="
				+ SOLARAD_FLAG + ", SOLARAD_MAX=" + SOLARAD_MAX + ", SOLARAD_MAX_FLAG=" + SOLARAD_MAX_FLAG
				+ ", SOLARAD_MIN=" + SOLARAD_MIN + ", SOLARAD_MIN_FLAG=" + SOLARAD_MIN_FLAG + ", SUR_TEMP_TYPE="
				+ SUR_TEMP_TYPE + ", SUR_TEMP=" + SUR_TEMP + ", SUR_TEMP_FLAG=" + SUR_TEMP_FLAG + ", SUR_TEMP_MAX="
				+ SUR_TEMP_MAX + ", SUR_TEMP_MAX_FLAG=" + SUR_TEMP_MAX_FLAG + ", SUR_TEMP_MIN=" + SUR_TEMP_MIN
				+ ", SUR_TEMP_MIN_FLAG=" + SUR_TEMP_MIN_FLAG + ", RH_HR_AVG=" + RH_HR_AVG + ", RH_HR_AVG_FLAG="
				+ RH_HR_AVG_FLAG + ", SOIL_MOISTURE_5=" + SOIL_MOISTURE_5 + ", SOIL_MOISTURE_10=" + SOIL_MOISTURE_10
				+ ", SOIL_MOISTURE_20=" + SOIL_MOISTURE_20 + ", SOIL_MOISTURE_50=" + SOIL_MOISTURE_50
				+ ", SOIL_MOISTURE_100=" + SOIL_MOISTURE_100 + ", SOIL_TEMP_5=" + SOIL_TEMP_5 + ", SOIL_TEMP_10="
				+ SOIL_TEMP_10 + ", SOIL_TEMP_20=" + SOIL_TEMP_20 + ", SOIL_TEMP_50=" + SOIL_TEMP_50
				+ ", SOIL_TEMP_100=" + SOIL_TEMP_100 + "]";
	}
	
	

}
