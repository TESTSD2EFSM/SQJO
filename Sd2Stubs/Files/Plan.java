public class Plan {
	private String period = "20192";  
	private String classId = "1";  
	private boolean closePlanOk = false;  

	public String getPeriod() {
		return period;
	}
	
	public String getClassId() {
		return classId;
	}
	
	public boolean getClosePlanOk(String period, String classId){
		return closePlanOk;
	}  

	public boolean insertPlan(String period, String classId, String contentPlan) {
		if (this.period.equals(period) && this.classId.equals(classId) && contentPlan != ""){
			return true;
		}
		else{
			return false;
		}
	}
}
