/*
 * PrincipleInvestigator.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public class PrincipleInvestigator extends Employee {

	public PrincipleInvestigator() {
		super.setTitle("Principle Investigator");
		super.setName("To Be Named");
		}

	public PrincipleInvestigator(String name) {
		super.setTitle("Principle Investigator");
		super.setName(name);
		}

	public String getResponsibility() {
		return "Analyze laboratory data";
		}
	}
