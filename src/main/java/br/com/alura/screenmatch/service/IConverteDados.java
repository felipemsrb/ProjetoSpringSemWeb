package br.com.alura.screenmatch.service;

//Converte dados genéricos e converte para qualquer classe criada
public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);


}
