package catalogofundos.application;

import java.util.List;
import java.util.Optional;

public interface FundoInvestimentoService {

	public FundoInvestimento adicionar(FundoInvestimento fundo);
	public List<FundoInvestimento> listar(Optional<Categoria> categoria, Optional<Risco> risco);
	public FundoInvestimento obter(Integer idFundo);
	public FundoInvestimento remover(Integer idFundo);
	public FundoInvestimento alterar(Integer idFundo, FundoInvestimento fundo);
}
