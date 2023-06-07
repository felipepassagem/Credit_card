package objetos.dao;

import objetos.cartaointerface.cartaoInterface;
import objetos.entity.CartaoCredito;

public class CartaoCreditoDao extends CartaoCredito implements cartaoInterface {
    
    @Override
    public void novoCartao() {
        
    }

    @Override
    public void novoCartaoAdicional() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'novoCartao'");
    }

    @Override
    public void transacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transacao'");
    }

    @Override
    public void pagamento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pagamento'");
    }

    @Override
    public void consultaSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultaSaldo'");
    }
}
