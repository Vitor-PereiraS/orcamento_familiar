package enums.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import enums.NaturezaEnum;

@Converter(autoApply = true)
public class NaturezaConverter implements AttributeConverter<NaturezaEnum , String>{

	@Override
	public String convertToDatabaseColumn(NaturezaEnum  attribute) {
		 if (attribute == null) {
	            return null;
	        }
	        return attribute.getCodigo();
	}

	@Override
	public NaturezaEnum  convertToEntityAttribute(String codigo) {
		 if (codigo == null) {
	            return null;
	        }
	        return NaturezaEnum.deCodigo(codigo);
	}

}
