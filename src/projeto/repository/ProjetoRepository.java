package projeto.repository;
import projeto.model.Viagens;
public interface ProjetoRepository {

    public void cadastrar(Viagens viagens);
    public void atualizar(Viagens viagens);
    public void deletar (int numeroDeSerie);
    public void procurarViagem (int numeroDeSerie);
    public void vizualizarTodas ();
}
