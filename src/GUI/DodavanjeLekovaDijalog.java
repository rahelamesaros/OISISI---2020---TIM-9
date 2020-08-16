package GUI;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DodavanjeLekovaDijalog extends JDialog{
	
	private JTextField sifraTextField;
	private JTextField imeTextField;
	private JTextField proizvodjacTextField;
	private JTextField cenaTextField;
	
	public DodavanjeLekovaDijalog() {
		super(Registracija.getInstance(), "Dodaj lek", true);
		setSize(320, 420);
		setLocationRelativeTo(Registracija.getInstance());
		JPanel panel = new JPanel();
		BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(box);
		panel.add(Box.createVerticalStrut(10));
		
		
		JPanel sifraPanel  = new JPanel();
		sifraPanel.setLayout(makeLayout(sifraPanel));
		sifraPanel.add(Box.createHorizontalStrut(30));
		sifraPanel.add(new JLabel("Šifra*  "));
		sifraPanel.add(Box.createGlue());
		sifraTextField = new JTextField();
		sifraPanel.add(sifraTextField);
		sifraPanel.add(Box.createHorizontalStrut(30));
		panel.add(sifraPanel);
		panel.add(Box.createVerticalStrut(3));
		
		JPanel imePanel  = new JPanel();
		imePanel.setLayout(makeLayout(imePanel));
		imePanel.add(Box.createHorizontalStrut(30));
		imePanel.add(new JLabel("Ime*  "));
		imePanel.add(Box.createGlue());
		imeTextField = new JTextField();
		imePanel.add(imeTextField);
		imePanel.add(Box.createHorizontalStrut(30));
		panel.add(imePanel);
		panel.add(Box.createVerticalStrut(3));
		
		JPanel proizvodjacPanel  = new JPanel();
		proizvodjacPanel.setLayout(makeLayout(proizvodjacPanel));
		proizvodjacPanel.add(Box.createHorizontalStrut(30));
		proizvodjacPanel.add(new JLabel("Proizvođač*  "));
		proizvodjacPanel.add(Box.createGlue());
		proizvodjacTextField = new JTextField();
		proizvodjacPanel.add(proizvodjacTextField);
		proizvodjacPanel.add(Box.createHorizontalStrut(30));
		panel.add(proizvodjacPanel);
		panel.add(Box.createVerticalStrut(3));
		
		JPanel cenaPanel  = new JPanel();
		cenaPanel.setLayout(makeLayout(cenaPanel));
		cenaPanel.add(Box.createHorizontalStrut(30));
		cenaPanel.add(new JLabel("Cena*  "));
		cenaPanel.add(Box.createGlue());
		cenaTextField = new JTextField();
		cenaPanel.add(cenaTextField);
		cenaPanel.add(Box.createHorizontalStrut(30));
		panel.add(cenaPanel);
		panel.add(Box.createVerticalStrut(3));
		
		
		
		add(panel, BorderLayout.CENTER);
	}
	
	
	
	
	private BoxLayout makeLayout(JPanel panel ) {
		return new  BoxLayout(panel, BoxLayout.X_AXIS);
	}
}
