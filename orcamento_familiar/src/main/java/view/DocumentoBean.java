package view;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
@ViewScoped
public class DocumentoBean {

	private UploadedFile arquivo;
	private String arquivoBase64;
	private String conteudoTexto;
	private String contentType;

	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("CHEGOU NO BEAN");
		this.arquivo = event.getFile();
		this.contentType = arquivo.getContentType();

		// Limpa prévias anteriores
		this.arquivoBase64 = null;
		this.conteudoTexto = null;

		if ("text/plain".equalsIgnoreCase(contentType)) {
			this.conteudoTexto = new String(arquivo.getContents(), StandardCharsets.UTF_8);
		} else {
			String base64 = Base64.getEncoder().encodeToString(arquivo.getContents());
			this.arquivoBase64 = "data:" + this.contentType + ";base64," + base64;
		}

		FacesMessage msg = new FacesMessage("Sucesso", arquivo.getFileName() + " carregado.");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public boolean isPdf() {
		return arquivoBase64 != null && "application/pdf".equalsIgnoreCase(contentType);
	}

	public boolean isImagem() {
		return arquivoBase64 != null && contentType != null && contentType.startsWith("image/");
	}

	public boolean isTexto() {
		return conteudoTexto != null;
	}

	// Getters
	public String getArquivoBase64() {
		return arquivoBase64;
	}

	public String getConteudoTexto() {
		return conteudoTexto;
	}

	public UploadedFile getArquivo() {
		return arquivo;
	}
}