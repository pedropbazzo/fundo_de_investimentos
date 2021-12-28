package catalogofundos.application;

import java.util.List;
import java.util.Optional;

public interface FundoInvestimentoService {

	public FundoInvestimento adicionar(FundoInvestimento fundo);
    public List<FundoInvestimento> listar(Optional<Categoria> categoria, Optional<Risco> risco);
	
	
}
