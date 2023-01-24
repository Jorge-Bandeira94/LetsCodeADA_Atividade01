package At1;

public class CreditoVista implements TaxaMaquininha{

    double taxa = 0.099;
    double vendaProduto;

    double valorPago = 0.901;


    public Double getValorTaxa(){
        return taxa;
    };

    public double valorTotal(){
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
