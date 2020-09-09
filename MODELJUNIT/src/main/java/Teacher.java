import java.util.Date;

public class Teacher {
	private String id = "111";  
	private String psw = "123";  
	private String period = "20192";  
	private String classId = "2";  
	private String contentPlan = "";  
	private String subjectId = "10";
	Date now = new Date();
	private Date date = now;  
	private int hours = 2;  
	private String contentClass = "";  
	private String opt = "exit";  

	public String getId() {
		return id;
	}
	
	public String getPsw() {
		return psw;
	}
	
	public String getPeriod() {
		return period;
	}
	
	public String getClassId() {
		return classId;
	}
	
	public String getContentPlan() {
		return contentPlan;
	}
	
	public String getSubjectId() {
		return subjectId;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int getHours() {
		return hours;
	}
	
	public String getContentClass() {
		return contentClass;
	}
	
	public String getOpt() {
		return opt;
	}
}
