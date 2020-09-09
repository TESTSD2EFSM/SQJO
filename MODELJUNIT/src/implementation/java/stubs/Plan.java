import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Plan {
	public boolean getClosePlanOk( String period, String classId ) {
		String urlParams = "&action=getPlan&period="+period+"&classId="+classId;
		boolean result = executeConnection(urlParams);
		return result;
	}
	
	public boolean insertPlan( String period, String classId, String contentPlan ) {
		String urlParams = "&action=insertPlan&period="+period+"&classId="+classId+"&contentPlan="+contentPlan;
		boolean result = executeConnection(urlParams);
		return result;
	}
	
	public boolean executeConnection( String urlParams ) {
		
		try {
			URL profonline = new URL("http://localhost/profonline/?entity=plan&"+urlParams);
	        URLConnection pfOn = profonline.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                pfOn.getInputStream()));
	        String inputLine;

	        while ((inputLine = in.readLine()) != null) {
	            //System.out.println(inputLine);
	        	if( inputLine.equals("1") ) {
	        		return true;
	        	}
	        }
	        in.close();
			}catch (Exception e) {
				return false;
			}
		
		return false;
	}

}
