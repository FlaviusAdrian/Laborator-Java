package model;

import java.time.LocalDateTime;

public abstract class Animal {
	protected String nume;
	protected TipRana rana;
	protected LocalDateTime dataCazarii;
	
	public Animal(String nume, TipRana rana) {
		this.nume = nume;
		this.rana = rana;
	}
	
	public String getNume() {
		return nume;
	}
	
	public TipRana getRana() {
		return rana;
	}
	
	public LocalDateTime getDataCazare() {
		return dataCazarii;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setRana(TipRana rana) {
		this.rana = rana;
	}
	
	public void seteazaDataCazare(LocalDateTime data) {
		this.dataCazarii = data ;
	}
	
	public abstract String getSpecie();
}