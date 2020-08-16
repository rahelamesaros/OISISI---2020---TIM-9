package GUI;


import javax.swing.*;

public class Registracija {

	public static void main(String[] args) {
		
		
		JFrame Registracija = new JFrame("REGISTRACIJA");
		
		
		
		JButton registracijaNovihKorisnika = new JButton("REGISTRACIJA NOVIH KORISNIKA");
		registracijaNovihKorisnika .setBounds(10,30,250,40);
		Registracija.add(registracijaNovihKorisnika );
		
		JButton prikazSvihKorisnika = new JButton("PRIKAZ SVIH KORISNIKA");
		prikazSvihKorisnika .setBounds(10,80,250,40);
		Registracija.add(prikazSvihKorisnika);
		
		JButton kreiranjeIzvestaja = new JButton("KREIRANJE IZVESTAJA");
		kreiranjeIzvestaja .setBounds(10,130,250,40);
		Registracija.add(kreiranjeIzvestaja);
		
		JButton dodavanjeLekova = new JButton("DODAVANJNE LEKOVA");
		dodavanjeLekova  .setBounds(10,180,250,40);
		Registracija.add(dodavanjeLekova );
		
		JButton izmenaLekova = new JButton("IZMENA LEKOVA");
		izmenaLekova.setBounds(10,230,250,40);
		Registracija.add(izmenaLekova);
		
		JButton prikazLekova = new JButton("PRIKAZ LEKOVA");
		prikazLekova .setBounds(10,280,250,40);
		Registracija.add(prikazLekova);
		
		JButton prikazRecepata = new JButton("PRIKAZ RECEPATA");
		prikazRecepata .setBounds(10,330,250,40);
		Registracija.add(prikazRecepata );
		
		JButton logickoBrisanje = new JButton("LOGICKO BRISANJE");
		logickoBrisanje .setBounds(10,380,250,40);
		Registracija.add(logickoBrisanje);
		
		JButton odjava = new JButton("ODJAVA");
		odjava .setBounds(10,500,250,40);
		Registracija.add(odjava);
		
		JLabel registracijatxt = new JLabel("REGISTRACIJA");
		registracijatxt.setBounds(450,50,250,50);
		Registracija.add(registracijatxt);
		
		JTextField ime = new JTextField("Ime");
		ime.setBounds(350,110,300,50);
		Registracija.add(ime);
		
		JTextField prezime = new JTextField("Prezime");
		prezime.setBounds(350,180,300,50);
		Registracija.add(prezime);
		
		JTextField korime = new JTextField("Korisnicko ime");
		korime.setBounds(350,250,300,50);
		Registracija.add(korime);
		
		
		JTextField loz = new JTextField("Lozinka");
		loz.setBounds(350,320,300,50);
		Registracija.add(loz);
		
		
		JRadioButton apotekarrb = new JRadioButton("Apotekar");
		apotekarrb.setBounds(400,390,80,50);
		Registracija.add(apotekarrb);
		
		
		JRadioButton lekarrb = new JRadioButton("Lekar");
		lekarrb.setBounds(500,390,80,50);
		Registracija.add(lekarrb);
		
		JButton dodajkorisnika = new JButton("DODAJ KORISNIKA");
		dodajkorisnika.setBounds(425,460,150,40);
		Registracija.add(dodajkorisnika);
		
		
		Registracija.setSize(1000,600);
		Registracija.setLayout(null);
		Registracija.setVisible(true);
		
	}

}
	
