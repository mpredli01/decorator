/*
 * Laboratory.java
 *
 * "Avoid Excessive Subclassing with the Decorator Design Pattern"
 * Published January 27, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/decorator/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.decorator;

public class Laboratory {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("-- Research Laboratory --");
		System.out.println();

		Employee investigator01 = new PrincipleInvestigator("Gustavo Carri");
		investigator01 = new SafetyCaptain(investigator01);
		System.out.println(investigator01.getTitle() + "\n\tResponsibilities include " + investigator01.getResponsibility());

		Employee investigator02 = new PrincipleInvestigator("Thomas Sun");
		investigator02 = new SafetyCaptain(investigator02);
		investigator02 = new BloodDriveCanvasser(investigator02);
		System.out.println(investigator02.getTitle() + "\n\tResponsibilities include " + investigator02.getResponsibility());

		Employee technician = new ResearchTechnician("Michael Redlich");
		technician = new ComputerSecurityOfficer(technician);
		technician = new BloodDriveCanvasser(technician);
		System.out.println(technician.getTitle() + "\n\tResponsibilities include " + technician.getResponsibility());

		Employee admin = new AdministrativeAssistant("Mary Belfatto");
		admin = new BloodDriveCanvasser(admin);
		System.out.println(admin.getTitle() + "\n\tResponsibility include " + admin.getResponsibility());
		}
	}
