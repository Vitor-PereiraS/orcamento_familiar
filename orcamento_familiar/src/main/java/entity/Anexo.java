package entity;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Anexo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anexo_seq_gen")
	@SequenceGenerator(name = "anexo_seq_gen", sequenceName = "anexo_id", allocationSize = 1)
	private Long id;
	private Lancamento lancamento;
	private String nomeArquivo;
	private String content_type;
	private Double tamanhoBytes;
	private byte[] conteudo;
	private LocalDateTime dataUpload;
	private Usuario usuarioUpload;
	
	public Anexo(Long id, Lancamento lancamento, String nomeArquivo, String content_type, Double tamanhoBytes,
			byte[] conteudo, Usuario usuarioUpload) {
		super();
		this.id = id;
		this.lancamento = lancamento;
		this.nomeArquivo = nomeArquivo;
		this.content_type = content_type;
		this.tamanhoBytes = tamanhoBytes;
		this.conteudo = conteudo;
		this.usuarioUpload = usuarioUpload;
		this.dataUpload = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
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
		Anexo other = (Anexo) obj;
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

	public Lancamento getLancamento() {
		return lancamento;
	}

	public void setLancamento(Lancamento lancamento) {
		this.lancamento = lancamento;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public String getContent_type() {
		return content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	public Double getTamanhoBytes() {
		return tamanhoBytes;
	}

	public void setTamanhoBytes(Double tamanhoBytes) {
		this.tamanhoBytes = tamanhoBytes;
	}

	public byte[] getConteudo() {
		return conteudo;
	}

	public void setConteudo(byte[] conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDateTime getDataUpload() {
		return dataUpload;
	}

	public void setDataUpload(LocalDateTime dataUpload) {
		this.dataUpload = dataUpload;
	}

	public Usuario getUsuarioUpload() {
		return usuarioUpload;
	}

	public void setUsuarioUpload(Usuario usuarioUpload) {
		this.usuarioUpload = usuarioUpload;
	}
			
}
