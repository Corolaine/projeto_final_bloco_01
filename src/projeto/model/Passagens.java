package projeto.model;

public class Passagens extends Viagens {

    private String classe;
    private String nomeComprador;

    public Passagens(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, String classe, String nomeComprador, int tipo) {
        super(valor, data, horario, pais, cidade, tamanhoTurma, tipo);
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

    @Override
    public void visualizarViagem() {
        super.visualizarViagem();
        System.out.println("Classe do Voo: " + this.classe);
        System.out.println("Nome do Comprador: " + this.nomeComprador);
    }
}