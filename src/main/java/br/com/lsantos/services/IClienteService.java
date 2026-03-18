package br.com.lsantos.services;

import br.com.lsantos.domain.Cliente;

public interface IClienteService {

    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf); // erro aqui

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}