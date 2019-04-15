package suchi.swag.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdConfig implements EnvBasedConfig {

	@Override
	public void setUp() {
		System.out.println("In prod Config");

	}

}
