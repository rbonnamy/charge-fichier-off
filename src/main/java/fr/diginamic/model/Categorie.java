package fr.diginamic.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Représente la catégorie d'un produit
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "categories")
public class Categorie {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** nom : String */
	@Column(name = "nom", unique = true)
	private String nom;

	/** produits : List<Produit> */
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;

	/**
	 * Constructor
	 */
	public Categorie() {
	}

	/**
	 * Constructor
	 * 
	 * @param nom nom de la marque
	 */
	public Categorie(String nom) {
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

	/**
	 * Getter
	 * 
	 * @return the produits
	 */
	public List<Produit> getProduits() {
		return produits;
	}

	/**
	 * Setter
	 * 
	 * @param produits the produits to set
	 */
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
