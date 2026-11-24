package enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enums.FormaPagamentoEnum;

@Converter(autoApply = true)
public class FormaPagamentoConverter implements AttributeConverter<FormaPagamentoEnum, String>{

	@Override
	public String convertToDatabaseColumn(FormaPagamentoEnum attribute) {
		 if (attribute == null) {
	            return null;
	        }
	        return attribute.getCodigo();
	}

	@Override
	public FormaPagamentoEnum convertToEntityAttribute(String codigo) {
		 if (codigo == null) {
	            return null;
	        }
	        return FormaPagamentoEnum.deCodigo(codigo);
	}

}
