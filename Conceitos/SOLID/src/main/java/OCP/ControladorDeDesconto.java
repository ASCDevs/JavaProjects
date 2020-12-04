package OCP;

/*
- OPEN CLOSED PRINCIPLE - Princípio de Aberto Fechado
- entidades de software devem ser abertas para extensão, mas fechadas para modificação
 */

public class ControladorDeDesconto {

    public void adicionaDescontoLivro(DescontoLivro descontoLivro){
        descontoLivro.valorDesconto();
    }
}
