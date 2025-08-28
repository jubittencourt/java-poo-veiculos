public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca", 1975);
        Veiculo moto = new Moto("Honda CG", 2020);
        Veiculo caminhao = new Caminhao("Volvo FH", 2022);

        carro.info();
        carro.ligar();

        moto.info();
        moto.ligar();

        caminhao.info();
        caminhao.ligar();
    }
}

