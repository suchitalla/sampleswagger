package suchi.swag.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevConfig implements EnvBasedConfig{

	@Override
	public void setUp() {
		System.out.println("In dev Config");
		
	}

}
