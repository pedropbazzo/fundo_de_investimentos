package catalogofundos.enum;

public class Enum {

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
    
}
