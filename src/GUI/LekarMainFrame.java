package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.plaf.SplitPaneUI;

public class LekarMainFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1121750706968883410L;
	private static LekarMainFrame instance = null;
	
	public static LekarMainFrame getInstance() {
		if(instance == null) {
			instance = new LekarMainFrame();
		}
		return instance;
	}
	
	private LekarMainFrame() {
		setLayout(new BorderLayout());
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth *3/4, screenHeight *3/4);
		setTitle("Apoteka");
		
		MyTabbedPane pane =  MyTabbedPane.getInstance();
		add(pane);		
	}
	
	
}
