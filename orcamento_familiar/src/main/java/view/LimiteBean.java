package view;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("limiteBean")
@RequestScoped
public class LimiteBean implements Serializable{
	private int percentualUsado = 21;
	private int percentualUsadoB = 12;
	
    public int getPercentualUsado() {
        return percentualUsado;
    }

    public void setPercentualUsado(int percentualUsado) {
        this.percentualUsado = percentualUsado;
    }

	public int getPercentualUsadoB() {
		return percentualUsadoB;
	}

	public void setPercentualUsadoB(int percentualUsadoB) {
		this.percentualUsadoB = percentualUsadoB;
	}
    
    
}
