package fr.diginamic;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.diginamic.dao.ProduitService;
import fr.diginamic.jaxbreader.generated.Produits;

/**
 * Application qui charge le fichier OPEN FOOD FACTS et le stocke en base de données
 * 
 * @author DIGINAMIC
 *
 */
@SpringBootApplication
public class ChargementFichier implements CommandLineRunner {

	/** JAXB_ENTITY_PACKAGE : package contenant les entités JAXB */
	private static final String JAXB_ENTITY_PACKAGE = "fr.diginamic.jaxbreader.generated";

	/** produitService : ProduitService */
	@Autowired
	private ProduitService produitService;

	/** fileUrl : String */
	private String fileUrl = "C:/Temp/Work/openData.xml";

	/**
	 * Point d'entrée principal
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(ChargementFichier.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JAXBContext jc = JAXBContext.newInstance(JAXB_ENTITY_PACKAGE);

		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Produits produits = (Produits) unmarshaller.unmarshal(new File(fileUrl));

		produits.getProduit().forEach(p -> produitService.saveProduit(p));
	}
}