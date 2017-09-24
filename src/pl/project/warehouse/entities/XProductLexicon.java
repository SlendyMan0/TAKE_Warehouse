package pl.project.warehouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.GenerationType;

@Entity
@XmlRootElement
public class XProductLexicon implements Serializable{
	private static final long serialVersionUID = 1L;
	
	int idl;
	String name;
	String description;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LEX_SEQ_GEN")
	@SequenceGenerator(name="LEX_SEQ_GEN", sequenceName="LEX_SEQ", allocationSize=1)
	@XmlAttribute
	public int getIdl() {
		return idl;
	}
	public void setIdl(int idl) {
		this.idl = idl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
