/*
 * Employee.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public abstract class Employee {
	private String title = "Employee";
	private String name;

	public String getTitle() {
		return title;
		}

	public void setTitle(String title) {
		this.title = title;
		}

	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
		}

	public abstract String getResponsibility();
	}
