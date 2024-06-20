package projeto.model;

public class Pacotes extends Passagens {

    private int numeroPacote;
    private int quantidadePacotes;

    public Pacotes(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, String classe, String nomeComprador, int tipo, int numeroPacote, int quantidadePacotes) {
        super(valor, data, horario, pais, cidade, tamanhoTurma, classe, nomeComprador, tipo);
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

    @Override
    public void visualizarViagem() {
        super.visualizarViagem();
        System.out.println("Número do Pacote: " + this.numeroPacote);
        System.out.println("Quantidade de Pacotes: " + this.quantidadePacotes);
    }
}