package enums;

import java.util.stream.Stream;

public enum EscopoEnum {
	COMUM("C"),
	PESSOAL("P");
	
	  private final String codigo;

	  EscopoEnum(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    // Converte o valor vindo do banco de volta para o Enum
    public static EscopoEnum deCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        return Stream.of(EscopoEnum.values())
                .filter(n -> n.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código inválido: " + codigo));
    }
}

