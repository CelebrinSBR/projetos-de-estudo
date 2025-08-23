import java.util.ArrayList;
import java.util.List;

class Carro {
    private String modelo;
    private double preco;

    public Carro(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void acelerar() {
        System.out.println(modelo + " está acelerando normalmente...");
    }

    public void frear() {
        System.out.println(modelo + " está freando...");
    }
}

// Loja
class LojaDeCarros {
    private String nome;
    private String endereco;
    private List<Carro> carros = new ArrayList<>();

    public LojaDeCarros(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarCarro(Carro c) {
        carros.add(c);
        System.out.println(c.getModelo() + " adicionado à loja.");
    }

    public void venderCarro(Carro c) {
        if (carros.remove(c)) {
            System.out.println(c.getModelo() + " foi vendido!");
        } else {
            System.out.println("Carro não encontrado na loja.");
        }
    }

    public void listarCarros() {
        System.out.println("Carros disponíveis na loja:");
        for (Carro c : carros) {
            System.out.println("- " + c.getModelo() + " (R$ " + c.getPreco() + ")");
        }
    }
}

// Herança + Polimorfismo
class CarroEsportivo extends Carro {
    public CarroEsportivo(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " acelera de 0 a 100 em 3 segundos!");
    }
}

class CarroPopular extends Carro {
    public CarroPopular(String modelo, double preco) {
        super(modelo, preco);
    }

    @Override
    public void acelerar() {
        System.out.println(getModelo() + " acelera de forma mais econômica.");
    }
}

// Main
public class Main {
    public static void main(String[] args) {
        LojaDeCarros loja = new LojaDeCarros("Super Carros", "Rua Central, 123");

        Carro ferrari = new CarroEsportivo("Ferrari F8", 2500000);
        Carro gol = new CarroPopular("VW Gol", 50000);

        loja.adicionarCarro(ferrari);
        loja.adicionarCarro(gol);

        loja.listarCarros();

        ferrari.acelerar(); // polimorfismo
        gol.acelerar();     // polimorfismo

        loja.venderCarro(gol);
        loja.listarCarros();
    }
}
