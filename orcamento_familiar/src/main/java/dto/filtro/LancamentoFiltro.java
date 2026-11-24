package dto.filtro;

import java.io.Serializable;
import java.time.LocalDate;

import dto.model.UsuarioModel;
import enums.EscopoEnum;
import enums.FormaPagamentoEnum;
import enums.NaturezaEnum;

public class LancamentoFiltro implements Serializable{
	
	

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private NaturezaEnum natureza;
	private EscopoEnum escopo;
	private FormaPagamentoEnum formaPagamento;
	private UsuarioModel usuario;
	private String Titulo;
	
	
	public LancamentoFiltro(LocalDate dataInicio, LocalDate dataFinal, NaturezaEnum natureza, EscopoEnum escopo,
			FormaPagamentoEnum formaPagamento, UsuarioModel usuario, String titulo) {
		super();
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.natureza = natureza;
		this.escopo = escopo;
		this.formaPagamento = formaPagamento;
		this.usuario = usuario;
		Titulo = titulo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataFinal() {
		return dataFinal;
	}


	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}


	public NaturezaEnum getNatureza() {
		return natureza;
	}


	public void setNatureza(NaturezaEnum natureza) {
		this.natureza = natureza;
	}


	public EscopoEnum getEscopo() {
		return escopo;
	}


	public void setEscopo(EscopoEnum escopo) {
		this.escopo = escopo;
	}


	public FormaPagamentoEnum getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public UsuarioModel getUsuario() {
		return usuario;
	}


	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
