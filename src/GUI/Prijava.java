package GUI;

import javax.swing.*;


public class Prijava {
	
	public static void main(String[] args) {
		
		
		JFrame Prijava = new JFrame("PRIJAVA");
		
		JTextField korisnickoime = new JTextField("Korisnicko ime");
		korisnickoime.setBounds(350,160,300,50);
		Prijava.add(korisnickoime);
		
		JTextField lozinka = new JTextField("Lozinka");
		lozinka.setBounds(350,230,300,50);
		Prijava.add(lozinka);
		
		JButton prijavise = new JButton("PRIJAVI SE");
		prijavise.setBounds(425,310,150,40);
		Prijava.add(prijavise);
		
		Prijava.setSize(1000,600);
		Prijava.setLayout(null);
		Prijava.setVisible(true);
		
	}

}
