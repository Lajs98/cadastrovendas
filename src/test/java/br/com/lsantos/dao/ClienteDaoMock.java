package br.com.lsantos.dao;

import br.com.lsantos.domain.Cliente;

public class ClienteDaoMock implements IClienteDao {
    @Override
    public Boolean salvar(Cliente cliente) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
