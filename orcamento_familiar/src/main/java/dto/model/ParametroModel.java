package dto.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ParametroModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<UsuarioModel> usuarios = new ArrayList<>();
	private BigDecimal saldoComum;
	private BigDecimal saldoPessoal;
	
	private AnexoModel anexo;

	public ParametroModel(BigDecimal saldoComum, BigDecimal saldoPessoal, AnexoModel anexo) {
		super();
		this.saldoComum = saldoComum;
		this.saldoPessoal = saldoPessoal;
		this.anexo = anexo;
	}

	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	
	public BigDecimal getSaldoComum() {
		return saldoComum;
	}

	public void setSaldoComum(BigDecimal saldoComum) {
		this.saldoComum = saldoComum;
	}

	public BigDecimal getSaldoPessoal() {
		return saldoPessoal;
	}

	public void setSaldoPessoal(BigDecimal saldoPessoal) {
		this.saldoPessoal = saldoPessoal;
	}

	public AnexoModel getAnexo() {
		return anexo;
	}

	public void setAnexo(AnexoModel anexo) {
		this.anexo = anexo;
	}
	
	
	
	
}
