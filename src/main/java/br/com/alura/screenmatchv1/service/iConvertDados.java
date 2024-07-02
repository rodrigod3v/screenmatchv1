package br.com.alura.screenmatchv1.service;

public interface iConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
