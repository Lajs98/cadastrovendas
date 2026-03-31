package br.com.lsantos.dao;

import br.com.lsantos.domain.Cliente;
import br.com.lsantos.exception.DAOException;
import br.com.lsantos.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDao {

    @Override
    public Boolean salvar(Cliente cliente) {
        try {
            cadastrar(cliente);
            return true;
        } catch (DAOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        for (Cliente c : lista) {
            if (c.getCpf() != null && c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente cliente = buscarPorCPF(cpf);

        if (cliente == null) {
            System.out.println("Cliente não encontrado");
            return;
        }

        try {
            super.excluir(cliente); // 👈 importante usar super
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        System.out.println("Alterar não implementado");
    }
}