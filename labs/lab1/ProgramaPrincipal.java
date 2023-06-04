// João Vítor Schimuneck de souza - 2023/1
public class ProgramaPrincipal {
    
    public static void main (String[] args){

        Imovel im1;
        im1 = new Imovel();

        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.endereco = "Rua dos Fulanos, n. 0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        im1.imprimeDados();
        im1.valoriza(2.5);
        im1.imprimeDados();

        System.out.println("Valor imposto: " + im1.calculaImposto());

        Imovel im2;
        im2 = new Imovel();

        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.endereco = "Rua dos Fulanos, n. 0";
        im2.aluguel = true;
        im2.valorVenda = 142000;

        im2.valoriza(2.5);

        /*
        Parte 5

            O operador "==" basicamente compara se duas referências são idênticas. Nesse caso em específico, o resultado do
            da expressão (im1 == im2) será false, uma vez que, apesar de apresentarem os mesmos métodos/atributos, ambos são
            objetos independentes com seu próprio endereço na memória, ou seja, im1 e im2 estão referenciando objetos diferentes.
        */
        if (im1 == im2){
            System.out.println("Mesmos imoveis!");
        }else{
            System.out.println("Imoveis distintos!");
        }

        /*
        Parte 6
        
            Nesse caso, na expressão (im3 = im1), estamos atribuindo o valor de im1 a im3. Como im1 é uma referência a um objeto, consequentemente,
            im3 acabará referenciando esse mesmo objeto. Nesse sentido, será possível alterar os valores do objeto em questão tanto por im1 quanto
            por im3. É importante destacar que qualquer alteração feita em im1 também será refletida em im3 e vice-versa, pois ambos estão referenciando 
            exatamente o mesmo objeto.
        */
        Imovel im3 = im1;
        im3.valorVenda = 0;
        im3.imprimeDados();
        im1.imprimeDados();

           
    }
}
