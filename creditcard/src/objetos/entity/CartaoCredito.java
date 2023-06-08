package objetos.entity;

public class CartaoCredito{

    private int numeroCartao;
    private String dataValidade;
    private int limite;  
    private int numeroCartaoAdicional;
    private String dataValidadeAdicional;
    private int limiteAdicional;  

    public CartaoCredito(){
    }

    public int getNumeroCartaoAdicional() {
        return numeroCartaoAdicional;
    }

    public void setNumeroCartaoAdicional(int numeroCartaoAdicional) {
        this.numeroCartaoAdicional = numeroCartaoAdicional;
    }

    public String getDataValidadeAdicional() {
        return dataValidadeAdicional;
    }

    public void setDataValidadeAdicional(String dataValidadeAdicional) {
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

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getlimite() {
        return limite;
    }

    public void setlimite(int limite) {
        this.limite = limite;
    }  


    
}
