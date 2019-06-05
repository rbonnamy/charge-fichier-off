package fr.diginamic.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Bean de configuration de la base de données et du mode transactionnel
 * 
 * @author DIGINAMIC
 *
 */
@Configuration
public class AppConfiguration {

	/** driver : String */
	@Value("${spring.datasource.driver-class-name}")
	private String driver;

	/** url : String */
	@Value("${spring.datasource.url}")
	private String url;

	/** username : String */
	@Value("${spring.datasource.username}")
	private String username;

	/** password : String */
	@Value("${spring.datasource.password}")
	private String password;

	/** generateDdl : permet de générer la base de données ou non */
	@Value("${spring.jpa.generate-ddl}")
	private Boolean generateDdl;

	/** showSql : permet d'afficher les requêtes SQL ou non */
	@Value("${spring.jpa.show-sql}")
	private Boolean showSql;

	/** HIBERNATE_ENTITIES_PCK : Package contenant les entités JPA */
	private static final String HIBERNATE_ENTITIES_PCK = "fr.diginamic.model";
	/** DROP_AND_CREATE : Technique choisie pour mettre à jour le base de données dans le cas où generateDdl=true */
	private static final String DROP_AND_CREATE = "drop-and-create";
	/**
	 * JAVAX_PERSISTENCE_SCHEMA_GENERATION_DATABASE_ACTION : Propriété permettant d'imposer à Hibernate une action à réaliser sur la base de données
	 */
	private static final String JAVAX_PERSISTENCE_SCHEMA_GENERATION_DATABASE_ACTION = "javax.persistence.schema-generation.database.action";

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(emf);
		return txManager;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(driver);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setUrl(url);

		return dataSource;
	}

	/**
	 * Cette configuration nécessite une source de données configurée. Elle s'utilise donc en association avec un autre fichier de configuration définissant un bean DataSource.
	 */
	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		if (generateDdl) {
			vendorAdapter.setGenerateDdl(true);
		}
		vendorAdapter.setShowSql(true);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan(HIBERNATE_ENTITIES_PCK);
		factory.setDataSource(dataSource);

		Properties jpaProperties = new Properties();
		if (generateDdl) {
			jpaProperties.setProperty(JAVAX_PERSISTENCE_SCHEMA_GENERATION_DATABASE_ACTION, DROP_AND_CREATE);
		}
		factory.setJpaProperties(jpaProperties);

		factory.afterPropertiesSet();
		return factory.getObject();
	}

}
