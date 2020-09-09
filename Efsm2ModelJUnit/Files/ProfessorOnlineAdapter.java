public class ProfessorOnlineAdapter {
	private Teacher teacher = new Teacher();
	private ProfessorOnline professorOnline = new ProfessorOnline();
	private User user = new User();
	private Plan plan = new Plan();
	private Subject subject = new Subject();
	private ClassRecord classRecord = new ClassRecord();
	private GradeRecord gradeRecord = new GradeRecord();
	private Classes classes = new Classes();

	public void login(){
	}
	
	public boolean validateUser(){
    	return user.validateUser(teacher.getId(),teacher.getPsw());
	}
	
	public boolean getClosePlanOk(){
    	return plan.getClosePlanOk(teacher.getPeriod(),teacher.getClassId());
	}
	
	public void enterPlan(){
	}
	
	public boolean insertPlan(){
    	return plan.insertPlan(teacher.getPeriod(),teacher.getClassId(),teacher.getContentPlan());
	}
	
	public int getWorkLoad(){
    	return subject.getWorkLoad(teacher.getSubjectId());
	}
	
	public int getHours(){
    	return classRecord.getHours(teacher.getPeriod(),teacher.getClassId());
	}
	
	public void enterClassRecord(){
	}
	
	public boolean insertClassRecord(){
    	return classRecord.insertClassRecord(teacher.getPeriod(),teacher.getClassId(),teacher.getDate(),teacher.getHours(),teacher.getContentClass());
	}
	
	public void enterGradeRecord(){
	}
	
	public void insertGradeRecord(){
	}
	
	public void insertCloseClass(){
	}
	
	public void updateCloseClass(){
	}
	
	public String enterOption(){
    	return professorOnline.enterOption(teacher.getOpt());
	}
	
	public void chooseClass(){
	}
	
	public boolean validateChooseClass(){
    	return classes.validateChooseClass(teacher.getPeriod(),teacher.getClassId());
	}
}	
