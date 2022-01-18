package catalogofundos.application;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FundoInvestimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private BigDecimal aplicacaoMinima;
	private Risco risco;
	private Categoria categoria;
	private Double taxaAdministracao;
	private String gestor;
	
	public FundoInvestimento() {
	}

	public FundoInvestimento(String nome, BigDecimal aplicacaoMinima, Risco risco, Categoria categoria,
			Double taxaAdministracao, String gestor) {
		this.nome = nome;
		this.aplicacaoMinima = aplicacaoMinima;
		this.risco = risco;
		this.categoria = categoria;
		this.taxaAdministracao = taxaAdministracao;
		this.gestor = gestor;
	}

	@Override
	public String toString() {
		return "Fundo [id=" + id + ", nome=" + nome + ", aplicacaoMinima=" + aplicacaoMinima + ", risco=" + risco
				+ ", categoria=" + categoria + ", taxaAdministracao=" + taxaAdministracao + ", gestor=" + gestor + "]";
	}
	
}
