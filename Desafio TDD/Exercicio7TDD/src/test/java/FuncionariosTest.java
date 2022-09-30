import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionariosTest {

    private Vendedor vendedor;
    private Supervisor supervisor;
    private Gerente gerente;

    @Before
    public void setup(){
        vendedor = new Vendedor("Oni", 21, 3000);
        supervisor = new Supervisor("Pandora", 42, 9000);
        gerente = new Gerente("Louise", 38, 15000);
    }

    @Test
    public void deveCalcularBonificacaoDoVendedor(){
        assertEquals(6000,vendedor.bonificacao(), 0.0001);
    }

    @Test
    public void deveCalcularBonificacaoDoSupervisor(){
        assertEquals(14000,supervisor.bonificacao(), 0.0001);
    }

    @Test
    public void deveCalcularBonificacaoDoGerente(){
        assertEquals(25000,gerente.bonificacao(), 0.0001);
    }

}
