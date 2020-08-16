package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class DodavanjeLekovaDijalog extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6933833172274454496L;
	private JTextField sifraTextField;
	private JTextField imeTextField;
	private JTextField proizvodjacTextField;
	private JTextField cenaTextField;
	private JCheckBox izdavanjeCheckBox;
	
	
	public DodavanjeLekovaDijalog() {
		super(Registracija.getInstance(), "Dodaj lek", true);
		setSize(320, 230);
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
		
		JPanel izdajeSePanel  = new JPanel();
		izdajeSePanel.setLayout(makeLayout(izdajeSePanel));
		izdajeSePanel.add(Box.createHorizontalStrut(30));
		izdajeSePanel.add(new JLabel("Izdaje se recept:*  "));
		izdajeSePanel.add(Box.createGlue());
		izdavanjeCheckBox = new JCheckBox();
		izdajeSePanel.add(izdavanjeCheckBox);
		izdajeSePanel.add(Box.createGlue());
		izdajeSePanel.add(Box.createHorizontalStrut(30));
		panel.add(izdajeSePanel);
		panel.add(Box.createVerticalStrut(3));
		
		//DUGMICI
		JPanel buttonsPanel =  new JPanel();
		buttonsPanel.setLayout(makeLayout(buttonsPanel));
		buttonsPanel.add(Box.createGlue());
		JButton odustanak = new JButton("Odustani");
		JButton potvrda = new JButton("Potvrdi");
		buttonsPanel.add(odustanak);
		buttonsPanel.add(Box.createHorizontalStrut(20));
		buttonsPanel.add(potvrda);
		buttonsPanel.add(Box.createGlue());
		panel.add(buttonsPanel);
		panel.add(Box.createVerticalStrut(9));
		odustanak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				dispose();
				
			}
			
		});
		
		
		
		add(panel, BorderLayout.CENTER);
	}
	
	
	
	
	private BoxLayout makeLayout(JPanel panel ) {
		return new  BoxLayout(panel, BoxLayout.X_AXIS);
	}
}
