/**
 */
package Sequencediagram.sequencediagram.tests;

import Sequencediagram.sequencediagram.LifeLine;
import Sequencediagram.sequencediagram.SequencediagramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LifeLineTest extends TestCase {

	/**
	 * The fixture for this Life Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeLine fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LifeLineTest.class);
	}

	/**
	 * Constructs a new Life Line test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeLineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Life Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(LifeLine fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Life Line test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeLine getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequencediagramFactory.eINSTANCE.createLifeLine());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LifeLineTest
