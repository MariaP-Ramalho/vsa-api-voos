package br.com.dudadev.vsaapivoos.service;

public interface IConvertData {
    <T> T getData(String json, Class<T> classe);
}
