package fr.diginamic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Représente un allergène
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "allergene")
public class Allergene {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** nom : String */
	@Column(name = "nom")
	private String nom;

	/**
	 * Constructor
	 * 
	 */
	public Allergene() {

	}

	/**
	 * Constructor
	 * 
	 * @param nom nom de l'allergène
	 */
	public Allergene(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

}
