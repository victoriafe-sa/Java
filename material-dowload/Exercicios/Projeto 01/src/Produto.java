public class Produto {
    public String nome;
    public Double preco;
    public int quantidade;

    public Produto (String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Vestido", 89.99, 2);

        System.out.println("Nome do produto: " +produto.getNome());
        System.out.println("Preço do produto: " +produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}
