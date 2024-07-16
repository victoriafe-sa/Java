public class Carro {
    
    String cor;
    String marca;
    String modelo;

    public Carro(String cor, String marca, String modelo){
    this.cor = cor;
    this.marca = marca;
    this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public static void main(String[] args){
        Carro carro = new Carro("Vermelho","Toyota","Sedan");

        System.out.println("Cor:" + carro.getCor());
        System.out.println("Marca:" + carro.getMarca());
        System.out.println("Modelo:" + carro.getModelo());
    }
}