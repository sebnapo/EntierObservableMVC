package mvcInteger.controller;

import java.text.Format;
import java.util.Observable;
import java.util.Observer;

import mvcInteger.format.Romain;
import mvcInteger.model.MyInteger;
import mvcInteger.view.View;

public class Controller implements Observer {
	View view;
	MyInteger model;
	Format format;

	public Controller(MyInteger model, View view) {
		this.view = view;
		this.model = model;
		this.format = new Romain();

		this.view.getLabel().setText(
				this.format.format(this.model.getVal()));

		this.view.pack();
	}
	

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof MyInteger) {
			this.view.getLabel().setText(
					this.format.format(this.model.getVal()));

			this.view.pack();
		}
	}

}
