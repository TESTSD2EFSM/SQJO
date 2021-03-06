/**
 *
 * $Id$
 */
package Sequencediagram.sequencediagram.validation;


/**
 * A sample validator interface for {@link Sequencediagram.sequencediagram.Param}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ParamValidator {
	boolean validate();

	boolean validateArgName(String value);
	boolean validateArgType(String value);
}
