package programacaooo20212.aula07.view;

import java.util.List;

public interface CadastroDAO {

	public void salvar(Object obj);

	public void atualizar(Object obj);

	public void deletar(int idDel);

	public Object getObjetoPorId(int idElemento);

	public List listarObjetos();
}
