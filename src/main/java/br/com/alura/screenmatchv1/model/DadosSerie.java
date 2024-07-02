package br.com.alura.screenmatchv1.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("Total Seasons") Integer totalSeasons,
                         @JsonAlias("imdbRating")  String avaliacao) {
}
