import java.util.Date;

public class ClassRecord {
	private String period = "20192";  
	private String classId = "1";  
	private int hours = 60;  

	public String getPeriod() {
		return period;
	}  

	public String getClassId() {
		return classId;
	}  

	public int getHours(String period, String classId){
		return hours;
	}  

	public boolean insertClassRecord(String period, String classId, Date date, int hours, String contentClass) {
		if (this.period.equals(period) && this.classId.equals(classId) && hours > 0 &&  contentClass != ""){
			return true;
		}
		else{
			return false;
		}
	}
}
