import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class ProfessorOnlineJUnit {

	@Test
	public void testValidateUser01() {
		User user = new User();
		boolean output = user.validateUser("111","123");
		assertTrue(output);
	}
	
	@Test
	public void testValidateUser02() {
		User user = new User();
		boolean output = user.validateUser("222","246");
		assertFalse(output);
	}

	@Test
	public void testGetClosePlanOk01() {
		Plan plan = new Plan();
		boolean output = plan.getClosePlanOk("20192","1");
		assertTrue(output);
	}

	@Test
	public void testGetClosePlanOk02() {
		Plan plan = new Plan();
		boolean output = plan.getClosePlanOk("20192","2");
		assertFalse(output);
	}

	@Test
	public void testInsertPlan01() {
		Plan plan = new Plan();
		boolean output = plan.insertPlan("20192","1", "aaa");
		assertTrue(output);
	}

	@Test
	public void testInsertPlan02() {
		Plan plan = new Plan();
		boolean output = plan.insertPlan("20192","1", "");
		assertFalse(output);
	}
	
	@Test
	public void testGetHours01() {
		ClassRecord classRecord = new ClassRecord();
		int output = classRecord.getHours("20192","1");
		assertEquals(output, 60);
	}
	
	@Test
	public void testGetHours02() {
		ClassRecord classRecord = new ClassRecord();
		int output = classRecord.getHours("20192","2");
		assertEquals(output, 30);
	}

	@Test
	public void testEnterOption01() {
		ProfessorOnline professorOnline = new ProfessorOnline();
		Teacher teacher = new Teacher();
		String output = professorOnline.enterOption("classRecord");
		assertEquals(output, teacher.getOpt());
	}
	
	@Test
	public void testEnterOption02() {
		ProfessorOnline professorOnline = new ProfessorOnline();
		Teacher teacher = new Teacher();
		String output = professorOnline.enterOption("gradeRecord");
		assertEquals(output, teacher.getOpt());
	}
	
	@Test
	public void testEnterOption03() {
		ProfessorOnline professorOnline = new ProfessorOnline();
		Teacher teacher = new Teacher();
		String output = professorOnline.enterOption("closeClass");
		assertEquals(output, teacher.getOpt());
	}
	
	@Test
	public void testEnterOption04() {
		ProfessorOnline professorOnline = new ProfessorOnline();
		Teacher teacher = new Teacher();
		String output = professorOnline.enterOption("exit");
		assertEquals(output, teacher.getOpt());
	}

	@Test
	public void testInsertClassRecord01() {
		ClassRecord classRecord = new ClassRecord();
		Date now = new Date();
		boolean output = classRecord.insertClassRecord("20192", "1", now, 2, "aaa");
		assertTrue(output);
	}

	public void testInsertClassRecord02() {
		ClassRecord classRecord = new ClassRecord();
		Date now = new Date();
		boolean output = classRecord.insertClassRecord("20192", "1", now, 2, "");
		assertFalse(output);
	}

	@Test
	public void testValidateChooseClass01() {
		Classes classes = new Classes();
		boolean output = classes.validateChooseClass("20192","1");
		assertTrue(output);
	}
	
	@Test
	public void testValidateChooseClass02() {
		Classes classes = new Classes();
		boolean output = classes.validateChooseClass("20192","2");
		assertTrue(output);
	}
}
