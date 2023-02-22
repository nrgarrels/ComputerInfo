package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="computerinfo")
public class Computers {
	//private variables
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="MANUFACTURER")
	private String manufacturer;
	@Column(name="TYPE")
	private String type;
	@Column(name="OS")
	private String os;
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER, targetEntity=ComputerTech.class)
	@JoinColumn(name = "COMPUTERS_ID", referencedColumnName = "ID")
	private List<ComputerTech> ComputerTech;
	
	//default no arg
	public Computers() {
		
		
	}

	public Computers(String manufacturer, String type, String os) {
		super();
		this.type = type;
		this.os = os;
		this.manufacturer = manufacturer;
	}

	//Getters and Setters
	public List<ComputerTech> getComputerTech() {
		return ComputerTech;
	}

	public void setComputerTech(List<ComputerTech> students) {
		this.ComputerTech = students;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Manufacturer: " + this.manufacturer + ", Type: " + this.type + ", OS: " + this.os;
	}
	
	
	
}
