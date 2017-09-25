package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class XClient implements Serializable{
	private static final long serialVersionUID = 1L;

	int idc;
	String name;
	String surname;
	String companyName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLI_SEQ_GEN")
	@SequenceGenerator(name="CLI_SEQ_GEN", sequenceName="CLI_SEQ", allocationSize=1)
	@XmlAttribute
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
