package com.senac.n1.exercicio.interfaces;

import java.util.List;

/**
 *
 * @param <T> - DTO
 * @param <N>  - Integer
 */
public interface IService<T, N> {

    public T create(T entity);

    public T read(N id);

    public List<T> read();

    public T update(N id, T entity);

    public void delete(N id);


}