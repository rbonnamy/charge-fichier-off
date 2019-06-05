package fr.diginamic.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jaxbreader.generated.Produits.ProduitXml;
import fr.diginamic.model.Categorie;
import fr.diginamic.model.Ingredient;
import fr.diginamic.model.Marque;
import fr.diginamic.model.Produit;
import fr.diginamic.transformer.ProduitTransformer;

/**
 * Classe proposant des services métier
 * 
 * @author DIGINAMIC
 *
 */
@Service
public class ProduitService {

	/** produitDao : ProduitDao */
	@Autowired
	private ProduitDao produitDao;

	/** marqueDao : MarqueDao */
	@Autowired
	private MarqueDao marqueDao;

	/** categorieDao : CategorieDao */
	@Autowired
	private CategorieDao categorieDao;

	/** IngredientDao : IngredientDao */
	@Autowired
	private IngredientDao ingredientDao;

	/** produitTransformer : ProduitTransformer */
	@Autowired
	private ProduitTransformer produitTransformer;

	/**
	 * Méthode permettant de sauvegarder en base de données un produit {@link ProduitXml} issu de la lecture du fichier XML
	 * 
	 * @param produitXml instance de produit tel que fourni par le fichier XML
	 */
	@Transactional
	public void saveProduit(ProduitXml produitXml) {

		// Transformation du produitXML en bean métietr
		Produit produit = produitTransformer.toProduit(produitXml);

		// On regarde si la marque existe en base ou non. Si elle existe on l'associe au produit sinon on la créé
		Marque marqueFomDB = marqueDao.findByNom(produit.getMarque().getNom());
		if (marqueFomDB == null) {
			marqueDao.save(produit.getMarque());
		}
		else {
			produit.setMarque(marqueFomDB);
		}

		// On regarde si la catégorie existe en base ou non. Si elle existe on l'associe au produit sinon on la créé
		Categorie categorieFromDB = categorieDao.findByNom(produit.getCategorie().getNom());
		if (categorieFromDB == null) {
			categorieDao.save(produit.getCategorie());
		}
		else {
			produit.setCategorie(categorieFromDB);
		}

		// On regarde si le produit existe en base ou non.
		Produit produitFromDB = produitDao.findByNom(produit.getMarque(), produit.getNom());

		// S'il n'existe pas
		if (produitFromDB == null) {

			// On le créé
			produitDao.save(produit);

			// On sauvegarde la liste des ingrédients
			for (Ingredient ingredient : produit.getIngredients()) {

				// On regarde si l'ingrédient courant existe ou non. S'il n'existe pas on le créé, sinon on l'associe au produit.
				Ingredient ingredientDB = ingredientDao.findByNom(ingredient.getNom());
				if (ingredientDB == null) {
					ingredientDao.save(ingredient);
				}
				else {
					ingredient.setId(ingredientDB.getId());
				}
			}
		}
		else {
			produitFromDB.setGrade(produit.getGrade());
			produitFromDB.setEnergie100g(produit.getEnergie100g());
			produitFromDB.setGraisse100g(produit.getGraisse100g());
			produitFromDB.setSucres100g(produit.getSucres100g());
			produitFromDB.setFibres100g(produit.getFibres100g());
			produitFromDB.setProteines100g(produit.getProteines100g());
			produitFromDB.setSel100g(produit.getSel100g());
			produitDao.maj(produitFromDB);
		}

	}
}
