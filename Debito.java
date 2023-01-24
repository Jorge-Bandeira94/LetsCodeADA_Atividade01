package At1;

public class Debito implements TaxaMaquininha{

    double taxa = 0.095;
    double vendaProduto;

    double valorPago = 0.905;

    @Override
    public Double getValorTaxa() {
        return taxa;
    }

    public Double valorTotal(){
        return valorPago * vendaProduto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(double vendaProduto) {
        this.vendaProduto = vendaProduto;
    }
}



