package At1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Você deseja qual opção de valor?");
        double valor = scanner.nextDouble();

        System.out.println("Você deseja qual opção de pagamento?");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1 -> {
                Debito debito = new Debito();
                debito.setVendaProduto(valor);
                System.out.println("Sua taxa é de " + debito.getValorTaxa() + " e o valor recebido foi de " + debito.valorTotal());
            }
            case 2-> {
                Credito credito = new Credito();
                credito.setVendaProduto(valor);
                System.out.println("Sua taxa é de " + credito.getValorTaxa() + " e o valor recebido foi de " + credito.valorTotal());
            }
            case 3-> {
                CreditoVista creditoVista =  new CreditoVista();
                creditoVista.setVendaProduto(valor);
                System.out.println("Sua taxa é de " + creditoVista.getValorTaxa() + " e o valor recebido foi de " + creditoVista.valorTotal());
            }
        }



    }
}
