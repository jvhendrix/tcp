public class Imovel{

    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String endereco;
    boolean aluguel;
    double valorVenda;

    public void imprimeDados(){
        System.out.println("Numero de quartos: " + nQuartos);
        System.out.println("Numero de banheiros: " + nBanheiros);
        System.out.println("Tem garagem: " + temGaragem);
        System.out.println("Endrereco: " + endereco);
        System.out.println("Valor da aluguel: " + aluguel);
        System.out.println("Valor da venda: " + valorVenda);
    }

    public void valoriza(double perc){
        valorVenda *= 1+(perc/100);
    }

    public double calculaImposto(){
        double imposto;

        if(aluguel){
            imposto = valorVenda*0.1;
        }
        else{
            imposto = valorVenda*0.15;
        }

        return imposto;
    }
}