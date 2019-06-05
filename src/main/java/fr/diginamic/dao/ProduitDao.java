package fr.diginamic.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.diginamic.model.Marque;
import fr.diginamic.model.Produit;

/**
 * DAO pour la gestion des produits. Voir {@link Produit}
 * 
 * @author DIGINAMIC
 *
 */
@Repository
public class ProduitDao extends AbstractDao<Produit> {

	/**
	 * Retourne un produit en fonction de sa marque et de son nom
	 * 
	 * @param marque marque
	 * @param nom nom
	 * @return {@link Produit}
	 */
	public Produit findByNom(Marque marque, String nom) {
		String jpql = "FROM Produit WHERE marque=:marque AND nom=:nom";
		TypedQuery<Produit> query = em.createQuery(jpql, Produit.class);
		query.setParameter("marque", marque);
		query.setParameter("nom", nom);
		List<Produit> resultats = query.getResultList();
		if (!resultats.isEmpty()) {
			return resultats.get(0);
		}
		return null;
	}

}
