package Estrutura_De_Dados;

public class produto {

    String nome;
    double valor;
    double desconto;


    produto(){

    }
     produto( String nomeInicial,double valorInicial, double descontoInicial){
        nome = nomeInicial;
        valor = valorInicial;
        desconto = descontoInicial;
     }



    double PreçoComDesconto(){
        return valor * (1-desconto);
    }

    double PreçoComDesconto(double descontoGerente){
        return valor * (1- desconto + descontoGerente);
    }


}
