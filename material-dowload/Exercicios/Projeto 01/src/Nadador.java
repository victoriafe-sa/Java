public class Nadador {
    
    String nome;
    int idade;

    public Nadador (String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public static void main(String[] args){
        Nadador nadador = new Nadador("Victoria",18);

        System.out.println("Nome:" + nadador.getNome());
        System.out.println("Idade:" + nadador.getIdade());
    }
}