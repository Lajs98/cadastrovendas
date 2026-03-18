package br.com.lsantos.dao;

import br.com.lsantos.domain.Cliente;

public class ClienteDAO implements IClienteDao {

    @Override
    public Boolean salvar(Cliente cliente) {
            // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void excluir(Long cpf) {
        // TODO Auto-generated method stub
    }

    @Override
    public void alterar(Cliente cliente) {
        // TODO Auto-generated method stub
    }
}