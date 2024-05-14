package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
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
		var conversor = new ConverteDados();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=scrubs&season=1&episode=2&apikey=2c3fc37&");
		System.out.println(json);
		var dados = conversor.obterDados(json, DadosSerie.class);
		var dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);



		System.out.println(dadosEpisodio);

	}
}
