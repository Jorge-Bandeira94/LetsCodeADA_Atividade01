package At1;

public class Debito implements TaxaMaquininha{

    double taxa = 0.095;
    double vendaProduto;

    double valorPago = 0.0095;

    @Override
    public Double getValorTaxa() {
        return valorPago * vendaProduto;
    }

    public Double valorTotal(){
        double x = valorPago * vendaProduto;
        return vendaProduto - x;
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



