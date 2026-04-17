package br.com.ifba.atividade07;

/**
 *
 * @author anriu
 */
public class PagamentoPix implements Pagamento{
    
    private double valor;
    //Calculo do cashBack
    @Override
    public double calcularTotal() {
        return (this.getValor() * 2)/100;
    }
    //Impressao do recibo
    @Override
    public String imprmirRecibo() {
        return "<html>Pagamento com pix<br>"
                + "Valor inicial: R$ " + this.getValor() + "<br>"
                + "CashBack aplicado: R$ " + calcularTotal()
                + "</html>";
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
