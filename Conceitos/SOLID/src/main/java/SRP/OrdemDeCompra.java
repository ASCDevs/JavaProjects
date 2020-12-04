package SRP;

import java.math.BigDecimal;
import java.util.ArrayList;

/*
- SINGLE RESPONSIBILITY PRINCIPLE - Princípio de Única responsabilidade
- uma classe deve ter apenas uma única responsabilidade (mudanças em apenas
uma parte da especificação do software, devem ser capaz de afetar a especificação da classe)
 */

//Classe Ordem Compra
public class OrdemDeCompra {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public void removeProduto(Produto produto){
        produtos.remove(produto);
    }

    public double calcularTotal(){
        double total=0;
        for(Produto p: produtos){
            total+=p.getPreco();
        }
        return total;
    }
}
//Classe OrdemCompraRepository
//Classe dedicada a manipulação com banco de dados
class OrdemDeCompraRepository{

    //Operações de CRUD

    public ArrayList<OrdemDeCompra> buscaOrdensDeCompra(){
        //Retorna a lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdemDeCompra(OrdemDeCompra ordemDeCompra){
        //salva lista de compras na base de dados
    }

    public void alteraOrdemDeCompra(){
        //alterar na base de dados
    }

    public void deletrarOdemDeCompra(){
        //Deleta a ordem de Compra no banco de dados
    }
}

class OrdemDeCompraMail{
    public void enviarEmail(OrdemDeCompra ordemDeCompra, String email){
        //Envia email da ordem de compra
    }
}

//Classe OrdemDeCompraPrint
class OrdemDeCompraPrint{
    public void imprimirOrdemDeCompra(OrdemDeCompra ordemDeCompra){
        //faz a impressão da ordem de compra
    }
}