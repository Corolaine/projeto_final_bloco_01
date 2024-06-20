package projeto.model;

public abstract class Viagens {

    private double valor;
    private String data;
    private String horario;
    private String pais;
    private String cidade;
    private String tamanhoTurma;
    private int tipo;
    private int numeroPassagem;

    public Viagens(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, int tipo) {

    }

    public void visualizarViagem() {
        String tipo = "";
        switch (this.tipo){
            case 1:
                tipo = "Passagem";
                break;
            case 2:
                tipo = "Pacotes";
        }
        System.out.println("Tipo de viagem: " + tipo);
        System.out.println("\nListando as viagens cadastradas: ");
        System.out.println("\nValor da viagem: R$ " + valor);
        System.out.println("\nData da viagem: " + data);
        System.out.println("\nHorário de viagem: " + horario);
        System.out.println("\nPaís de destino: " + pais);
        System.out.println("\nCidade de destino: " + cidade);
        System.out.println("\nNúmero de passagem: " +numeroPassagem);
        }

}


    