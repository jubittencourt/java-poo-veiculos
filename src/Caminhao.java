public class Caminhao extends Veiculo {
    public Caminhao(String modelo, int ano) { super(modelo, ano); }

    @Override
    public void ligar() {
        System.out.println("Caminhão " + getModelo() + " ligado com botão de ignição.");
    }
}

