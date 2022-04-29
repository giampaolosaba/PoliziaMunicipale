package it.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="auto")
public class Auto {

	private String targa;
	private String marca;
	private String modello;
	private Infrazione infrazione;
	public Auto () {}

	public Auto(String targa, String marca, String modello) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
	}
	//getter
	@Id
	@Column (name="targhe")
	public String getTarga() {	return targa;}
	@Column (name="marche")
	public String getMarca() {return marca;}
	@Column (name="modello")
	public String getModello() {return modello;}
	//setter
	public void setTarga(String targa) {this.targa = targa;}
	public void setMarca(String marca) {this.marca = marca;}
	public void setModello(String modello) {this.modello = modello;}

	@ManyToOne
	@JoinColumn(name="id_infrazione")
	public Infrazione getInfrazione() {
		return infrazione;
	}

	public void setInfrazione(Infrazione infrazione) {
		this.infrazione = infrazione;
	}
	

}
