package br.com.lsantos.generic;

import java.util.ArrayList;
import java.util.List;
import br.com.lsantos.exception.DAOException;

public class GenericDAO<T> implements IGenericDAO<T> {

    protected List<T> lista = new ArrayList<>();

    @Override
    public void cadastrar(T entity) throws DAOException {
        if (entity == null) {
            throw new DAOException("Objeto não pode ser nulo");
        }
        lista.add(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        if (!lista.remove(entity)) {
            throw new DAOException("Objeto não encontrado");
        }
    }

    @Override
    public List<T> buscarTodos() {
        return lista;
    }
}