package dto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import enums.EscopoEnum;
import enums.FormaPagamentoEnum;
import enums.NaturezaEnum;

public class LancamentoModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDateTime data;
	private String titulo;
	private NaturezaEnum natureza;
	private FormaPagamentoEnum forma;
	private EscopoEnum escopo;
	private UsuarioModel usuario;
	private BigDecimal valor;
	private String descricao;
	
	public LancamentoModel(String titulo, NaturezaEnum natureza, FormaPagamentoEnum forma, EscopoEnum escopo,
			UsuarioModel usuario, BigDecimal valor, String descricao) {
		super();
		this.titulo = titulo;
		this.natureza = natureza;
		this.forma = forma;
		this.escopo = escopo;
		this.usuario = usuario;
		this.valor = valor;
		this.descricao = descricao;
		this.data = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
		
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
		LancamentoModel other = (LancamentoModel) obj;
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

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public NaturezaEnum getNatureza() {
		return natureza;
	}

	public void setNatureza(NaturezaEnum natureza) {
		this.natureza = natureza;
	}

	public FormaPagamentoEnum getForma() {
		return forma;
	}

	public void setForma(FormaPagamentoEnum forma) {
		this.forma = forma;
	}

	public EscopoEnum getEscopo() {
		return escopo;
	}

	public void setEscopo(EscopoEnum escopo) {
		this.escopo = escopo;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
