
package br.com.ifba.atividade06;

/**
 * @author anriu
 */

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    //Construtor para iniciar uma conta com saldo 0 e desativada
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    //Getters e Setters de todos os atributos da classe ContaBanco
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    public void abrirConta(String tipo){
        this.setTipo(tipo); //atribuição do tipo da conta usando o setTipo
        this.setStatus(true);//atribuição do status da conta usando o setStatus
        
        //Lógica para saber qual o tipo de conta e dar o presente inicial
        if("cc".equals(tipo)){
            this.setSaldo(50);
        }else if("cp".equals(tipo)){
            this.setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if(this.getSaldo() == 0){
           this.setStatus(false); //Fechamento da conta
        } else{
            //Não é possivel encerrar a conta com saldo dentro dela
        }
    }
    
    public void depositar(float deposito){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + deposito);
            //Realização do deposito usando os metodos setSaldo para alterar e getSaldo para pegar o saldo atual e somar com o novo depósito
        }else{
            //Não é possivel realizar um deposito caso a conta esteja desativada
        }
    } 
    
    public void sacar(float saque){
        if(this.isStatus()){
            if(this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
                //Realização do saque usando os metodos setSaldo para alterar e getSaldo para pegar o saldo atual e subitrair o saque 
            }else {
                //Não é possivel realizar um saque caso o valor de saque seja maior do que o saldo atual da conta
            }
        }else{
            //Não é possivel realizar um saque caso a conta esteja desativada
        }
    }
    
    public void pagarMensal(){
        
        if(this.isStatus()){
            if("cc".equals(tipo)){
                this.setSaldo(this.getSaldo() - 12);
            }else if("cp".equals(tipo)){
                this.setSaldo(this.getSaldo() - 20);
            }
        }else{
            //Conta desativada não paga mensalidade
        }
   
    }
}

