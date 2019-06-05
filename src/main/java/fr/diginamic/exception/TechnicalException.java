package fr.diginamic.exception;

/**
 * Représente une exception technique grave
 * 
 * @author DIGINAMIC
 *
 */
public class TechnicalException extends RuntimeException {

	/** serialVersionUID : long */
	private static final long serialVersionUID = 6026556426015604425L;

	/**
	 * Constructor
	 * 
	 * @param message message d'erreur
	 * @param cause cause de l'exception
	 */
	public TechnicalException(String message, Throwable cause) {
		super(message, cause);
	}

}
