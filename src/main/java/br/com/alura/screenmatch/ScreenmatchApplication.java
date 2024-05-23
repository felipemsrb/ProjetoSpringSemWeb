package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var conversor = new ConverteDados();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=lost&apikey=2c3fc37&");
		System.out.println(json);
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		List<DadosTemporada> temporadas = new ArrayList<>();

		//usando um bloco de repetição para adicionar o total de temporada numa lista
		for (int i = 1; i <= dados.totalDeTemporadas(); i++){
			json = consumoAPI.obterDados("https://www.omdbapi.com/?t=lost&season=" + i +"&apikey=2c3fc37&");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);

		}

		temporadas.forEach(System.out::println);







	}
}
