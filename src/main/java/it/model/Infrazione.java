package it.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name= "Lista Infrazione")
public class Infrazione implements Serializable {
	
	private static final long serialVersionUID =1l;

	private int id;
	private String data;
	private String tipo;
	private double importo;
	



	private List<Auto> auto= new ArrayList<Auto>();
	public Infrazione() {}

	public Infrazione(int id, String data, String tipo, double importo) {
		super();
		this.id = id;
		this.data = data;
		this.tipo = tipo;
		this.importo = importo;
	}

	public Infrazione(String data, String tipo, double importo) {
		super();
		this.data = data;
		this.tipo = tipo;
		this.importo = importo;
	}
	@Id
	@Column(name="id_Infrazione")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {return id;}
	
	@Column(name="Date")
	public String getData() {return data;}
	
	@Column(name="Tipi")
	public String getTipo() {return tipo;}
	
	@Column(name="Importi")
	public double getImporto() {return importo;}
	@OneToMany(mappedBy = "infrazione", cascade= CascadeType.ALL)
	public List<Auto> getAuto() {return auto;}
	
	public void setId(int id) {this.id = id;}
	public void setData(String data) {this.data = data;}
	public void setTipo(String tipo) {	this.tipo = tipo;}
	public void setImporto(double importo) {this.importo = importo;	}
	


	public void setAuto(List<Auto> auto) {
		this.auto = auto;
	}

}
