package br.com.lsantos;

import br.com.lsantos.dao.ClienteDaoMock;
import br.com.lsantos.dao.IClienteDao;
import br.com.lsantos.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDao clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();

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
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    @Test
    public void salvarCliente() {
        // TODO Auto-generated method stub
        boolean retorno;
        retorno = true;
        Assert.assertTrue(retorno);
    }
    @Test
    public void excluirCliente() {

        clienteDao.excluir(cliente.getCpf());
    }
    @Test
    public void alterarCliente() {
        cliente.setNome("Levi Santos");
        clienteDao.alterar(cliente);
    }
}
