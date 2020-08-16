package GUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



import model.Lek;
import model.Recept;

public class KreiranjeRecepataPanel extends JPanel{
	
	private JTextField jmbgTextField;
	private Recept recept;
	ArrayList<Lek> lekovi;
	private JList<String> listaKolona;
	private String[] kolone = new String[100];
	private Lek[] lekoviArray = new Lek[100];
	
	
	public static KreiranjeRecepataPanel instance = null;
	public static KreiranjeRecepataPanel getInstance() {
		if(instance == null) {
			instance = new KreiranjeRecepataPanel();
		}
		return instance;
	}
	
	private KreiranjeRecepataPanel() {
		
		JPanel glavniPanel =  new JPanel();
		lekovi =  new ArrayList<Lek>();
		Lek lek1 = new Lek("1", "Bendzos", "Zejtin", true, 300);
		Lek lek2 = new Lek("2", "Aspirin", "Sinovi", true, 10);
		Lek lek3 = new Lek("3", "Metadon", "Jankovic", true, 1);
		
		lekovi.add(lek1);
		lekovi.add(lek2);
		lekovi.add(lek3);
		
		glavniPanel.setLayout(new BoxLayout(glavniPanel, BoxLayout.Y_AXIS));
		
		JPanel naslovPanel = new JPanel();
		naslovPanel.setLayout(makeLayout(naslovPanel));
		naslovPanel.add(Box.createGlue());
		JLabel naslov =  new JLabel("Kreiranje recepata");
		naslov.setFont(new Font("Serif", Font.PLAIN, 30));
		naslovPanel.add(naslov);
		naslovPanel.add(Box.createGlue());
		glavniPanel.add(naslovPanel);
		glavniPanel.add(Box.createVerticalStrut(20));
		
		JPanel jmbgPanel  = new JPanel();
		jmbgPanel.setLayout(makeLayout(jmbgPanel));
		jmbgPanel.add(Box.createHorizontalStrut(30));
		jmbgPanel.add(new JLabel("JMBG*  "));
		jmbgPanel.add(Box.createHorizontalStrut(6));
		jmbgTextField = new JTextField();
		jmbgPanel.add(jmbgTextField);
		jmbgPanel.add(Box.createHorizontalStrut(30));

		glavniPanel.add(jmbgPanel);
		glavniPanel.add(Box.createVerticalStrut(3));
		
				
		
		
		JPanel listaLekovaPanel = new JPanel();
		listaLekovaPanel.setLayout(new BoxLayout(listaLekovaPanel, BoxLayout.X_AXIS));
		////////////////////////////////////////////AAAAAAAAAA
		listaKolona = new JList<String>();
		listaKolona.setFixedCellHeight(40);
		listaKolona.setFixedCellWidth(this.getWidth());
		JScrollPane indeksScroll = new JScrollPane(listaKolona);
		listaLekovaPanel.add(Box.createHorizontalStrut(20));
		listaLekovaPanel.add(indeksScroll);
		listaLekovaPanel.add(Box.createHorizontalStrut(20));
		glavniPanel.add(listaLekovaPanel);
		glavniPanel.add(Box.createVerticalStrut(20));
		
		String[] naziviLekova = new  String[lekovi.size()];
		int i = 0;
		for (Lek lek : lekovi) {
			naziviLekova[i] = lek.getIme();
			i++;
		}
		JComboBox<String> comboLekovi = new JComboBox<String>(naziviLekova);
		JPanel naziviLekovaPanel = new JPanel();
		naziviLekovaPanel.setLayout(new BoxLayout(naziviLekovaPanel, BoxLayout.X_AXIS));
		naziviLekovaPanel.add(comboLekovi);
		glavniPanel.add(naziviLekovaPanel);
		glavniPanel.add(Box.createVerticalStrut(20));
		
		
		JPanel dodajPanel = new JPanel();
		dodajPanel.setLayout(makeLayout(dodajPanel));
		dodajPanel.add(Box.createGlue());
		JButton dodajButton = new JButton("Dodaj lek");
		dodajButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				 int counter = 0;
				 for (int i = 0; i < lekoviArray.length; i ++)
				     if (lekoviArray[i] != null)
				         counter ++;
				 lekoviArray[counter] =  lekovi.get(comboLekovi.getSelectedIndex());
				 
				refreshList();
			}
		});
		dodajPanel.add(dodajButton);
		dodajPanel.add(Box.createGlue());
		glavniPanel.add(dodajPanel);
		glavniPanel.add(Box.createVerticalStrut(9));

		
		JPanel buttonsPanel =  new JPanel();
		buttonsPanel.setLayout(makeLayout(buttonsPanel));
		buttonsPanel.add(Box.createGlue());
		JButton potvrda = new JButton("Potvrdi");
		buttonsPanel.add(potvrda);
		buttonsPanel.add(Box.createGlue());
		glavniPanel.add(buttonsPanel);
		glavniPanel.add(Box.createVerticalStrut(9));
		
		add(glavniPanel);
	
		
	}
	
	
	
	private void refreshList() {
		int i = 0;
		
		kolone = new String[lekoviArray.length];
		for (Lek lek : lekoviArray) {
			if(lekoviArray[i]!=null) {
				System.out.println(lek.getIme());
				kolone[i] = lek.getIme() + "         " + lek.getCena();
			}
			i++;
		}
		
		
		DefaultListModel<String> model = new DefaultListModel<>();
		for ( int j = 0; i < kolone.length; j++ ){
			  model.addElement( kolone[j] );
		}
		listaKolona = new JList<>(model);

	
	
	}
	
	
	private BoxLayout makeLayout(JPanel panel ) {
		return new  BoxLayout(panel, BoxLayout.X_AXIS);
	}
}
