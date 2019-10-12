package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RuedaMapper {
	@Mappings({
		@Mapping(source="rueda.posicion", target="posicion"),
		@Mapping(source="rueda.medida", target="medida"),
		@Mapping(source="rueda.perfil", target="perfil"),
		@Mapping(source="rueda.estado", target="estado")
	})
	public void cocheConRuedasToRueda(Rueda rueda, @MappingTarget cocheConRuedas cocheConRuedas);
}
