package fr.diginamic.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import fr.diginamic.exception.TechnicalException;

/**
 * Représente une DAO abstraite qui fournit des services de bases pour toutes les DAO filles.
 * 
 * @author DIGINAMIC
 *
 * @param <T> représente une entité
 */
public abstract class AbstractDao<T> {

	/** em : EntityManager */
	@PersistenceContext
	protected EntityManager em;

	/** t : T */
	private T t;

	/**
	 * Constructor
	 * 
	 */
	@SuppressWarnings("unchecked")
	public AbstractDao() {
		try {
			this.t = (T) ((Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass())
					.getActualTypeArguments()[0]).newInstance();
		} catch (ReflectiveOperationException | IllegalArgumentException | SecurityException e) {
			throw new TechnicalException("Type générique non reconnu lors de la création d'une DAO", e);
		}
	}

	/**
	 * Sauvegarde une nouvelle entité
	 * 
	 * @param entity nouvelle entité
	 */
	public void save(T entity) {
		em.persist(entity);
	}

	/**
	 * Mise à jour d'une entité
	 * 
	 * @param entity entité à modifier
	 */
	public void maj(T entity) {
		em.merge(entity);
	}

	/**
	 * Retourne une entité en fonction de son nom
	 * 
	 * @param nom nom
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T findById(Long id) {
		return (T) em.find(t.getClass(), id);
	}

	/**
	 * Retourne une entité en fonction de son nom
	 * 
	 * @param nom nom
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T findByNom(String nom) {
		String jpql = "FROM " + t.getClass().getSimpleName() + " WHERE nom=:nom";
		TypedQuery<?> query = em.createQuery(jpql, t.getClass());
		query.setParameter("nom", nom);
		List<?> resultats = query.getResultList();
		if (!resultats.isEmpty()) {
			return (T) resultats.get(0);
		}
		return null;
	}
}
