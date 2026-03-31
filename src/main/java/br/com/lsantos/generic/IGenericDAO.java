package br.com.lsantos.generic;

import java.util.List;
import br.com.lsantos.exception.DAOException;

public interface IGenericDAO<T> {

    void cadastrar(T entity) throws DAOException;

    void excluir(T entity) throws DAOException;

    List<T> buscarTodos();
}