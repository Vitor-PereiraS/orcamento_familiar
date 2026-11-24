package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import enums.EscopoEnum;

import enums.FormaPagamentoEnum;

import enums.NaturezaEnum;

@Entity
public class Lancamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lancamento_seq_gen")
	@SequenceGenerator(name = "lancamento_seq_gen", sequenceName = "lancamento_id", allocationSize = 1)
	private Long id;
	private Usuario usuario;
	private NaturezaEnum natureza;
	private FormaPagamentoEnum formaPagamento;
	private EscopoEnum escopo;
	private String titulo;
	private BigDecimal valorLancamento;
	private String descricao;
	private LocalDateTime dataLancamento;
	private LocalDateTime dataEfetivacao;
	private Integer versao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAlteracao;
	private Usuario usuario_alteracao;

	private List<Anexo> anexos = new ArrayList<>();

	public Lancamento(Long id, Usuario usuario, NaturezaEnum natureza, FormaPagamentoEnum formaPagamento, EscopoEnum escopo,
			String titulo, BigDecimal valorLancamento, Integer versao) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.natureza = natureza;
		this.formaPagamento = formaPagamento;
		this.escopo = escopo;
		this.titulo = titulo;
		this.valorLancamento = valorLancamento;
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
		Lancamento other = (Lancamento) obj;
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

	public Usuario getUsuario_alteracao() {
		return usuario_alteracao;
	}

	public void setUsuario_alteracao(Usuario usuario_alteracao) {
		this.usuario_alteracao = usuario_alteracao;
	}

	public NaturezaEnum getNatureza() {
		return natureza;
	}

	public void setNatureza(NaturezaEnum natureza) {
		this.natureza = natureza;
	}

	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public EscopoEnum getEscopo() {
		return escopo;
	}

	public void setEscopo(EscopoEnum escopo) {
		this.escopo = escopo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public BigDecimal getValorLancamento() {
		return valorLancamento;
	}

	public void setValorLancamento(BigDecimal valorLancamento) {
		this.valorLancamento = valorLancamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public LocalDateTime getDataEfetivacao() {
		return dataEfetivacao;
	}

	public void setDataEfetivacao(LocalDateTime dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(LocalDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

}
