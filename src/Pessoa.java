public class Pessoa {

    private String nome;
    private char genero;
    private int idade;


        public void falar () {
            System.out.println("blablabla");
        }


        public String getNome () {

            return this.nome;
        }
        public void setNome (String nome){

            this.nome = nome;
        }

        public char getGenero () {

            return this.genero;
        }
        public void setGenero (char genero){

            this.genero = genero;
        }

        public int getIdade () {

            return this.idade;
        }
        public void setIdade ( int idade){

            this.idade = idade;
        }

    public Pessoa() { }
    public Pessoa(String n, char g) {
        this.nome = n;
        this.genero = g;
        }

    public Pessoa (String n, char g, int i) {
        this(n,g); // usa o construtor anterior
        this.idade = i;
        }
}
