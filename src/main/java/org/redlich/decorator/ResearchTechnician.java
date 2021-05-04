/*
 * ResearchTechnician.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public class ResearchTechnician extends Employee {

	public ResearchTechnician() {
		super.setTitle("Research Technician");
		super.setName("To Be Named");
		}

	public ResearchTechnician(String name) {
		super.setTitle("Research Technician");
		super.setName(name);
		}

	public String getResponsibility() {
		return "Acquire laboratory data";
		}
	}
