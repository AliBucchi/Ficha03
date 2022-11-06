import java.util.Scanner;

public class UsaPessoa {
    // construtor default para objetos da classe
    // UsaPessoa este construtor existe mesmo se não for explicitamente declarado

    public UsaPessoa ( ) { }

    public static void main (String[]args){
        //Declara objeto pessoa1
        Pessoa pessoa1;

        //Cria o objeto pessoa1 que é instância da classe Pessoa
        pessoa1 = new Pessoa();

        Scanner ler = new Scanner(System.in);

        //Define os valores para os atributos de pessoa1
        System.out.println("Digite o nome da pessoa: ");
        String nome = ler.nextLine();
        pessoa1.setNome(nome);

        System.out.println("Digite o sexo da pessoa. M para masculino ou F para feminino: ");
        char genero = ler.next().charAt(0);
        pessoa1.setGenero(genero);

        System.out.println("Digite a idade da pessoa: ");
        int idade = ler.nextInt();
        pessoa1.setIdade(idade);


        System.out.println("O objeto pessoa1 chama-se " + pessoa1.getNome()
                + ", é do sexo " + pessoa1.getGenero()
                + ", tem " + pessoa1.getIdade() + " anos e diz: ");
        pessoa1.falar();
        }
}

