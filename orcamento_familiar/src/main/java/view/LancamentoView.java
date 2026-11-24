package view;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

import dto.model.LancamentoModel;
import dto.model.UsuarioModel;
import enums.EscopoEnum;
import enums.FormaPagamentoEnum;
import enums.NaturezaEnum;

@Named(value = "lancamentoView")
@ViewScoped
public class LancamentoView implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private UsuarioModel usuario;
	
	private LancamentoModel lancamento;
	private LancamentoModel lancamentoSelecionado;
	
	private List<LancamentoModel> lancamentos;
	
	
	public LancamentoView() {
	}
	
	@PostConstruct
	public void inicializar() {
		usuario = new UsuarioModel("adm", "adm@gmail.com", "adm123");
		
		lancamentos = new ArrayList<>(Arrays.asList(
				new LancamentoModel("conta de luz", NaturezaEnum.DESPESA, FormaPagamentoEnum.DEBITO, EscopoEnum.COMUM, usuario, new BigDecimal(200.00), "conta mensal de luz"),
				new LancamentoModel("conta de agua", NaturezaEnum.DESPESA, FormaPagamentoEnum.DEBITO, EscopoEnum.COMUM, usuario, new BigDecimal(100.00),"conta mensal de água"),
				new LancamentoModel("conta de telefone", NaturezaEnum.DESPESA, FormaPagamentoEnum.DEBITO, EscopoEnum.COMUM, usuario, new BigDecimal(150.00), "conta mensal de telefone")
				));
		
	}
	
	public void pegarLancamento(LancamentoModel lancamentoSelecionado) {
		this.lancamento = sellerService.findById(vendedorSelecionado.getId());
		if (this.novoSeller.getDepartment() != null) {
			this.idDepartamentoSelecionado = this.novoSeller.getDepartment().getId();
		}
	}

	public void pegarVendedorSelecionado() {
		if (this.lancamentoSelecionado != null) {
			// Reutiliza a lógica que você já tinha passando o objeto selecionado
			this.pegarLancamento(this.lancamentoSelecionado);
		}
	}
	
	public void habilitarLinhaSelecionada(SelectEvent event) {
		// Força o Java a atribuir o objeto vindo do evento de clique da tabela
		this.lancamentoSelecionado = (LancamentoModel) event.getObject();
	}

	public void desabilitarLinhaSelecionada(UnselectEvent event) {
		this.lancamentoSelecionado = null; // Força o Java a zerar a seleção
	}
	
	
	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

	public List<LancamentoModel> getLancamentos() {
		return lancamentos;
	}

	public LancamentoModel getLancamento() {
		return lancamento;
	}

	public void setLancamento(LancamentoModel lancamento) {
		this.lancamento = lancamento;
	}

	public LancamentoModel getLancamentoSelecionado() {
		return lancamentoSelecionado;
	}

	public void setLancamentoSelecionado(LancamentoModel lancamentoSelecionado) {
		this.lancamentoSelecionado = lancamentoSelecionado;
	}
	
}
