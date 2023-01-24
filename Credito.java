package At1;

import At1.TaxaMaquininha;

public class Credito implements TaxaMaquininha {

    double parcelado = 0.1;
    double vendaProduto;

    double valorPago = 0.09;


    @Override
    public Double getValorTaxa() {
        return valorPago * vendaProduto;
    }

    public Double valorTotal(){
        double x = valorPago * vendaProduto;
        return vendaProduto - x;
    }

    public double getParcelado() {
        return parcelado;
    }

    public void setParcelado(double parcelado) {
        this.parcelado = parcelado;
    }

    public double getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(double vendaProduto) {
        this.vendaProduto = vendaProduto;
    }
}
