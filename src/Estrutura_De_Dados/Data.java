package Estrutura_De_Dados;

public class Data{

    int dia;
    int mes;
    int ano;

    String DataFormata(){
       return String.format("%d/%d/%d" , dia , ano , mes);
    }

    void imprimirDataFormatada(){
        System.out.println(DataFormata());
    }



}