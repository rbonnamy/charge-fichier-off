package fr.diginamic.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import fr.diginamic.utils.ListUtils;

/**
 * Représente un produit
 * 
 * @author DIGINAMIC
 *
 */
@Entity
@Table(name = "produits")
@XmlAccessorType(XmlAccessType.FIELD)
public class Produit implements Comparable<Produit> {

	/** id : Long */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/** nom : String */
	@XmlElement(required = true)
	@Column(name = "nom")
	private String nom;

	/** nutritionGradeFr : String */
	@XmlAttribute(required = true)
	private String grade;

	/** pays : String */
	private String pays;

	/** paysManufact : String */
	private String paysManufact;

	/** categorie : String */
	@XmlElement(required = true)
	@ManyToOne
	@JoinColumn(name = "id_cat")
	private Categorie categorie;

	/** marque : String */
	@XmlElement(required = true)
	@ManyToOne
	@JoinColumn(name = "id_mrq")
	private Marque marque;

	/** ingredients : String */
	@XmlElementWrapper(name = "ingredients")
	@XmlElement(name = "ingredient")
	@ManyToMany
	@JoinTable(name = "produits_ing", joinColumns = @JoinColumn(name = "id_prd", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_ing", referencedColumnName = "id"))
	private List<Ingredient> ingredients = new ArrayList<>();

	/** energie100g : String */
	@Column(name = "energie")
	private String energie100g;

	/** graisse100g : String */
	@Column(name = "graisse")
	private String graisse100g;

	/** sucres100g : String */
	@Column(name = "sucre")
	private String sucres100g;

	/** fibres100g : String */
	@Column(name = "fibres")
	private String fibres100g;

	/** proteines100g : String */
	@Column(name = "proteines")
	private String proteines100g;

	/** sel100g : String */
	@Column(name = "sel")
	private String sel100g;

	/** vitA100g : String */
	@Transient
	private String vitA100g;

	/** vitD100g : String */
	@Transient
	private String vitD100g;

	/** vitE100g : String */
	@Transient
	private String vitE100g;

	/** vitK100g : String */
	@Transient
	private String vitK100g;

	/** vitC100g : String */
	@Transient
	private String vitC100g;

	/** vitB1100g : String */
	@Transient
	private String vitB1100g;

	/** vitB2100g : String */
	@Transient
	private String vitB2100g;

	/** vitPP100g : String */
	@Transient
	private String vitPP100g;

	/** vitB6100g : String */
	@Transient
	private String vitB6100g;

	/** vitB9100g : String */
	@Transient
	private String vitB9100g;

	/** vitB12100g : String */
	@Transient
	private String vitB12100g;

	/** calcium100g : String */
	@Transient
	private String calcium100g;

	/** magnesium100g : String */
	@Transient
	private String magnesium100g;

	/** iron100g : String */
	@Transient
	private String iron100g;

	/** fer100g : String */
	@Transient
	private String fer100g;

	/** betaCarotene100g : String */
	@Transient
	private String betaCarotene100g;

	/** presenceHuilePalme : String */
	@Transient
	private String presenceHuilePalme;

	/** allergenes : String */
	@XmlElementWrapper(name = "allergenes")
	@XmlElement(name = "allergene")
	@Transient
	private List<Allergene> allergenes;

	/** additifs : String */
	@XmlElementWrapper(name = "additifs")
	@XmlElement(name = "additif")
	@Transient
	private List<Additif> additifs;

	/**
	 * Constructor
	 * 
	 */
	public Produit() {

	}

	/**
	 * Constructor
	 * 
	 * @param liste liste
	 */
	public Produit(List<String> liste) {
		pays = liste.get(31);
		paysManufact = liste.get(19);
		nom = liste.get(7);
		marque = new Marque(liste.get(12));
		categorie = new Categorie(liste.get(61));
		grade = liste.get(53);
		ingredients = ListUtils.toList(liste.get(34), Ingredient.class);
		allergenes = ListUtils.toList(liste.get(35), Allergene.class);
		additifs = ListUtils.toList(liste.get(46), Additif.class);
		presenceHuilePalme = liste.get(47);
		energie100g = liste.get(68);
		graisse100g = liste.get(70);
		sucres100g = liste.get(107);
		fibres100g = liste.get(116);
		proteines100g = liste.get(117);
		sel100g = liste.get(121);
		vitA100g = liste.get(124);
		betaCarotene100g = liste.get(125);
		vitD100g = liste.get(126);
		vitE100g = liste.get(127);
		vitK100g = liste.get(128);
		vitC100g = liste.get(129);
		vitB1100g = liste.get(130);
		vitB2100g = liste.get(131);
		vitPP100g = liste.get(132);
		vitB6100g = liste.get(133);
		vitB9100g = liste.get(134);
		fer100g = liste.get(145);
		calcium100g = liste.get(143);
		magnesium100g = liste.get(146);

	}

	/**
	 * retourne si le produit a une marque rensignée ou non
	 * 
	 * @return boolean
	 */
	public boolean isSansMarque() {
		return marque == null || (marque.getNom().isEmpty() || marque.getNom().equals("?")
				|| marque.getNom().contains("Sans marque"));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marque == null) ? 0 : marque.hashCode());
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
		Produit other = (Produit) obj;
		if (marque == null) {
			if (other.marque != null) {
				return false;
			}
		}
		else if (!marque.equals(other.marque)) {
			return false;
		}
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

	@Override
	public String toString() {
		return "Nom : " + nom + " - Marque: " + marque + " - Grade : " + grade;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * Setter
	 * 
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * Getter
	 * 
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * Setter
	 * 
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
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
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * Setter
	 * 
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/**
	 * Getter
	 * 
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Setter
	 * 
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * Getter
	 * 
	 * @return the energie100g
	 */
	public String getEnergie100g() {
		return energie100g;
	}

	/**
	 * Setter
	 * 
	 * @param energie100g the energie100g to set
	 */
	public void setEnergie100g(String energie100g) {
		this.energie100g = energie100g;
	}

	/**
	 * Getter
	 * 
	 * @return the graisse100g
	 */
	public String getGraisse100g() {
		return graisse100g;
	}

	/**
	 * Setter
	 * 
	 * @param graisse100g the graisse100g to set
	 */
	public void setGraisse100g(String graisse100g) {
		this.graisse100g = graisse100g;
	}

	/**
	 * Getter
	 * 
	 * @return the sucres100g
	 */
	public String getSucres100g() {
		return sucres100g;
	}

	/**
	 * Setter
	 * 
	 * @param sucres100g the sucres100g to set
	 */
	public void setSucres100g(String sucres100g) {
		this.sucres100g = sucres100g;
	}

	/**
	 * Getter
	 * 
	 * @return the fibres100g
	 */
	public String getFibres100g() {
		return fibres100g;
	}

	/**
	 * Setter
	 * 
	 * @param fibres100g the fibres100g to set
	 */
	public void setFibres100g(String fibres100g) {
		this.fibres100g = fibres100g;
	}

	/**
	 * Getter
	 * 
	 * @return the proteines100g
	 */
	public String getProteines100g() {
		return proteines100g;
	}

	/**
	 * Setter
	 * 
	 * @param proteines100g the proteines100g to set
	 */
	public void setProteines100g(String proteines100g) {
		this.proteines100g = proteines100g;
	}

	/**
	 * Getter
	 * 
	 * @return the sel100g
	 */
	public String getSel100g() {
		return sel100g;
	}

	/**
	 * Setter
	 * 
	 * @param sel100g the sel100g to set
	 */
	public void setSel100g(String sel100g) {
		this.sel100g = sel100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitA100g
	 */
	public String getVitA100g() {
		return vitA100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitA100g the vitA100g to set
	 */
	public void setVitA100g(String vitA100g) {
		this.vitA100g = vitA100g;
	}

	/**
	 * Getter
	 * 
	 * @return the fer100g
	 */
	public String getFer100g() {
		return fer100g;
	}

	/**
	 * Setter
	 * 
	 * @param fer100g the fer100g to set
	 */
	public void setFer100g(String fer100g) {
		this.fer100g = fer100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitD100g
	 */
	public String getVitD100g() {
		return vitD100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitD100g the vitD100g to set
	 */
	public void setVitD100g(String vitD100g) {
		this.vitD100g = vitD100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitE100g
	 */
	public String getVitE100g() {
		return vitE100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitE100g the vitE100g to set
	 */
	public void setVitE100g(String vitE100g) {
		this.vitE100g = vitE100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitK100g
	 */
	public String getVitK100g() {
		return vitK100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitK100g the vitK100g to set
	 */
	public void setVitK100g(String vitK100g) {
		this.vitK100g = vitK100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitC100g
	 */
	public String getVitC100g() {
		return vitC100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitC100g the vitC100g to set
	 */
	public void setVitC100g(String vitC100g) {
		this.vitC100g = vitC100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitB1100g
	 */
	public String getVitB1100g() {
		return vitB1100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitB1100g the vitB1100g to set
	 */
	public void setVitB1100g(String vitB1100g) {
		this.vitB1100g = vitB1100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitB2100g
	 */
	public String getVitB2100g() {
		return vitB2100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitB2100g the vitB2100g to set
	 */
	public void setVitB2100g(String vitB2100g) {
		this.vitB2100g = vitB2100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitPP100g
	 */
	public String getVitPP100g() {
		return vitPP100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitPP100g the vitPP100g to set
	 */
	public void setVitPP100g(String vitPP100g) {
		this.vitPP100g = vitPP100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitB6100g
	 */
	public String getVitB6100g() {
		return vitB6100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitB6100g the vitB6100g to set
	 */
	public void setVitB6100g(String vitB6100g) {
		this.vitB6100g = vitB6100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitB9100g
	 */
	public String getVitB9100g() {
		return vitB9100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitB9100g the vitB9100g to set
	 */
	public void setVitB9100g(String vitB9100g) {
		this.vitB9100g = vitB9100g;
	}

	/**
	 * Getter
	 * 
	 * @return the vitB12100g
	 */
	public String getVitB12100g() {
		return vitB12100g;
	}

	/**
	 * Setter
	 * 
	 * @param vitB12100g the vitB12100g to set
	 */
	public void setVitB12100g(String vitB12100g) {
		this.vitB12100g = vitB12100g;
	}

	/**
	 * Getter
	 * 
	 * @return the calcium100g
	 */
	public String getCalcium100g() {
		return calcium100g;
	}

	/**
	 * Setter
	 * 
	 * @param calcium100g the calcium100g to set
	 */
	public void setCalcium100g(String calcium100g) {
		this.calcium100g = calcium100g;
	}

	/**
	 * Getter
	 * 
	 * @return the magnesium100g
	 */
	public String getMagnesium100g() {
		return magnesium100g;
	}

	/**
	 * Setter
	 * 
	 * @param magnesium100g the magnesium100g to set
	 */
	public void setMagnesium100g(String magnesium100g) {
		this.magnesium100g = magnesium100g;
	}

	/**
	 * Getter
	 * 
	 * @return the iron100g
	 */
	public String getIron100g() {
		return iron100g;
	}

	/**
	 * Setter
	 * 
	 * @param iron100g the iron100g to set
	 */
	public void setIron100g(String iron100g) {
		this.iron100g = iron100g;
	}

	/**
	 * Getter
	 * 
	 * @return the betaCarotene100g
	 */
	public String getBetaCarotene100g() {
		return betaCarotene100g;
	}

	/**
	 * Setter
	 * 
	 * @param betaCarotene100g the betaCarotene100g to set
	 */
	public void setBetaCarotene100g(String betaCarotene100g) {
		this.betaCarotene100g = betaCarotene100g;
	}

	/**
	 * Getter
	 * 
	 * @return the paysManufact
	 */
	public String getPaysManufact() {
		return paysManufact;
	}

	/**
	 * Setter
	 * 
	 * @param paysManufact the paysManufact to set
	 */
	public void setPaysManufact(String paysManufact) {
		this.paysManufact = paysManufact;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the allergenes
	 */
	public List<Allergene> getAllergenes() {
		return allergenes;
	}

	/**
	 * Setter
	 * 
	 * @param allergenes the allergenes to set
	 */
	public void setAllergenes(List<Allergene> allergenes) {
		this.allergenes = allergenes;
	}

	/**
	 * Getter
	 * 
	 * @return the presenceHuilePalme
	 */
	public String getPresenceHuilePalme() {
		return presenceHuilePalme;
	}

	/**
	 * Setter
	 * 
	 * @param presenceHuilePalme the presenceHuilePalme to set
	 */
	public void setPresenceHuilePalme(String presenceHuilePalme) {
		this.presenceHuilePalme = presenceHuilePalme;
	}

	/**
	 * Getter
	 * 
	 * @return the additifs
	 */
	public List<Additif> getAdditifs() {
		return additifs;
	}

	/**
	 * Setter
	 * 
	 * @param additifs the additifs to set
	 */
	public void setAdditifs(List<Additif> additifs) {
		this.additifs = additifs;
	}

	@Override
	public int compareTo(Produit autre) {
		int compareCateg = categorie.getNom().compareTo(autre.getCategorie().getNom());
		if (compareCateg == 0) {
			int compareMarque = marque.getNom().compareTo(autre.getMarque().getNom());
			if (compareMarque == 0) {
				return nom.compareTo(autre.getNom());
			}
			return compareMarque;
		}
		return compareCateg;
	}

}
