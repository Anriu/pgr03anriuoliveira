package br.com.ifba.atividade07;

/**
 *
 * @author anriu
 */
public class PagamentoDinheiro implements Pagamento {
    
    private double valor;

    @Override
    public double calcularTotal() {
        return this.getValor() * 0.9;
    }
    
    @Override
    public String imprmirRecibo() {
        return "<html>Pagamento com dinheiro<br>"
                + "Valor inicial: R$ " + this.getValor() + "<br>"
                + "Desconto aplicado: R$ " + calcularTotal()
                + "</html>";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
