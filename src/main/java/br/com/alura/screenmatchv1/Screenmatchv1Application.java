package br.com.alura.screenmatchv1;

import br.com.alura.screenmatchv1.model.DadosSerie;
import br.com.alura.screenmatchv1.service.ConsumoApi;
import br.com.alura.screenmatchv1.service.ConverteDados;
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
		var consumoApi = new ConsumoApi();
		var json = ConsumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=aeab770b");
//		System.out.println(json);
//		json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
//
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
