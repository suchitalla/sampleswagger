package suchi.swag;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import suchi.swag.config.EnvBasedConfig;

@SpringBootApplication
@ComponentScan(basePackages = { "org.bitbucket.tek.nik.simplifiedswagger", "suchi.swag" })
public class SampleswaggerApplication implements CommandLineRunner {
   
	@Autowired
	private DataSource ds;
	
	@Autowired
	private EnvBasedConfig ebc;
    
	private static final Logger LOGGER = LoggerFactory.getLogger(SampleswaggerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SampleswaggerApplication.class, args);
		LOGGER.error("Msg logged at Error level");
		LOGGER.warn("Msg logged at Error level");
		LOGGER.info("Msg logged at Error level");
		LOGGER.debug("Msg logged at Error level");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Suchi ds ="+ ds.toString());
		LOGGER.info("Suchi in Run method");
		
		ebc.setUp();
	}

}
