
package br.com.ifba.atividade05;

/**
 * @author anriu
 */

public class Fatorial {
    
    
    //Variaveis do numero fatorial
    private int valor;
    private int fatorial;
    private String formula;
    
    
    //Metodo setValor recebe o valor escolhido pelo usuario e calcula o valor do fatorial
    public void setValor(int valor) {
        this.valor = valor;
        
        int numeroFatorial = 1;
        String auxiliar = ""; //String auxiliar para ajudar a montar a string final
        for (int i = valor; i > 0; i--) {
            numeroFatorial *= i; //Calculo do fatorial
            auxiliar += i + (i > 1 ? " x " : " = "); //Uso do operador ternario para facilitar a escrita da string de resultado
        }
        
        this.fatorial = numeroFatorial;
        this.formula = auxiliar + numeroFatorial;
        
    }
  
    //Metodo que retorna o valor do fatorial
    public int getFatorial() {
        return fatorial;
    }
    
    //Metodo que retorna a string que tem tanto o resultado quanto a formula
    public String getFormula() {
        return formula;
    }
    
}
