package fr.diginamic.utils;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Fournit des services de traitement de chaines de caractères
 * 
 * @author DIGINAMIC
 *
 */
public final class StringUtils {

	/** pattern : pattern de recherche des nombres décimaux avec caractères virgule au lieu de point */
	private static Pattern pattern = Pattern.compile("\\d*\\,\\d+|\\d+\\,\\d*");

	/**
	 * Constructor
	 * 
	 */
	private StringUtils() {

	}

	/**
	 * Remplace certaines valeurs HTML par des caractères lisibles.
	 * 
	 * @param value chaîne à traiter
	 * @return String
	 */
	public static String convertToAscii(String value) {
		String convertedValue = value;
		if (convertedValue.contains("&gt;")) {
			convertedValue = convertedValue.replace("&gt;", ">");
		}
		if (convertedValue.contains("&lt;")) {
			convertedValue = convertedValue.replace("&lt;", "<");
		}
		if (convertedValue.contains("&quot;")) {
			convertedValue = convertedValue.replace("&quot;", "");
		}
		if (convertedValue.contains("&amp;")) {
			convertedValue = convertedValue.replace("&amp;", "&");
		}
		return convertedValue;
	}

	/**
	 * Supprime les parenthèses et ce qu'elles contiennent de la chaîne de caractères passée en paramètre
	 * 
	 * @param value chaîne à traiter
	 * @return String
	 */
	public static String deleteParenthese(String value) {
		String convertedValue = value;
		String regexp = "\\s*\\([^\\)]*\\)\\s*";
		if (convertedValue.contains("(")) {
			convertedValue = convertedValue.replaceAll(regexp, "");
		}
		return convertedValue;
	}

	/**
	 * Conversion des nombres décimaux
	 * 
	 * @param value chaîne à traiter
	 * @return String
	 */
	public static String conversionDecimaux(String value) {
		String convertedValue = value;
		Matcher matcher = pattern.matcher(convertedValue);
		while (matcher.find()) {
			String group = matcher.group(0);
			convertedValue = convertedValue.replaceAll(group, group.replaceAll(",", "."));
		}
		return convertedValue;
	}

	/**
	 * Applique tous les traitements de la classe StringUtils
	 * 
	 * @param value chaîne à traiter
	 * @return String
	 */
	public static String traite(String value) {
		return convertToAscii(deleteParenthese(value));
	}

	/**
	 * Retourne la valeur passée en paramètre convertie en chaine de caractères
	 * 
	 * @param value valeur
	 * @return String
	 */
	public static String toString(Integer value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Retourne la valeur passée en paramètre convertie en chaine de caractères
	 * 
	 * @param value valeur
	 * @return String
	 */
	public static String toString(BigDecimal value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}
}
