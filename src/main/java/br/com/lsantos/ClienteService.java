package br.com.lsantos.services;

import br.com.lsantos.dao.IClienteDao;
import br.com.lsantos.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDao clienteDAO;

    public ClienteService(IClienteDao clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }
}