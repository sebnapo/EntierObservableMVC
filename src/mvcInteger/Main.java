package mvcInteger;

import java.util.Locale;
import java.util.ResourceBundle;

import mvcInteger.controller.ControllerSynchro;
import mvcInteger.i18n.Constants;
import mvcInteger.model.IntegerWithUndo;
import mvcInteger.model.MyInteger;

public class Main {

	public static void main(String[] args) {
		
		Constants.res = ResourceBundle.getBundle("mvcInteger.i18n.Locale_de_DE", Locale.GERMAN);
		MyInteger integer = new IntegerWithUndo();
		MyInteger integer2 = new IntegerWithUndo();
		new ControllerSynchro(integer, integer2);
	}
}
