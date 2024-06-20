package projeto.model;

public class Passagens extends Viagens {

    private String classe;
    private String nomeComprador;

    public Passagens(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, int tipo, int numeroPassagem, String classe, String nomeComprador) {
        super(valor, data, horario, pais, cidade, tamanhoTurma, tipo, numeroPassagem);
        this.classe = classe;
        this.nomeComprador = nomeComprador;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }
}
