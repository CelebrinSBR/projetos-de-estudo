public class carro implements veiculo {
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando.");
    }
}
