public class Operadores {

    static void main(String[] args){
         int n1 = 10;
         int n2 = 20;
        System.out.println(n1+n2);
        System.out.println("A soma de n1 + n2 : "+ n1+n2);// concatenção com operador +
        System.out.println("A soma de n1 + n2 : "+ (n1+n2));
        int soma =  n1 + n2;
        System.out.println("A soma de n1 + n2 : "+ soma);
        System.out.println("A multiplicação de n1 * n2 : "+ n1*n2);
        n1 = 3000;
        n2 = 3000;
        System.out.println("A multiplicação de n1 * n2 : "+ n1*n2);
        n1 = 3000000;// 32bits
        n2 = 3000000; 
        System.out.println("A multiplicação de n1 * n2 : "+ n1*n2);//No entanto, ao multiplicar 3.000.000 por 3.000.000, o resultado (9.000.000.000) excede o limite máximo de um int
        long  numeroLong1 = n1; //64 bits
        long  numeroLong2 = n2; 
        System.out.println("A multiplicação de n1 * n2 : "+ numeroLong1*numeroLong2);
        //int v1 = numeroLong1;
        n1 = 20;
        n2 = 40;
        System.out.println("A subtração de n1 - n2 : "+(n1 - n2));
        System.out.println("A divisão de n1 - n2 : "+ n1 / n2);//não deu certo, pois 20/40 = 0,5 divisão entre int não aparece numeros de ponto flutuante
        float f1 = n1;// conversão implicita
        System.out.println("A divisão de f1 / n2 : "+ f1 / n2);//conversão implicita


    }
}