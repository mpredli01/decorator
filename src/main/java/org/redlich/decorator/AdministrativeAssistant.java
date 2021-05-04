/*
 * AdministrativeAssistant.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public class AdministrativeAssistant extends Employee {

	public AdministrativeAssistant() {
		super.setTitle("Administrative Assistant");
		super.setName("To Be Named");
		}

	public AdministrativeAssistant(String name) {
		super.setTitle("Administrative Assistant");
		super.setName(name);
		}

	public String getResponsibility() {
		return "Provide administrative support";
		}
	}
