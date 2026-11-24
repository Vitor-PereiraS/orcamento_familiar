package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class LimiteUsuario implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "limiteUsuario_seq_gen")
	@SequenceGenerator(name = "limiteUsuario_seq_gen", sequenceName = "limiteUsuario_id", allocationSize = 1)
	private Long id;
	private Usuario usuario;
	private Integer AnoMesInicio;
	private BigDecimal valorLimitePessoal;
	private Integer versao;
	private LocalDateTime dataAlteracao;
	
	public LimiteUsuario(Usuario usuario, Integer anoMesInicio, BigDecimal valorLimitePessoal, Integer versao) {
		super();
		this.usuario = usuario;
		AnoMesInicio = anoMesInicio;
		this.valorLimitePessoal = valorLimitePessoal;
		this.versao = versao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		LimiteUsuario other = (LimiteUsuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getAnoMesInicio() {
		return AnoMesInicio;
	}

	public void setAnoMesInicio(Integer anoMesInicio) {
		AnoMesInicio = anoMesInicio;
	}

	public BigDecimal getValorLimitePessoal() {
		return valorLimitePessoal;
	}

	public void setValorLimitePessoal(BigDecimal valorLimitePessoal) {
		this.valorLimitePessoal = valorLimitePessoal;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	
	
	
	
}
