package fr.diginamic.utils;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Fournit des méthodes utilitaires pour faciliter l'introspection Java
 * 
 * @author DIGINAMIC
 *
 */
public final class ReflectUtils {

	/**
	 * Constructor
	 * 
	 */
	private ReflectUtils() {

	}

	/**
	 * Instancie une classe T avec les paramètres fournis sous forme de tableau
	 * 
	 * @param targetClass classe T à instancier
	 * @param parameters paramètres du constructeur
	 * @return une instance de T
	 */
	public static <T> T instantiateWithParameters(Class<T> targetClass, Object... parameters) {
		try {
			Class<?>[] classes = Arrays.stream(parameters).map(Object::getClass).toArray(Class[]::new);

			Constructor<T> constructor = targetClass.getConstructor(classes);
			return constructor.newInstance(parameters);
		} catch (ReflectiveOperationException | SecurityException e) {
			throw new RuntimeException("Le constructeur pour instancier la classe " + targetClass.getSimpleName()
					+ " avec les paramètres (" + Arrays.stream(parameters)
							.map(param -> param.getClass().getSimpleName()).collect(Collectors.joining(","))
					+ ") n'existe pas", e);
		}
	}
}
