package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Parametro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parametro_seq_gen")
	@SequenceGenerator(name = "parametro_seq_gen", sequenceName = "parametro_id", allocationSize = 1)
	private Long id;
	private BigDecimal valorLimiteMinimoComum;
	private BigDecimal valorLimiteMinimoPessoal;
	private Integer quantidadeMaxAnexos;
	private Integer tamanhoMaxKb;
	private List<String> tiposPermitidos;
	private Boolean AnexoObrigDespesa;
	private Integer versao;
	private LocalDateTime dataAleteracao;
	private Usuario usuarioAlteracao;
	
	public Parametro(Long id, BigDecimal valorLimiteMinimoComum, BigDecimal valorLimiteMinimoPessoal,
			Integer quantidadeMaxAnexos, Integer tamanhoMaxKb, List<String> tiposPermitidos, Boolean anexoObrigDespesa,
			Integer versao) {
		super();
		this.id = id;
		this.valorLimiteMinimoComum = valorLimiteMinimoComum;
		this.valorLimiteMinimoPessoal = valorLimiteMinimoPessoal;
		this.quantidadeMaxAnexos = quantidadeMaxAnexos;
		this.tamanhoMaxKb = tamanhoMaxKb;
		this.tiposPermitidos = tiposPermitidos;
		AnexoObrigDespesa = anexoObrigDespesa;
		this.versao = versao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AnexoObrigDespesa == null) ? 0 : AnexoObrigDespesa.hashCode());
		result = prime * result + ((dataAleteracao == null) ? 0 : dataAleteracao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantidadeMaxAnexos == null) ? 0 : quantidadeMaxAnexos.hashCode());
		result = prime * result + ((tamanhoMaxKb == null) ? 0 : tamanhoMaxKb.hashCode());
		result = prime * result + ((tiposPermitidos == null) ? 0 : tiposPermitidos.hashCode());
		result = prime * result + ((usuarioAlteracao == null) ? 0 : usuarioAlteracao.hashCode());
		result = prime * result + ((valorLimiteMinimoComum == null) ? 0 : valorLimiteMinimoComum.hashCode());
		result = prime * result + ((valorLimiteMinimoPessoal == null) ? 0 : valorLimiteMinimoPessoal.hashCode());
		result = prime * result + ((versao == null) ? 0 : versao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parametro other = (Parametro) obj;
		if (AnexoObrigDespesa == null) {
			if (other.AnexoObrigDespesa != null)
				return false;
		} else if (!AnexoObrigDespesa.equals(other.AnexoObrigDespesa))
			return false;
		if (dataAleteracao == null) {
			if (other.dataAleteracao != null)
				return false;
		} else if (!dataAleteracao.equals(other.dataAleteracao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantidadeMaxAnexos == null) {
			if (other.quantidadeMaxAnexos != null)
				return false;
		} else if (!quantidadeMaxAnexos.equals(other.quantidadeMaxAnexos))
			return false;
		if (tamanhoMaxKb == null) {
			if (other.tamanhoMaxKb != null)
				return false;
		} else if (!tamanhoMaxKb.equals(other.tamanhoMaxKb))
			return false;
		if (tiposPermitidos == null) {
			if (other.tiposPermitidos != null)
				return false;
		} else if (!tiposPermitidos.equals(other.tiposPermitidos))
			return false;
		if (usuarioAlteracao == null) {
			if (other.usuarioAlteracao != null)
				return false;
		} else if (!usuarioAlteracao.equals(other.usuarioAlteracao))
			return false;
		if (valorLimiteMinimoComum == null) {
			if (other.valorLimiteMinimoComum != null)
				return false;
		} else if (!valorLimiteMinimoComum.equals(other.valorLimiteMinimoComum))
			return false;
		if (valorLimiteMinimoPessoal == null) {
			if (other.valorLimiteMinimoPessoal != null)
				return false;
		} else if (!valorLimiteMinimoPessoal.equals(other.valorLimiteMinimoPessoal))
			return false;
		if (versao == null) {
			if (other.versao != null)
				return false;
		} else if (!versao.equals(other.versao))
			return false;
		return true;
	}
		
	
}
