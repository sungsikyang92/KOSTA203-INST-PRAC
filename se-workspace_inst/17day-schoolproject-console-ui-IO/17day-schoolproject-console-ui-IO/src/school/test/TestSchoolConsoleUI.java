package school.test;

import java.io.IOException;

import school.view.ConsoleInstUI6;

public class TestSchoolConsoleUI {
	public static void main(String[] args) {
		//ConsoleInstUI1 ui=new ConsoleInstUI1();
		//ConsoleInstUI2 ui=new ConsoleInstUI2();
		//  ConsoleInstUI3 ui=new ConsoleInstUI3();
		//ConsoleInstUI4 ui=new ConsoleInstUI4();
		//ConsoleInstUI5 ui=new ConsoleInstUI5();
		ConsoleInstUI6 ui=new ConsoleInstUI6();
		try {
			ui.execute();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}













