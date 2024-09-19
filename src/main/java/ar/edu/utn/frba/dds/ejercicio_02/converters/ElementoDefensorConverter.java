package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ElementoDefensorConverter implements AttributeConverter<ElementoDefensor, String> {

    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        return elementoDefensor.getClass().getSimpleName();
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String dbData) {
        switch (dbData) {
            case "Arco":
                return new Arco();
            case "Escudo":
                return new Escudo();
            case "Espada":
                return new Espada();
            default:
                throw new IllegalArgumentException("Unknown" + dbData);
        }
    }}