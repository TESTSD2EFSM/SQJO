/**
 */
package Sequencediagram.sequencediagram.tests;

import Sequencediagram.sequencediagram.SequencediagramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectTest extends AbstractObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectTest.class);
	}

	/**
	 * Constructs a new Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Sequencediagram.sequencediagram.Object getFixture() {
		return (Sequencediagram.sequencediagram.Object)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequencediagramFactory.eINSTANCE.createObject());
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

} //ObjectTest
