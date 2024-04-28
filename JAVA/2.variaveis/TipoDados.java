/*Comentários 
 * programa desenvolvido pra estudo do java
*/


/***    
 * comentário oficial
 */
public class TipoDados{ // nas classes sempre utilize a primeira letra maiuscula e se for um nome composto  a segunda palara também deve iniciar com maiuscula
    public static void main(String[] args){ // método principal

        byte idade = 124;
		short ano = 1900;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float altura = 1.65F;
		double salario = 1275.33;
        String nomeSobrenome = "Alberto Gomes Nunes";
        char genero = 'M';//2 bytes
        char caracter = 99;
        char caracter2 = '\u0041';//número decimal representado a tabela únicode
        boolean casado= false; // o bolean só aceita true e false
        


        System.out.println("--Impressão de Variáveis--");
        System.out.println("Idade: "+idade);
        System.out.println("Ano de Nascimento: "+ano);
        System.out.println("Cep: "+cep);
        System.out.println("CPF: "+cpf);
        System.out.println("Altura: "+altura);
        System.out.println("Salário: "+salario);
        System.out.println("Nome e Sobrenome: "+nomeSobrenome);
        System.out.println("Gênero:"+genero);
        System.out.println("Casado:"+casado);
        System.out.println("Caracter:"+caracter);
        System.out.println("Caracter2:"+caracter2);




        System.out.println("visite o site : https://glysns.gitbook.io/java-basico/sintaxe/variaveis");
                           
          





    }
}