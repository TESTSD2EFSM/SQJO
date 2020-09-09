public class User {
	private String id = "111";  
	private String psw = "123";  

	public String getId() {
		return id;
	}
	
	public String getPsw() {
		return psw;
	}  

	public boolean validateUser(String id, String psw) {
		if (this.id.equals(id) && this.psw.equals(psw)){
			return true;
		}
		else{
			return false;
		}
	}
}
