package projeto.controller;

import projeto.model.Viagens;
import projeto.repository.ProjetoRepository;

import java.util.ArrayList;

public class ProjetoController implements ProjetoRepository {
    private ArrayList<Viagens> listaDeViagens = new ArrayList<Viagens>();


    @Override
    public void cadastrar(Viagens viagens) {

    }

    @Override
    public void atualizar(Viagens viagens) {

    }

    @Override
    public void deletar(int numeroDeSerie) {

    }

    @Override
    public void procurarViagem(int numeroDeSerie) {

    }

    @Override
    public void vizualizarTodas() {
        for (Viagens viagem : listaDeViagens) {
            viagem.visualizarViagem();
        }

    }
}