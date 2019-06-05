package fr.diginamic.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Fournit des services de génération de liste
 * 
 * @author DIGINAMIC
 *
 */
public final class ListUtils {

	/** SEPARATEUR_VURGULE : String */
	private static final String SEPARATEUR_VIRGULE = ",";

	/**
	 * Constructor
	 * 
	 */
	private ListUtils() {

	}

	/**
	 * Découpe une chaine de caractères en morceaux sur la base du séparateur virgule (,)
	 * 
	 * @param chaine chaine de caractères à découper
	 * @return {@link List} de {@link String}
	 */
	public static List<String> toList(String chaine) {
		return toList(chaine, SEPARATEUR_VIRGULE);
	}

	/**
	 * Découpe une chaine de caractères en morceaux sur la base d'un séparateur et retourne les morceaux dans une liste.
	 * 
	 * @param chaine chaine de caractères à découper
	 * @param separateur séparateur
	 * @return {@link List} de {@link String}
	 */
	public static List<String> toList(String chaine, String separator) {
		String[] tokens = chaine.split(separator);
		return Arrays.asList(tokens).stream().map(t -> t.trim()).collect(Collectors.toList());
	}

	/**
	 * Découpe une chaine de caractères en morceaux sur la base du séparateur virgule (,) et retourne les morceaux dans une liste.
	 * 
	 * @param chaine chaine de caractères à découper
	 * @param targetClass classe à instancier pour chaque morceau de chaine de caractères
	 * @return {@link List} de {@link String}
	 */
	public static <T> List<T> toList(String chaine, Class<T> targetClass) {
		String[] tokens = chaine.split(SEPARATEUR_VIRGULE);

		return Arrays.asList(tokens).stream().filter(t -> !t.trim().isEmpty())
				.map(t -> ReflectUtils.instantiateWithParameters(targetClass, t.trim())).collect(Collectors.toList());
	}

	/**
	 * Découpe une chaine de caractères en morceaux sur la base d'un séparateur et retourne les morceaux dans une liste.
	 * 
	 * @param chaine chaine de caractères à découper
	 * @param separateur séparateur
	 * @param targetClass classe à instancier pour chaque morceau de chaine de caractères
	 * @return {@link List} de {@link String}
	 */
	public static <T> List<T> toList(String chaine, String separator, Class<T> targetClass) {
		String[] tokens = chaine.split(separator);

		return Arrays.asList(tokens).stream().filter(t -> !t.trim().isEmpty())
				.map(t -> ReflectUtils.instantiateWithParameters(targetClass, t.trim())).collect(Collectors.toList());
	}

}
