package projeto.model;

public class Pacotes extends Viagens {

    private int numeroPacote;
    private int quantidadePacotes;


    public Pacotes(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, int tipo, int numeroPassagem, int numeroPacote, int quantidadePacotes) {
        super(valor, data, horario, pais, cidade, tamanhoTurma, tipo, numeroPassagem);
        this.numeroPacote = numeroPacote;
        this.quantidadePacotes = quantidadePacotes;
    }

    public int getNumeroPacote() {
        return numeroPacote;
    }

    public void setNumeroPacote(int numeroPacote) {
        this.numeroPacote = numeroPacote;
    }

    public int getQuantidadePacotes() {
        return quantidadePacotes;
    }

    public void setQuantidadePacotes(int quantidadePacotes) {
        this.quantidadePacotes = quantidadePacotes;
    }
}

