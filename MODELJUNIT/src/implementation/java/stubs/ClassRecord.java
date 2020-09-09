import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ClassRecord {
	public boolean insertClassRecord(String period, String classId, int hours, String contentClass){
		String urlParams = "&action=insertClassRecord&period="+period+"&classId="+classId+"&hours="+hours+"&contentClass="+contentClass;
		int result = executeConnection(urlParams);
		if( result == 1 ) {
			return true;
		}else {
			return false;
		}
	}

	public int getHours(String period, String classId) {
		String urlParams = "&action=getHours&period="+period+"&classId="+classId;
		int result = executeConnection(urlParams);
		return result;
		//return hours;
	}

	public int executeConnection( String urlParams ) {
		try {
			URL profonline = new URL("http://localhost/profonline/?entity=classRecord&"+urlParams);
	        URLConnection pfOn = profonline.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                pfOn.getInputStream()));
	        String inputLine;
	
	        while ((inputLine = in.readLine()) != null) {
	            //System.out.println(inputLine);
	        	if( Integer.parseInt(inputLine.toString()) > 0 ) {
	        		return Integer.parseInt(inputLine.toString());
	        	}
	        }
	        in.close();
			}catch (Exception e) {
				return -1;
			}
			return 0;
	}
}
