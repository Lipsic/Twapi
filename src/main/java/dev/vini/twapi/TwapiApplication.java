package dev.vini.twapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootApplication
public class TwapiApplication {

	public static void main(String[] args) {
		var modules = ApplicationModules.of(TwapiApplication.class);
		System.out.println(modules);

		SpringApplication.run(TwapiApplication.class, args);

	}

}
