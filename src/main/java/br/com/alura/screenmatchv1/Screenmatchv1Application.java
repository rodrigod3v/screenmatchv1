package br.com.alura.screenmatchv1;


import br.com.alura.screenmatchv1.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmatchv1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatchv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}