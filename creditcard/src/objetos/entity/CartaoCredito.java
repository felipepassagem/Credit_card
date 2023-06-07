package objetos.entity;

public class CartaoCredito{

    private int numeroCartao;
    private int dataValidade;
    private int limite;  
    private int numeroCartaoAdicional;
    private int dataValidadeAdicional;
    private int limiteAdicional;  

    public CartaoCredito(){
    }

    public int getNumeroCartaoAdicional() {
        return numeroCartaoAdicional;
    }

    public void setNumeroCartaoAdicional(int numeroCartaoAdicional) {
        this.numeroCartaoAdicional = numeroCartaoAdicional;
    }

    public int getDataValidadeAdicional() {
        return dataValidadeAdicional;
    }

    public void setDataValidadeAdicional(int dataValidadeAdicional) {
        this.dataValidadeAdicional = dataValidadeAdicional;
    }

    public int getLimiteAdicional() {
        return limiteAdicional;
    }

    public void setLimiteAdicional(int limiteAdicional) {
        this.limiteAdicional = limiteAdicional;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getlimite() {
        return limite;
    }

    public void setlimite(int limite) {
        this.limite = limite;
    }  


    
}
