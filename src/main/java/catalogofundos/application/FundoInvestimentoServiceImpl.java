package catalogofundos.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalogofundos.persistence.FundoInvestimentoRepository;

@Service
public class FundoInvestimentoServiceImpl implements FundoInvestimentoService {

	private FundoInvestimentoRepository repository;

	public FundoInvestimentoServiceImpl(@Autowired FundoInvestimentoRepository repository) {
		this.repository = repository;
	}

	@Override
	public FundoInvestimento adicionar(FundoInvestimento fundo) {
		fundo.setId(0);
		FundoInvestimento novoFundo = repository.save(fundo);
		return novoFundo;
	}
	
	@Override
	public List<FundoInvestimento> listar(Optional<Categoria> categoria, Optional<Risco> risco) {
		if (!categoria.isPresent() && !risco.isPresent()) {
			return repository.findAll();
		}
		if (!categoria.isPresent() && risco.isPresent()) {
			return repository.findByRisco(risco.get());
		}
		if (categoria.isPresent() && !risco.isPresent()) {
			return repository.findByCategoria(categoria.get());
		}
		return repository.findByCategoriaAndRisco(categoria.get(), risco.get());
	}

	@Override
	public FundoInvestimento obter(Integer idFundo) {
		Optional<FundoInvestimento> fundo = repository.findById(idFundo);
		return fundo.isPresent() ? fundo.get() : null;
	}

	@Override
	public FundoInvestimento remover(Integer idFundo) {
		FundoInvestimento fundo = obter(idFundo);
		if (fundo == null) {
			return null;
		}
		repository.delete(fundo);
		return fundo;
	}

	@Override
	public FundoInvestimento alterar(Integer idFundo, FundoInvestimento fundo) {
		if (!repository.existsById(idFundo)) {
			return null;
		}
		fundo.setId(idFundo);
		return repository.save(fundo);
	}
	
	
}
