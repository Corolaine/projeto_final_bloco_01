package projeto.controller;

import projeto.model.Viagens;
import projeto.repository.ProjetoRepository;

import java.util.ArrayList;
import java.util.Iterator;

public class ProjetoController implements ProjetoRepository {
    private ArrayList<Viagens> listaDeViagens = new ArrayList<>();

    @Override
    public void cadastrar(Viagens viagem) {
        listaDeViagens.add(viagem);
        System.out.println("Viagem cadastrada com sucesso!");
    }

    @Override
    public void atualizar(Viagens viagemAtualizada) {
        for (Viagens viagem : listaDeViagens) {
            if (viagem.getNumeroPassagem() == viagemAtualizada.getNumeroPassagem()) {
                viagem.setValor(viagemAtualizada.getValor());
                viagem.setData(viagemAtualizada.getData());
                viagem.setHorario(viagemAtualizada.getHorario());
                viagem.setPais(viagemAtualizada.getPais());
                viagem.setCidade(viagemAtualizada.getCidade());
                viagem.setTamanhoTurma(viagemAtualizada.getTamanhoTurma());
                viagem.setTipo(viagemAtualizada.getTipo());

                System.out.println("Dados da viagem atualizados com sucesso!");
                return;
            }
        }
        System.out.println("Viagem não encontrada para atualizar.");
    }

    @Override
    public void deletar(int numeroDeSerie) {
        for (Iterator<Viagens> iterator = listaDeViagens.iterator(); iterator.hasNext(); ) {
            Viagens viagem = iterator.next();
            if (viagem.getNumeroPassagem() == numeroDeSerie) {
                iterator.remove();
                System.out.println("Viagem deletada com sucesso!");
                return;
            }
        }
        System.out.println("Viagem não encontrada para deletar.");
    }

    @Override
    public void procurarViagem(int numeroDeSerie) {
        for (Viagens viagem : listaDeViagens) {
            if (viagem.getNumeroPassagem() == numeroDeSerie) {
                viagem.visualizarViagem();
                return;
            }
        }
        System.out.println("Viagem não encontrada.");
    }

    @Override
    public void vizualizarTodas() {
        if (listaDeViagens.isEmpty()) {
            System.out.println("Não há viagens cadastradas.");
        } else {
            System.out.println("\nViagens Cadastradas:");
            for (Viagens viagem : listaDeViagens) {
                viagem.visualizarViagem();
            }
        }
    }

    public void cancelarViagem(int numeroDeSerie) {
        for (Iterator<Viagens> iterator = listaDeViagens.iterator(); iterator.hasNext(); ) {
            Viagens viagem = iterator.next();
            if (viagem.getNumeroPassagem() == numeroDeSerie) {
                iterator.remove();
                System.out.println("Viagem cancelada com sucesso!");
                return;
            }
        }
        System.out.println("Viagem não encontrada para cancelar.");
    }
}