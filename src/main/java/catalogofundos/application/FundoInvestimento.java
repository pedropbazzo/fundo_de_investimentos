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

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getAplicacaoMinima() {
		return aplicacaoMinima;
	}

	public void setAplicacaoMinima(BigDecimal aplicacaoMinima) {
		this.aplicacaoMinima = aplicacaoMinima;
	}

	public Risco getRisco() {
		return risco;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getTaxaAdministracao() {
		return taxaAdministracao;
	}

	public void setTaxaAdministracao(Double taxaAdministracao) {
		this.taxaAdministracao = taxaAdministracao;
	}

	public String getGestor() {
		return gestor;
	}

	public void setGestor(String gestor) {
		this.gestor = gestor;
	}

	@Override
	public String toString() {
		return "Fundo [id=" + id + ", nome=" + nome + ", aplicacaoMinima=" + aplicacaoMinima + ", risco=" + risco
				+ ", categoria=" + categoria + ", taxaAdministracao=" + taxaAdministracao + ", gestor=" + gestor + "]";
	}
	
}
