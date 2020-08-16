package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Recept {
	private int sifra;
	private String idLekara;
	private String jmbgPacijenta;
	private Date datumIVreme;
	private HashMap<Lek, Integer> lekoviIkolicina;
	private int ukupnaCena;
	
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public String getIdLekara() {
		return idLekara;
	}

	public void setIdLekara(String idLekara) {
		this.idLekara = idLekara;
	}

	public String getJmbgPacijenta() {
		return jmbgPacijenta;
	}

	public void setJmbgPacijenta(String jmbgPacijenta) {
		this.jmbgPacijenta = jmbgPacijenta;
	}

	public Date getDatumIVreme() {
		return datumIVreme;
	}

	public void setDatumIVreme(Date datumIVreme) {
		this.datumIVreme = datumIVreme;
	}

	public HashMap<Lek, Integer> getLekoviIkolicina() {
		return lekoviIkolicina;
	}

	public void setLekoviIkolicina(HashMap<Lek, Integer> lekoviIkolicina) {
		this.lekoviIkolicina = lekoviIkolicina;
	}

	public int getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(int ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public Recept(int sifra, String idLekara, String jmbgPacijenta, Date datumIVreme, HashMap<Lek, Integer> lekoviIkolicina,
			int ukupnaCena) {
		super();
		this.sifra = sifra;
		this.idLekara = idLekara;
		this.jmbgPacijenta = jmbgPacijenta;
		this.datumIVreme = datumIVreme;
		this.lekoviIkolicina = lekoviIkolicina;
		this.ukupnaCena = ukupnaCena;
	}
	
	
}
