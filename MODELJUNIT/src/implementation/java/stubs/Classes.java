import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Classes {
	public boolean validateChooseClass( String period, String classId ) {
		String urlParams = "&action=validateChooseClass&period="+period+"&classId="+classId;
		boolean result = executeConnection(urlParams);
		return result;
	}
	
	public boolean executeConnection( String urlParams ) {
		
		try {
			URL profonline = new URL("http://localhost/profonline/?entity=classes&"+urlParams);
	        URLConnection pfOn = profonline.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                pfOn.getInputStream()));
	        String inputLine;

	        while ((inputLine = in.readLine()) != null) {
	            //System.out.println(inputLine);
	        	if( inputLine.equals("true") ) {
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
