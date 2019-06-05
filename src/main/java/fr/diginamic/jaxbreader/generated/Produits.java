//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2019.05.17 � 03:12:34 PM CEST 
//

package fr.diginamic.jaxbreader.generated;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Classe Java pour anonymous complex type.
 * 
 * <p>
 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produit" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="paysManufact" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="marque" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ingredients" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ingredient" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="energie100g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="graisse100g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="sucres100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="fibres100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proteines100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="sel100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                   &lt;element name="vitA100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitD100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitE100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitK100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitC100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitB1100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitB2100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitPP100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitB6100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="vitB9100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="calcium100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="magnesium100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fer100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="betaCarotene100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="presenceHuilePalme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="allergenes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="allergene" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="additifs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="additif" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="categorie" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *                 &lt;attribute name="nom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="nutritionGradeFr" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "produit" })
@XmlRootElement(name = "produits")
public class Produits {

	@XmlElement(required = true)
	protected List<Produits.ProduitXml> produit;

	/**
	 * Gets the value of the produit property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the produit property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getProduit().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Produits.ProduitXml }
	 * 
	 * 
	 */
	public List<Produits.ProduitXml> getProduit() {
		if (produit == null) {
			produit = new ArrayList<Produits.ProduitXml>();
		}
		return this.produit;
	}

	/**
	 * <p>
	 * Classe Java pour anonymous complex type.
	 * 
	 * <p>
	 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
	 *         &lt;element name="paysManufact" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
	 *         &lt;element name="marque" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="ingredients" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="ingredient" maxOccurs="unbounded">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="energie100g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="graisse100g" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="sucres100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
	 *         &lt;element name="fibres100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="proteines100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
	 *         &lt;element name="sel100g" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
	 *         &lt;element name="vitA100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitD100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitE100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitK100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitC100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitB1100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitB2100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitPP100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitB6100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="vitB9100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="calcium100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="magnesium100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="fer100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="betaCarotene100g" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *         &lt;element name="presenceHuilePalme" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *         &lt;element name="allergenes" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="allergene" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="additifs" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="additif" minOccurs="0">
	 *                     &lt;complexType>
	 *                       &lt;complexContent>
	 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                           &lt;sequence>
	 *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                           &lt;/sequence>
	 *                         &lt;/restriction>
	 *                       &lt;/complexContent>
	 *                     &lt;/complexType>
	 *                   &lt;/element>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *       &lt;attribute name="categorie" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
	 *       &lt;attribute name="nom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
	 *       &lt;attribute name="nutritionGradeFr" use="required" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "pays", "paysManufact", "marque", "ingredients", "energie100G", "graisse100G",
			"sucres100G", "fibres100G", "proteines100G", "sel100G", "vitA100G", "vitD100G", "vitE100G", "vitK100G",
			"vitC100G", "vitB1100G", "vitB2100G", "vitPP100G", "vitB6100G", "vitB9100G", "calcium100G", "magnesium100G",
			"fer100G", "betaCarotene100G", "presenceHuilePalme", "allergenes", "additifs" })
	public static class ProduitXml {

		@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
		@XmlSchemaType(name = "normalizedString")
		protected String pays;
		@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
		@XmlSchemaType(name = "normalizedString")
		protected String paysManufact;
		protected Produits.ProduitXml.MarqueXml marque;
		protected Produits.ProduitXml.IngredientsXml ingredients;
		@XmlElement(name = "energie100g")
		protected Integer energie100G;
		@XmlElement(name = "graisse100g")
		protected Integer graisse100G;
		@XmlElement(name = "sucres100g")
		protected BigDecimal sucres100G;
		@XmlElement(name = "fibres100g")
		protected String fibres100G;
		@XmlElement(name = "proteines100g")
		protected BigDecimal proteines100G;
		@XmlElement(name = "sel100g")
		protected BigDecimal sel100G;
		@XmlElement(name = "vitA100g")
		protected String vitA100G;
		@XmlElement(name = "vitD100g")
		protected String vitD100G;
		@XmlElement(name = "vitE100g")
		protected String vitE100G;
		@XmlElement(name = "vitK100g")
		protected String vitK100G;
		@XmlElement(name = "vitC100g")
		protected String vitC100G;
		@XmlElement(name = "vitB1100g")
		protected String vitB1100G;
		@XmlElement(name = "vitB2100g")
		protected String vitB2100G;
		@XmlElement(name = "vitPP100g")
		protected String vitPP100G;
		@XmlElement(name = "vitB6100g")
		protected String vitB6100G;
		@XmlElement(name = "vitB9100g")
		protected String vitB9100G;
		@XmlElement(name = "calcium100g")
		protected String calcium100G;
		@XmlElement(name = "magnesium100g")
		protected String magnesium100G;
		@XmlElement(name = "fer100g")
		protected String fer100G;
		@XmlElement(name = "betaCarotene100g")
		protected String betaCarotene100G;
		protected Integer presenceHuilePalme;
		protected Produits.ProduitXml.AllergenesXml allergenes;
		protected Produits.ProduitXml.AdditifsXml additifs;
		@XmlAttribute(name = "categorie", required = true)
		@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
		@XmlSchemaType(name = "normalizedString")
		protected String categorie;
		@XmlAttribute(name = "nom", required = true)
		protected String nom;
		@XmlAttribute(name = "nutritionGradeFr", required = true)
		@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
		@XmlSchemaType(name = "normalizedString")
		protected String nutritionGradeFr;

		/**
		 * Obtient la valeur de la propri�t� pays.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPays() {
			return pays;
		}

		/**
		 * D�finit la valeur de la propri�t� pays.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setPays(String value) {
			this.pays = value;
		}

		/**
		 * Obtient la valeur de la propri�t� paysManufact.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getPaysManufact() {
			return paysManufact;
		}

		/**
		 * D�finit la valeur de la propri�t� paysManufact.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setPaysManufact(String value) {
			this.paysManufact = value;
		}

		/**
		 * Obtient la valeur de la propri�t� marque.
		 * 
		 * @return possible object is {@link Produits.ProduitXml.MarqueXml }
		 * 
		 */
		public Produits.ProduitXml.MarqueXml getMarque() {
			return marque;
		}

		/**
		 * D�finit la valeur de la propri�t� marque.
		 * 
		 * @param value allowed object is {@link Produits.ProduitXml.MarqueXml }
		 * 
		 */
		public void setMarque(Produits.ProduitXml.MarqueXml value) {
			this.marque = value;
		}

		/**
		 * Obtient la valeur de la propri�t� ingredients.
		 * 
		 * @return possible object is {@link Produits.ProduitXml.IngredientsXml }
		 * 
		 */
		public Produits.ProduitXml.IngredientsXml getIngredients() {
			return ingredients;
		}

		/**
		 * D�finit la valeur de la propri�t� ingredients.
		 * 
		 * @param value allowed object is {@link Produits.ProduitXml.IngredientsXml }
		 * 
		 */
		public void setIngredients(Produits.ProduitXml.IngredientsXml value) {
			this.ingredients = value;
		}

		/**
		 * Obtient la valeur de la propri�t� energie100G.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getEnergie100G() {
			return energie100G;
		}

		/**
		 * D�finit la valeur de la propri�t� energie100G.
		 * 
		 * @param value allowed object is {@link Integer }
		 * 
		 */
		public void setEnergie100G(Integer value) {
			this.energie100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� graisse100G.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getGraisse100G() {
			return graisse100G;
		}

		/**
		 * D�finit la valeur de la propri�t� graisse100G.
		 * 
		 * @param value allowed object is {@link Integer }
		 * 
		 */
		public void setGraisse100G(Integer value) {
			this.graisse100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� sucres100G.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getSucres100G() {
			return sucres100G;
		}

		/**
		 * D�finit la valeur de la propri�t� sucres100G.
		 * 
		 * @param value allowed object is {@link BigDecimal }
		 * 
		 */
		public void setSucres100G(BigDecimal value) {
			this.sucres100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� fibres100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFibres100G() {
			return fibres100G;
		}

		/**
		 * D�finit la valeur de la propri�t� fibres100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setFibres100G(String value) {
			this.fibres100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� proteines100G.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getProteines100G() {
			return proteines100G;
		}

		/**
		 * D�finit la valeur de la propri�t� proteines100G.
		 * 
		 * @param value allowed object is {@link BigDecimal }
		 * 
		 */
		public void setProteines100G(BigDecimal value) {
			this.proteines100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� sel100G.
		 * 
		 * @return possible object is {@link BigDecimal }
		 * 
		 */
		public BigDecimal getSel100G() {
			return sel100G;
		}

		/**
		 * D�finit la valeur de la propri�t� sel100G.
		 * 
		 * @param value allowed object is {@link BigDecimal }
		 * 
		 */
		public void setSel100G(BigDecimal value) {
			this.sel100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitA100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitA100G() {
			return vitA100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitA100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitA100G(String value) {
			this.vitA100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitD100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitD100G() {
			return vitD100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitD100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitD100G(String value) {
			this.vitD100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitE100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitE100G() {
			return vitE100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitE100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitE100G(String value) {
			this.vitE100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitK100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitK100G() {
			return vitK100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitK100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitK100G(String value) {
			this.vitK100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitC100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitC100G() {
			return vitC100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitC100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitC100G(String value) {
			this.vitC100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitB1100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitB1100G() {
			return vitB1100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitB1100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitB1100G(String value) {
			this.vitB1100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitB2100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitB2100G() {
			return vitB2100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitB2100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitB2100G(String value) {
			this.vitB2100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitPP100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitPP100G() {
			return vitPP100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitPP100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitPP100G(String value) {
			this.vitPP100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitB6100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitB6100G() {
			return vitB6100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitB6100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitB6100G(String value) {
			this.vitB6100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� vitB9100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getVitB9100G() {
			return vitB9100G;
		}

		/**
		 * D�finit la valeur de la propri�t� vitB9100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setVitB9100G(String value) {
			this.vitB9100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� calcium100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCalcium100G() {
			return calcium100G;
		}

		/**
		 * D�finit la valeur de la propri�t� calcium100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCalcium100G(String value) {
			this.calcium100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� magnesium100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getMagnesium100G() {
			return magnesium100G;
		}

		/**
		 * D�finit la valeur de la propri�t� magnesium100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setMagnesium100G(String value) {
			this.magnesium100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� fer100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getFer100G() {
			return fer100G;
		}

		/**
		 * D�finit la valeur de la propri�t� fer100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setFer100G(String value) {
			this.fer100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� betaCarotene100G.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getBetaCarotene100G() {
			return betaCarotene100G;
		}

		/**
		 * D�finit la valeur de la propri�t� betaCarotene100G.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setBetaCarotene100G(String value) {
			this.betaCarotene100G = value;
		}

		/**
		 * Obtient la valeur de la propri�t� presenceHuilePalme.
		 * 
		 * @return possible object is {@link Integer }
		 * 
		 */
		public Integer getPresenceHuilePalme() {
			return presenceHuilePalme;
		}

		/**
		 * D�finit la valeur de la propri�t� presenceHuilePalme.
		 * 
		 * @param value allowed object is {@link Integer }
		 * 
		 */
		public void setPresenceHuilePalme(Integer value) {
			this.presenceHuilePalme = value;
		}

		/**
		 * Obtient la valeur de la propri�t� allergenes.
		 * 
		 * @return possible object is {@link Produits.ProduitXml.AllergenesXml }
		 * 
		 */
		public Produits.ProduitXml.AllergenesXml getAllergenes() {
			return allergenes;
		}

		/**
		 * D�finit la valeur de la propri�t� allergenes.
		 * 
		 * @param value allowed object is {@link Produits.ProduitXml.AllergenesXml }
		 * 
		 */
		public void setAllergenes(Produits.ProduitXml.AllergenesXml value) {
			this.allergenes = value;
		}

		/**
		 * Obtient la valeur de la propri�t� additifs.
		 * 
		 * @return possible object is {@link Produits.ProduitXml.AdditifsXml }
		 * 
		 */
		public Produits.ProduitXml.AdditifsXml getAdditifs() {
			return additifs;
		}

		/**
		 * D�finit la valeur de la propri�t� additifs.
		 * 
		 * @param value allowed object is {@link Produits.ProduitXml.AdditifsXml }
		 * 
		 */
		public void setAdditifs(Produits.ProduitXml.AdditifsXml value) {
			this.additifs = value;
		}

		/**
		 * Obtient la valeur de la propri�t� categorie.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getCategorie() {
			return categorie;
		}

		/**
		 * D�finit la valeur de la propri�t� categorie.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setCategorie(String value) {
			this.categorie = value;
		}

		/**
		 * Obtient la valeur de la propri�t� nom.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * D�finit la valeur de la propri�t� nom.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNom(String value) {
			this.nom = value;
		}

		/**
		 * Obtient la valeur de la propri�t� nutritionGradeFr.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNutritionGradeFr() {
			return nutritionGradeFr;
		}

		/**
		 * D�finit la valeur de la propri�t� nutritionGradeFr.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNutritionGradeFr(String value) {
			this.nutritionGradeFr = value;
		}

		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 * 
		 * <p>
		 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="additif" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "additif" })
		public static class AdditifsXml {

			protected Produits.ProduitXml.AdditifsXml.AdditifXml additif;

			/**
			 * Obtient la valeur de la propri�t� additif.
			 * 
			 * @return possible object is {@link Produits.ProduitXml.AdditifsXml.AdditifXml }
			 * 
			 */
			public Produits.ProduitXml.AdditifsXml.AdditifXml getAdditif() {
				return additif;
			}

			/**
			 * D�finit la valeur de la propri�t� additif.
			 * 
			 * @param value allowed object is {@link Produits.ProduitXml.AdditifsXml.AdditifXml }
			 * 
			 */
			public void setAdditif(Produits.ProduitXml.AdditifsXml.AdditifXml value) {
				this.additif = value;
			}

			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 * 
			 * <p>
			 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "nom" })
			public static class AdditifXml {

				protected String nom;

				/**
				 * Obtient la valeur de la propri�t� nom.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getNom() {
					return nom;
				}

				/**
				 * D�finit la valeur de la propri�t� nom.
				 * 
				 * @param value allowed object is {@link String }
				 * 
				 */
				public void setNom(String value) {
					this.nom = value;
				}

			}

		}

		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 * 
		 * <p>
		 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="allergene" minOccurs="0">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "allergene" })
		public static class AllergenesXml {

			protected Produits.ProduitXml.AllergenesXml.AllergeneXml allergene;

			/**
			 * Obtient la valeur de la propri�t� allergene.
			 * 
			 * @return possible object is {@link Produits.ProduitXml.AllergenesXml.AllergeneXml }
			 * 
			 */
			public Produits.ProduitXml.AllergenesXml.AllergeneXml getAllergene() {
				return allergene;
			}

			/**
			 * D�finit la valeur de la propri�t� allergene.
			 * 
			 * @param value allowed object is {@link Produits.ProduitXml.AllergenesXml.AllergeneXml }
			 * 
			 */
			public void setAllergene(Produits.ProduitXml.AllergenesXml.AllergeneXml value) {
				this.allergene = value;
			}

			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 * 
			 * <p>
			 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "nom" })
			public static class AllergeneXml {

				protected String nom;

				/**
				 * Obtient la valeur de la propri�t� nom.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getNom() {
					return nom;
				}

				/**
				 * D�finit la valeur de la propri�t� nom.
				 * 
				 * @param value allowed object is {@link String }
				 * 
				 */
				public void setNom(String value) {
					this.nom = value;
				}

			}

		}

		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 * 
		 * <p>
		 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="ingredient" maxOccurs="unbounded">
		 *           &lt;complexType>
		 *             &lt;complexContent>
		 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *                 &lt;sequence>
		 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *                 &lt;/sequence>
		 *               &lt;/restriction>
		 *             &lt;/complexContent>
		 *           &lt;/complexType>
		 *         &lt;/element>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "ingredient" })
		public static class IngredientsXml {

			@XmlElement(required = true)
			protected List<Produits.ProduitXml.IngredientsXml.IngredientXml> ingredient;

			/**
			 * Gets the value of the ingredient property.
			 * 
			 * <p>
			 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the ingredient property.
			 * 
			 * <p>
			 * For example, to add a new item, do as follows:
			 * 
			 * <pre>
			 * getIngredient().add(newItem);
			 * </pre>
			 * 
			 * 
			 * <p>
			 * Objects of the following type(s) are allowed in the list {@link Produits.ProduitXml.IngredientsXml.IngredientXml }
			 * 
			 * 
			 */
			public List<Produits.ProduitXml.IngredientsXml.IngredientXml> getIngredient() {
				if (ingredient == null) {
					ingredient = new ArrayList<Produits.ProduitXml.IngredientsXml.IngredientXml>();
				}
				return this.ingredient;
			}

			/**
			 * <p>
			 * Classe Java pour anonymous complex type.
			 * 
			 * <p>
			 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
			 * 
			 * <pre>
			 * &lt;complexType>
			 *   &lt;complexContent>
			 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
			 *       &lt;sequence>
			 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
			 *       &lt;/sequence>
			 *     &lt;/restriction>
			 *   &lt;/complexContent>
			 * &lt;/complexType>
			 * </pre>
			 * 
			 * 
			 */
			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "nom" })
			public static class IngredientXml {

				protected String nom;

				/**
				 * Obtient la valeur de la propri�t� nom.
				 * 
				 * @return possible object is {@link String }
				 * 
				 */
				public String getNom() {
					return nom;
				}

				/**
				 * D�finit la valeur de la propri�t� nom.
				 * 
				 * @param value allowed object is {@link String }
				 * 
				 */
				public void setNom(String value) {
					this.nom = value;
				}

			}

		}

		/**
		 * <p>
		 * Classe Java pour anonymous complex type.
		 * 
		 * <p>
		 * Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "nom" })
		public static class MarqueXml {

			@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
			@XmlSchemaType(name = "normalizedString")
			protected String nom;

			/**
			 * Obtient la valeur de la propri�t� nom.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNom() {
				return nom;
			}

			/**
			 * D�finit la valeur de la propri�t� nom.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setNom(String value) {
				this.nom = value;
			}

		}

	}

}
