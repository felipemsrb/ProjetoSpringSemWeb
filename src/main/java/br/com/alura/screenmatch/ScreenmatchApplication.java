package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
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
        Principal principal = new Principal();
        principal.exibeMenu();

//		List<DadosTemporada> temporadas = new ArrayList<>();
//
//		//usando um bloco de repetição para adicionar o total de temporada numa lista
//		for (int i = 1; i <= dados.totalDeTemporadas(); i++){
//			json = consumoAPI.obterDados("https://www.omdbapi.com/?t=lost&season=" + i +"&apikey=2c3fc37&");
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//
//		}
//
//		temporadas.forEach(System.out::println);







	}
}
