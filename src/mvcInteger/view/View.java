package mvcInteger.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import mvcInteger.i18n.Constants;

@SuppressWarnings("serial")
public class View extends JFrame{
	JTextField label;
	JButton plusButton, minusButton, undoButton, redoButton;
	public JMenuBar menuBar;
	public JMenu ChangeValue;
	public JMenuItem menuPlus,menuMoins;
	public JButton btnToolbarPlus,btnToolbarMoins;
	public JToolBar toolbar;
	
	public View() {
		this.label = new JTextField("");
		this.label.setPreferredSize(new Dimension(100,20));
		Container pane = this.getContentPane();
		JPanel panelCenter = new JPanel(new FlowLayout());
		JPanel panelNorth = new JPanel(new FlowLayout());
		this.plusButton = new JButton();
		this.plusButton.setToolTipText("Incrementer la valeur de l'entier");
		this.minusButton = new JButton();
		this.minusButton.setToolTipText("Decrementer la valeur de l'entier");
		this.undoButton = new JButton();
		this.undoButton.setToolTipText("Annuler la dernière action");
		this.redoButton = new JButton();
		this.redoButton.setToolTipText("Refaire l'action annulé");
		
		this.menuBar = new JMenuBar();
		this.ChangeValue = new JMenu(Constants.VALUE_CHANGE_TOOLBAR_LABEL.translate());
		this.menuBar.add(this.ChangeValue);
		this.menuPlus = new JMenuItem("Incrementer");
		this.menuPlus.setToolTipText("Incrementer la valeur de l'entier");
		this.menuMoins = new JMenuItem("Decrementer");
		this.menuMoins.setToolTipText("Decrementer la valeur de l'entier");
		this.ChangeValue.add(menuPlus);
		this.ChangeValue.add(menuMoins);
		this.menuBar.add(this.ChangeValue);
		setJMenuBar(this.menuBar);
		
		
		this.toolbar = new JToolBar();
		this.btnToolbarPlus = new JButton("Plus");
		this.btnToolbarPlus.setToolTipText("Incrementer la valeur de l'entier");
		this.btnToolbarMoins = new JButton("Moins");
		this.btnToolbarMoins.setToolTipText("Decrementer la valeur de l'entier");
		this.toolbar.add(btnToolbarPlus);
		this.toolbar.add(btnToolbarMoins);
		
		panelCenter.add(this.label);
		panelCenter.add(this.plusButton);
		panelCenter.add(this.minusButton);
		panelCenter.add(this.undoButton);
		panelCenter.add(this.redoButton);
		panelNorth.add(this.toolbar);
		pane.add(panelNorth,BorderLayout.NORTH);
		pane.add(panelCenter, BorderLayout.CENTER);
		
		this.plusButton.setPreferredSize(new Dimension(100, 100));
		this.minusButton.setPreferredSize(new Dimension(100, 100));
		this.undoButton.setPreferredSize(new Dimension(100, 100));
		this.redoButton.setPreferredSize(new Dimension(100, 100));
		

		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public JButton getBtnToolbarPlus() {
		return btnToolbarPlus;
	}

	public JButton getBtnToolbarMoins() {
		return btnToolbarMoins;
	}

	public JMenuItem getMenuPlus() {
		return menuPlus;
	}

	public JMenuItem getMenuMoins() {
		return menuMoins;
	}

	public JButton getPlusButton() {
		return plusButton;
	}

	public JButton getMinusButton() {
		return minusButton;
	}

	public JTextField getLabel() {
		return label;
	}

	public JButton getUndoButton() {
		return undoButton;
	}

	public JButton getRedoButton() {
		return redoButton;
	}

}
