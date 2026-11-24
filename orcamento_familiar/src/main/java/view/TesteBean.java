package view;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class TesteBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
    private Date data;

    public void executarTeste() {
        String dataFormatada = (data != null) ? new SimpleDateFormat("dd/MM/yyyy").format(data) : "não informada";
        String texto = "Olá, " + nome + "! Data: " + dataFormatada;
        
        FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage(FacesMessage.SEVERITY_INFO, "PrimeFaces 5.2 OK!", texto));
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
}
	

