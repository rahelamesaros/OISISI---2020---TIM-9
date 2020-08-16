package model;

public class Lek {
	private String sifra;
	private String ime;
	private String proizvodjac;
	private boolean recept;
	private float cena;
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public boolean isRecept() {
		return recept;
	}
	public void setRecept(boolean recept) {
		this.recept = recept;
	}
	public float getCena() {
		return cena;
	}
	public void setCena(float cena) {
		this.cena = cena;
	}
	
	public Lek(String sifra, String ime, String proizvodjac, boolean recept, float cena) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.proizvodjac = proizvodjac;
		this.recept = recept;
		this.cena = cena;
	}
	
	
	
}
