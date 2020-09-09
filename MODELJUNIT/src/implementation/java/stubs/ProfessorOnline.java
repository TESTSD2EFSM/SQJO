import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ProfessorOnline {
	
	public String enterOption(String opt) {
		String urlParams = "&action=enterOption&opt="+opt;
		String result = executeConnection(urlParams);
		return result;
	}
	
	public String executeConnection( String urlParams ) {
		
		try {
			URL profonline = new URL("http://localhost/profonline/?entity=professorOnline&"+urlParams);
	        URLConnection pfOn = profonline.openConnection();
	        BufferedReader in = new BufferedReader(
	                                new InputStreamReader(
	                                pfOn.getInputStream()));
	        String inputLine;

	        while ((inputLine = in.readLine()) != null) {
	            //System.out.println(inputLine);
//	        	if( inputLine.equals("1") ) {
//	        		return true;
//	        	}
	        	return inputLine;
	        }
	        in.close();
			}catch (Exception e) {
				return "";
			}
		
		return "";
	}
}
