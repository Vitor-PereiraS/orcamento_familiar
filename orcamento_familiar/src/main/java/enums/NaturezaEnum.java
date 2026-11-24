package enums;

import java.util.stream.Stream;

public enum NaturezaEnum {
	RECEITA("R"), 
	DESPESA("D");
	
	  private final String codigo;

	  NaturezaEnum (String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    // Converte o valor vindo do banco de volta para o Enum
    public static NaturezaEnum  deCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        return Stream.of(NaturezaEnum .values())
                .filter(n -> n.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código inválido: " + codigo));
    }
}

