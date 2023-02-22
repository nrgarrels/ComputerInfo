package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ComputerTech")
public class ComputerTech {
	@Id
	@GeneratedValue
	private int id;
	private String computerTechName;
	
	@ManyToOne (cascade=CascadeType.PERSIST)
	private Computers computersInfo;
	
	public ComputerTech() {
		super();
	}
	
	public ComputerTech(int id, String computerTechName) {
		super();
		this.id = id;
		this.computerTechName = computerTechName;
		
	}

	public ComputerTech(String computerTechName) {
		super();
		this.computerTechName = computerTechName;
		
	}

	public int getId() {
		return id;
	}
	
	public void setID(int id) {
		
		this.id = id;
	}
	
	public Computers getComputersId() {
		return computersInfo;
	}

	public void setComputers(Computers computersInfo) {
		this.computersInfo = computersInfo;
	}
	public String getComputerTechName() {
		return computerTechName;
	}
	
	public void setComputerTechName(String computerTechName) {
		
		this.computerTechName = computerTechName;
	}
	
	@Override
	public String toString() {
		
		return "Shopper [id= " + id + ", ComputerTechName=" + computerTechName + "]";
	}
	
}
