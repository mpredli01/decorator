/*
 * SafetyCaptain.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public class SafetyCaptain extends EmployeeDecorator {
	Employee employee;

	public SafetyCaptain(Employee employee) {
		this.employee = employee;
		}

	public String getTitle() {
		return employee.getTitle() + " (" + employee.getName() + ")" + "\n\tSafety Captain";
		}

	public String getResponsibility() {
		return employee.getResponsibility() + "\n\t...and perform quarterly safety inspections";
		}
	}
