package GUI;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class MyTabbedPane extends JTabbedPane{
	private static final long serialVersionUID = -4138342679605523568L;
	
	private static MyTabbedPane instance = null;
	
	public static MyTabbedPane getInstance() {
		if(instance == null) {
			instance = new MyTabbedPane();
		}
		return instance;
	}
	private MyTabbedPane() {	 
		
		
		JPanel kreiranjeReceptiPanel = new JPanel();
		JPanel lekoviPanel = new JPanel();
		JPanel pregledRecepataPanel = new JPanel();
	
		
		
		kreiranjeReceptiPanel.add(KreiranjeRecepataPanel.getInstance(), BorderLayout.CENTER);

		add("Kreiranje recepata", kreiranjeReceptiPanel);
		add("Lekovi", lekoviPanel);
		add("Pregled recepata", pregledRecepataPanel);
		
	}
}
