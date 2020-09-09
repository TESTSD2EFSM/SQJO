/**
 */
package Sequencediagram.sequencediagram.tests;

import Sequencediagram.sequencediagram.CombinedFragment;
import Sequencediagram.sequencediagram.SequencediagramFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CombinedFragmentTest extends InteractionFragmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CombinedFragmentTest.class);
	}

	/**
	 * Constructs a new Combined Fragment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Combined Fragment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CombinedFragment getFixture() {
		return (CombinedFragment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SequencediagramFactory.eINSTANCE.createCombinedFragment());
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

} //CombinedFragmentTest
