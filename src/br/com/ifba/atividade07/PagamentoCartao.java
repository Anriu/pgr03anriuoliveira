package br.com.ifba.atividade07;

/**
 *
 * @author anriu
 */
public class PagamentoCartao implements Pagamento{

    private double valor;
    //Calculo da taxa
    @Override
    public double calcularTotal() {
        return this.getValor() * 1.05;
    }
    //Impressao do recibo
    @Override
    public String imprmirRecibo() {
        return "<html>Pagamento com Cartão<br>"
                 + "Valor inicial: R$ " + this.getValor() + "<br>"
                + "Taxa aplicada: R$ " + calcularTotal()
                + "</html>";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
