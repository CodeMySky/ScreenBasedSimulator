package edu.cmu.lti.bic.sbs;

import edu.cmu.lti.bic.sbs.engine.Engine;
import edu.cmu.lti.bic.sbs.ui.UserInterface;
import edu.cmu.lti.bic.sbs.ui.UserInterfaceInitializationException;

public class Main {
	public static void main(String[] args) {
		UserInterface ui = null;
		try {
			ui = new UserInterface(null);
		} catch (UserInterfaceInitializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Engine eng = new Engine();
		System.out.println("Finished Starting");
	}
}