import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;

public class ProfessorOnlineModel implements FsmModel {
	private ProfessorOnlineAdapter adapter = new ProfessorOnlineAdapter();

	private boolean userOk;
	private boolean closePlanOk;
	private int workLoad;
	private int hours;
	private boolean classRecordOk;
	private String opt;
	private boolean chooseClassOk;
		
	private enum State{S0, S1, S2, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, S14, S15, S16, S17, S18, S19, S20, S21, S22, S23, S24, S25, S26, S27}
	private State state = State.S0;

	public Object getState() {
		return state;
	}

	public void reset(boolean arg0) {
		state = State.S0;
	}

	@Action
	public void login() {
		if (state == State.S0) {
			adapter.login();
			state = State.S1;
		}
	}

	@Action
	public void validateUser() {
		if (state == State.S1) {
		    userOk  = adapter.validateUser();
			if (! (userOk = false)){
				state = State.S2;
			}
		}
		if (state == State.S1) {
		    userOk = adapter.validateUser();
			if (userOk == false){
				state = State.S0;
			}
		}
	}

	@Action
	public void logged() {
		if (state == State.S2) {
			state = State.S3;
		}
	}

	@Action
	public void chooseClass() {
		if (state == State.S3) {
			state = State.S4;
		}
		if (state == State.S8) {
			adapter.chooseClass();
			state = State.S24;
		}
		if (state == State.S23) {
			adapter.chooseClass();
			state = State.S24;
		}
	}

	@Action
	public void getClosePlanOk() {
		if (state == State.S4) {
		    closePlanOk = adapter.getClosePlanOk();
			if (closePlanOk == false){
				state = State.S5;
			}
		}
		if (state == State.S4) {
		    closePlanOk = adapter.getClosePlanOk();
			if (closePlanOk == true){
				state = State.S9;
			}
		}
	}

	@Action
	public void requestPlan() {
		if (state == State.S5) {
			state = State.S6;
		}
	}

	@Action
	public void enterPlan() {
		if (state == State.S6) {
			adapter.enterPlan();
			state = State.S7;
		}
	}

	@Action
	public void insertPlan() {
		if (state == State.S7) {
		    closePlanOk = adapter.insertPlan();
            state = State.S8;
		}
	}

	@Action
	public void enterOption() {
		if (state == State.S9) {
			state = State.S10;
		}
		if (state == State.S14) {
		    opt  = adapter.enterOption();
			if (! (opt != "exit")){
				state = State.S23;
			}
		}
		if (state == State.S18) {
		    opt  = adapter.enterOption();
			if (! (opt != "exit")){
				state = State.S23;
			}
		}
		if (state == State.S22) {
		    opt  = adapter.enterOption();
			if (! (opt != "exit")){
				state = State.S23;
			}
		}
		if (state == State.S11) {
		    opt  = adapter.enterOption();
			if (! (opt != "exit")){
				state = State.S23;
			}
		}
		if (state == State.S14) {
		    opt = adapter.enterOption();
			if (opt != "exit"){
				state = State.S10;
			}
		}
		if (state == State.S18) {
		    opt = adapter.enterOption();
			if (opt != "exit"){
				state = State.S10;
			}
		}
		if (state == State.S22) {
		    opt = adapter.enterOption();
			if (opt != "exit"){
				state = State.S10;
			}
		}
		if (state == State.S11) {
		    opt = adapter.enterOption();
			if (opt != "exit"){
				state = State.S10;
			}
		}
	}

	@Action
	public void getWorkLoad() {
		if (state == State.S10) {
		    workLoad = adapter.getWorkLoad();
            state = State.S11;
		}
	}

	@Action
	public void getHours() {
		if (state == State.S11) {
			opt = adapter.enterOption();
			hours = adapter.getHours();
			if (opt == "classRecord" && hours < workLoad){
				state = State.S12;
			}
		}
		if (state == State.S11) {
			opt = adapter.enterOption();
			if (opt == "gradeRecord"){
				state = State.S15;
			}
		}
		if (state == State.S11) {
			opt = adapter.enterOption();
			hours = adapter.getHours();
			workLoad = adapter.getWorkLoad();
			if (opt == "closeClass" && hours == workLoad){
				state = State.S19;
			}
		}
	}

	@Action
	public void enterClassRecord() {
		if (state == State.S12) {
			adapter.enterClassRecord();
			state = State.S13;
		}
	}

	@Action
	public void insertClassRecord() {
		if (state == State.S13) {
		    classRecordOk = adapter.insertClassRecord();
            state = State.S14;
		}
	}

	@Action
	public void enterGradeRecord() {
		if (state == State.S15) {
			adapter.enterGradeRecord();
			state = State.S16;
		}
	}

	@Action
	public void insertGradeRecord() {
		if (state == State.S16) {
			adapter.insertGradeRecord();
			state = State.S17;
		}
	}

	@Action
	public void insertedGradeRecord() {
		if (state == State.S17) {
			state = State.S18;
		}
	}

	@Action
	public void insertCloseClass() {
		if (state == State.S19) {
			adapter.insertCloseClass();
			state = State.S20;
		}
	}

	@Action
	public void updateCloseClass() {
		if (state == State.S20) {
			adapter.updateCloseClass();
			state = State.S21;
		}
	}

	@Action
	public void closedClass() {
		if (state == State.S21) {
			state = State.S22;
		}
	}

	@Action
	public void validateChooseClass() {
		if (state == State.S24) {
		    chooseClassOk  = adapter.validateChooseClass();
			if (! (chooseClassOk == true)){
				state = State.S25;
			}
		}
		if (state == State.S24) {
		    chooseClassOk = adapter.validateChooseClass();
			if (chooseClassOk == true){
				state = State.S4;
			}
		}
	}

	@Action
	public void exit() {
		if (state == State.S25) {
			state = State.S26;
		}
	}

	@Action
	public void loggof() {
		if (state == State.S26) {
			state = State.S27;
		}
	}

}
