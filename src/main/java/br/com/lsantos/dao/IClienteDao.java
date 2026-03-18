package br.com.lsantos.dao;

import br.com.lsantos.domain.Cliente;

public interface IClienteDao {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}