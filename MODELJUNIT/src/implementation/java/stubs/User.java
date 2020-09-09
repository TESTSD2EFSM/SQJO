import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class User {
	
	public boolean validateUser( String mat, String psw ) {
		String urlParams = "action=login&mat="+mat+"&psw="+psw;
		boolean result = executeConnection(urlParams);
		return result;
	}
	
	public boolean executeConnection( String urlParams ) {
		try {
			URL profonline = new URL("http://localhost/profonline/?entity=user&"+urlParams);
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
