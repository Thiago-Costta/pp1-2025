import javax.swing.*;

public class Carro {
    // Variaveis
    // Tipo de dados primitivos (Letra no inicio minuscula)
    public int ano; // int é tipo primitivo por isso letra minuscula no começo
    public float velocidade; // float é tipo primitivo por isso letra minuscula no começo
    // Tipo de dado é uma classe (Letra no inicio maiuscula)
    public String marca, modelo; // String é uma classe por isso letra maiuscula no começo

    public Carro(){
        this.marca= "Vazia";
        this.modelo= "Vazio";
    }

    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    public void exibirDetalhes(){
        // This representa o objeto que chama o metodo
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca + // this representa o metodo que chama o objeto
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade);
    }
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x){
        if (x < this.velocidade){
            this.velocidade = this.velocidade - x;
        }
        else {
            System.out.println("Frenagem não realizada");
        }
    }
}