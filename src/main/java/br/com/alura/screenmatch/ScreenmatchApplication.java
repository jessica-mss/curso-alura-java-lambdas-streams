package br.com.alura.screenmatch;

import br.com.alura.screenmatch.service.ConsumoAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		String responseOMD = consumoAPI.obterDados("https://www.omdbapi.com/?i=gilmore+girls&Season=1&apikey=ead8e830");
		System.out.println(responseOMD);
		String responseCooffee = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		System.out.println(responseCooffee);

	}
}
