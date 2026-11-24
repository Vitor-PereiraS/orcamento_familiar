package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import enums.EscopoEnum;

@Entity
public class SaldoControle implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saldoControle_seq_gen")
	@SequenceGenerator(name = "saldoControle_seq_gen", sequenceName = "saldoControle_id", allocationSize = 1)
	private Long id;
	private EscopoEnum escopo;
	private Usuario usuario;
	private LocalDate anoMes;
	private BigDecimal saldo;
	private Integer versao;
	private LocalDateTime atualizacao;
	
	
	public SaldoControle(EscopoEnum escopo, BigDecimal saldo, Integer versao) {
		super();
		this.escopo = escopo;
		this.saldo = saldo;
		this.versao = versao;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoMes == null) ? 0 : anoMes.hashCode());
		result = prime * result + ((atualizacao == null) ? 0 : atualizacao.hashCode());
		result = prime * result + ((escopo == null) ? 0 : escopo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		SaldoControle other = (SaldoControle) obj;
		if (anoMes == null) {
			if (other.anoMes != null)
				return false;
		} else if (!anoMes.equals(other.anoMes))
			return false;
		if (atualizacao == null) {
			if (other.atualizacao != null)
				return false;
		} else if (!atualizacao.equals(other.atualizacao))
			return false;
		if (escopo != other.escopo)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (saldo == null) {
			if (other.saldo != null)
				return false;
		} else if (!saldo.equals(other.saldo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (versao == null) {
			if (other.versao != null)
				return false;
		} else if (!versao.equals(other.versao))
			return false;
		return true;
	}


	public Long getId() {
		return id;
	}


	public EscopoEnum getEscopo() {
		return escopo;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public LocalDate getAnoMes() {
		return anoMes;
	}


	public BigDecimal getSaldo() {
		return saldo;
	}


	public Integer getVersao() {
		return versao;
	}


	public LocalDateTime getAtualizacao() {
		return atualizacao;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setEscopo(EscopoEnum escopo) {
		this.escopo = escopo;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public void setAnoMes(LocalDate anoMes) {
		this.anoMes = anoMes;
	}


	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}


	public void setVersao(Integer versao) {
		this.versao = versao;
	}


	public void setAtualizacao(LocalDateTime atualizacao) {
		this.atualizacao = atualizacao;
	}
	
	
	
}
