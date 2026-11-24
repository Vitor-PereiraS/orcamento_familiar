package enums;

import java.util.stream.Stream;

public enum  FormaPagamentoEnum {
	DEBITO("D"), 
	CREDITO("C");
	
	  private final String codigo;

	  FormaPagamentoEnum (String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    // Converte o valor vindo do banco de volta para o Enum
    public static FormaPagamentoEnum  deCodigo(String codigo) {
        if (codigo == null) {
            return null;
        }
        return Stream.of(FormaPagamentoEnum .values())
                .filter(n -> n.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Código inválido: " + codigo));
    }
}

