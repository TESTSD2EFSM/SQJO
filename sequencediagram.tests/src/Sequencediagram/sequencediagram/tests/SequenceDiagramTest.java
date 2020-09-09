/**
 */
package Sequencediagram.sequencediagram.tests;

import Sequencediagram.sequencediagram.SequenceDiagram;
import Sequencediagram.sequencediagram.SequencediagramFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequence Diagram</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequenceDiagramTest extends TestCase {

	/**
	 * The fixture for this Sequence Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDiagram fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequenceDiagramTest.class);
	}

	/**
	 * Constructs a new Sequence Diagram test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceDiagramTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sequence Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SequenceDiagram fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sequence Diagram test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDiagram getFixture() {
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
		setFixture(SequencediagramFactory.eINSTANCE.createSequenceDiagram());
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

} //SequenceDiagramTest
