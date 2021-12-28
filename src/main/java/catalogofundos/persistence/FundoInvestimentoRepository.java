package catalogofundos.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import catalogofundos.application.Categoria;
import catalogofundos.application.FundoInvestimento;
import catalogofundos.application.Risco;

public interface FundoInvestimentoRepository extends JpaRepository<FundoInvestimento, Integer> {

	public List<FundoInvestimento> findByCategoria(Categoria categoria);
	public List<FundoInvestimento> findByRisco(Risco risco);
	public List<FundoInvestimento> findByCategoriaAndRisco(Categoria categoria, Risco risco);
}
