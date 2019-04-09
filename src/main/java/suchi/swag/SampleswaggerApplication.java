package suchi.swag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "org.bitbucket.tek.nik.simplifiedswagger", "suchi.swag" })
public class SampleswaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleswaggerApplication.class, args);
	}

}
