package objetos.dao;

import objetos.blueprint.cartaoInterface;
import objetos.entity.CartaoCredito;

public class CartaoCreditoDao extends CartaoCredito implements cartaoInterface {
    
    @Override
    public void novoCartao() {
        System.out.println("Nome do titular: ");
        System.out.println("Nome do titular: ");
        System.out.println("Número do cartão: " + getNumeroCartao());
        System.out.println("Data de validade: " + getDataValidade());

    }   

    @Override
    public void novoCartaoAdicional() {
        System.out.println();

    }

    @Override
    public void transacao() {
        System.out.println();

    }

    @Override
    public void pagamento() {
        System.out.println();

    }

    @Override
    public void consultaSaldo() {
        System.out.println("abc");

    }
}
