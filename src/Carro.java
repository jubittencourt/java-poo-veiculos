public class Carro extends Veiculo {
    public Carro(String modelo, int ano) { super(modelo, ano); }

    @Override
    public void ligar() {
        System.out.println("Carro " + getModelo() + " ligado com chave.");
    }
}

