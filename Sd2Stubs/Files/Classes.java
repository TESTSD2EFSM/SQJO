public class Classes {
	private String period = "20192";  
	private String classId = "1";  

	public String getPeriod() {
		return period;
	}
	
	public String getClassId() {
		return classId;
	}  

	public void updateCloseClass(String period, String classId) {
	}
	
	public boolean validateChooseClass(String period, String classId) {
		if (this.period.equals(period) && this.classId.equals(classId)){
			return true;
		}
		else{
			return false;
		}
	}
}
