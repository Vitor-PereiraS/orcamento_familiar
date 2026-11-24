package enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enums.EscopoEnum;

@Converter(autoApply = true)
public class EscopoConverter implements AttributeConverter<EscopoEnum, String>{

	@Override
	public String convertToDatabaseColumn(EscopoEnum attribute) {
		 if (attribute == null) {
	            return null;
	        }
	        return attribute.getCodigo();
	}

	@Override
	public EscopoEnum convertToEntityAttribute(String codigo) {
		 if (codigo == null) {
	            return null;
	        }
	        return EscopoEnum.deCodigo(codigo);
	}

}
