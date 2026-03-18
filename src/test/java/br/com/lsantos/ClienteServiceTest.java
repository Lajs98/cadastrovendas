package br.com.lsantos;

import br.com.lsantos.dao.ClienteDaoMock;
import br.com.lsantos.dao.IClienteDao;
import br.com.lsantos.domain.Cliente;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;
import br.com.lsantos.services.IClienteService;

/**
 * @author Levi.Santos
 */
public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest(){

        IClienteDao dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }
    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Levi");
        cliente.setCidade("Campinas");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(19135243687L);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {

        Boolean retorno = clienteService.salvar(cliente);

        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() {
        cliente.setNome("Levi Santos");
        clienteService.alterar(cliente);

        Assert.assertEquals("Levi Santos", cliente.getNome());
    }
}