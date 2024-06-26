package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//seleciona apenas o que eu preciso dos dados do episódio

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosEpisodio(@JsonAlias("Season") Integer temporada,
                            @JsonAlias("Episode") Integer numeroEpisodio,
                            @JsonAlias("Title") String titulo) {
}
