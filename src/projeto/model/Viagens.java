package projeto.model;

public abstract class Viagens {

    private double valor;
    private String data;
    private String horario;
    private String pais;
    private String cidade;
    private int tamanhoTurma;
    private int tipo;
    private int numeroPassagem;
    private static int nomeCompradorPacote;

    public Viagens(double valor, String data, String horario, String pais, String cidade, int tamanhoTurma, int tipo, int numeroPassagem) {
        this.valor = valor;
        this.data = data;
        this.horario = horario;
        this.pais = pais;
        this.cidade = cidade;
        this.tamanhoTurma = tamanhoTurma;
        this.tipo = tipo;
        this.numeroPassagem = numeroPassagem;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTamanhoTurma() {
        return tamanhoTurma;
    }

    public void setTamanhoTurma(int tamanhoTurma) {
        this.tamanhoTurma = tamanhoTurma;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumeroPassagem() {
        return numeroPassagem;
    }

    public void setNumeroPassagem(int numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }

    public void visualizarViagem() {
        String tipoViagem = (tipo == 1) ? "Passagem" : "Pacote";
        System.out.println("\nTipo de viagem: " + tipoViagem);
        System.out.println("Valor da viagem: R$ " + valor);
        System.out.println("Data da viagem: " + data);
        System.out.println("Horário de viagem: " + horario);
        System.out.println("País de destino: " + pais);
        System.out.println("Cidade de destino: " + cidade);
        System.out.println("Número de passagem: " + numeroPassagem);
        System.out.println("------------------------");
    }
}


    