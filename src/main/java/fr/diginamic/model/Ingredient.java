package fr.diginamic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Représente un ingrédient
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "ingredients")
public class Ingredient {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** nom : String */
	@Column(name = "nom", unique = true)
	private String nom;

	/**
	 * Constructor
	 * 
	 */
	public Ingredient() {
	}

	/**
	 * Constructor
	 * 
	 * @param nom nom de l'ingrédient
	 */
	public Ingredient(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Ingredient other = (Ingredient) obj;
		if (nom == null) {
			if (other.nom != null) {
				return false;
			}
		}
		else if (!nom.equals(other.nom)) {
			return false;
		}
		return true;
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
