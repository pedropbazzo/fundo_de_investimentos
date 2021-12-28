package catalogofundos.http;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import catalogofundos.application.Categoria;
import catalogofundos.application.FundoInvestimento;
import catalogofundos.application.FundoInvestimentoService;
import catalogofundos.application.Risco;

@RestController
@RequestMapping("/fundos")
public class FundoInvestimentoRestController {

	private FundoInvestimentoService service;

	public FundoInvestimentoRestController(@Autowired FundoInvestimentoService service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<FundoInvestimento> adicionar(@RequestBody FundoInvestimento fundo) {
		FundoInvestimento novoFundo = service.adicionar(fundo);
		ResponseEntity<FundoInvestimento> resposta = new ResponseEntity<FundoInvestimento>(novoFundo, HttpStatus.CREATED);
		return resposta;
	}
	
	@GetMapping
	public ResponseEntity<List<FundoInvestimento>> listar(@RequestParam Optional<Categoria> categoria, @RequestParam Optional<Risco> risco) {
		List<FundoInvestimento> fundos = service.listar(categoria, risco);
		
		HttpStatus status = fundos.size() == 0 ? HttpStatus.NOT_FOUND : HttpStatus.OK;
		
		ResponseEntity<List<FundoInvestimento>> resposta = new ResponseEntity<List<FundoInvestimento>>(fundos, status);
		return resposta;
	}
	
	@GetMapping("/{idFundo}")
	public ResponseEntity<FundoInvestimento> obter(@PathVariable("idFundo") Integer idFundo) {
		FundoInvestimento fundo = service.obter(idFundo);
		
		HttpStatus status = definirStatus(fundo);
		
		ResponseEntity<FundoInvestimento> resposta = new ResponseEntity<FundoInvestimento>(fundo, status);
		return resposta;
	}
	
	@PutMapping("/{idFundo}")
	public ResponseEntity<FundoInvestimento> alterar(@PathVariable("idFundo") Integer idFundo, @RequestBody FundoInvestimento fundo) {
		FundoInvestimento fundoAlterado = service.alterar(idFundo, fundo);
		
		HttpStatus status = definirStatus(fundoAlterado);
		
		ResponseEntity<FundoInvestimento> resposta = new ResponseEntity<FundoInvestimento>(fundoAlterado, status);
		return resposta;
	}

	@DeleteMapping("/{idFundo}")
	public ResponseEntity<FundoInvestimento> remover(@PathVariable("idFundo") Integer idFundo) {
		FundoInvestimento fundo = service.remover(idFundo);
		
		HttpStatus status = definirStatus(fundo);
		
		ResponseEntity<FundoInvestimento> resposta = new ResponseEntity<FundoInvestimento>(fundo, status);
		return resposta;
	}
	
	private HttpStatus definirStatus(FundoInvestimento fundo) {
		HttpStatus status;
		if (fundo == null) {
			status = HttpStatus.NOT_FOUND;
		} else {
			status = HttpStatus.OK;
		}
		return status;
	}
}
