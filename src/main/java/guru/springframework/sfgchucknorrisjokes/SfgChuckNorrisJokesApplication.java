package guru.springframework.sfgchucknorrisjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SfgChuckNorrisJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgChuckNorrisJokesApplication.class, args);
	}

}
