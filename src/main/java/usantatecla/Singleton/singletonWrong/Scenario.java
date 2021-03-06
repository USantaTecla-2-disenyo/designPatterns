package usantatecla.Singleton.singletonWrong;

import usantatecla.Utils.utils.Printer;

public class Scenario {

	public static void main(String[] arguments) {

		Printer printer = Printer.getInstance();

		printer.printTitle("SINGLETON WRONG");

		School school = new School();
		printer.printMessageLevel1(school.toString());
		
		printer.printSubTitle("SCHOOL STARTING ACADEMIC YEAR");

		school.startAcademicYear();
	}
}
