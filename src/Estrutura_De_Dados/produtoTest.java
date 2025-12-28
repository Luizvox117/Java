package Estrutura_De_Dados;

public class produtoTest {
    public static void main(String[] args) {

        //explicito
        produto p1 = new produto("Notebook" , 4356.90 , 0.25);
        //p1.nome = "Notebook";
       // p1.valor = 4356.89;
       // p1.desconto = 0.25;

        //inplicito usando o construtor padrão
        var p2 = new produto();
        p2.nome  = "Caneta Preta";
        p2.valor = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.PreçoComDesconto();
        double precoFinal2 = p2.PreçoComDesconto();
        double media = (precoFinal1+precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f." , media);




    }
}
