package fr.diginamic.transformer;

import org.springframework.stereotype.Component;

import fr.diginamic.jaxbreader.generated.Produits.ProduitXml;
import fr.diginamic.jaxbreader.generated.Produits.ProduitXml.IngredientsXml.IngredientXml;
import fr.diginamic.model.Categorie;
import fr.diginamic.model.Ingredient;
import fr.diginamic.model.Marque;
import fr.diginamic.model.Produit;
import fr.diginamic.utils.StringUtils;

/**
 * Classe qui transforme une instance de {@link ProduitXml} en instance de {@link Produit}
 * 
 * @author DIGINAMIC
 *
 */
@Component
public class ProduitTransformer {

	/**
	 * Méthode qui transforme une instance de {@link ProduitXml} en instance de {@link Produit}
	 * 
	 * @param produitXml instance de {@link ProduitXml}
	 * @return Produit
	 */
	public Produit toProduit(ProduitXml produitXml) {
		Produit produit = new Produit();
		produit.setNom(produitXml.getNom());
		produit.setGrade(produitXml.getNutritionGradeFr());
		produit.setMarque(new Marque(produitXml.getMarque().getNom()));
		produit.setCategorie(new Categorie(produitXml.getCategorie()));
		produit.setEnergie100g(StringUtils.toString(produitXml.getEnergie100G()));
		produit.setGraisse100g(StringUtils.toString(produitXml.getGraisse100G()));
		produit.setSucres100g(StringUtils.toString(produitXml.getSucres100G()));
		produit.setFibres100g(produitXml.getFibres100G());
		produit.setProteines100g(StringUtils.toString(produitXml.getProteines100G()));
		produit.setSucres100g(StringUtils.toString(produitXml.getSel100G()));

		for (IngredientXml ingredientXml : produitXml.getIngredients().getIngredient()) {
			if (ingredientXml.getNom().length() <= 255) {
				produit.getIngredients().add(new Ingredient(ingredientXml.getNom()));
			}
		}

		return produit;
	}
}
