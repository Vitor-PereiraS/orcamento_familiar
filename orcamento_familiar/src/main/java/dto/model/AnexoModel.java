package dto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AnexoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer qntMaxLancamento; 
	private Integer tamanhoMax;
	private List<String> tiposPermitios = new ArrayList<>();
	private boolean obrigatorio;
	
	
	public AnexoModel(Integer qntMaxLancamento, Integer tamanhoMax, List<String> tiposPermitios, boolean obrigatorio) {
		super();
		this.qntMaxLancamento = qntMaxLancamento;
		this.tamanhoMax = tamanhoMax;
		this.tiposPermitios = tiposPermitios;
		this.obrigatorio = obrigatorio;
	}


	public Integer getQntMaxLancamento() {
		return qntMaxLancamento;
	}


	public void setQntMaxLancamento(Integer qntMaxLancamento) {
		this.qntMaxLancamento = qntMaxLancamento;
	}


	public Integer getTamanhoMax() {
		return tamanhoMax;
	}


	public void setTamanhoMax(Integer tamanhoMax) {
		this.tamanhoMax = tamanhoMax;
	}


	public List<String> getTiposPermitios() {
		return tiposPermitios;
	}


	public void setTiposPermitios(List<String> tiposPermitios) {
		this.tiposPermitios = tiposPermitios;
	}


	public boolean isObrigatorio() {
		return obrigatorio;
	}


	public void setObrigatorio(boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}
	
	
	
}
