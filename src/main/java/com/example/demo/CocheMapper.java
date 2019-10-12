package com.example.demo;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CocheMapper {

	@Mappings({
		@Mapping(source="coche.modelo", target="modelo"),
		@Mapping(source="coche.marca", target="marca")
	})
	public cocheConRuedas cocheConRuedasToCoche(Coche coche, Rueda rueda);
	
	@AfterMapping
	default void mapeaRueda(Coche coche, Rueda rueda, @MappingTarget cocheConRuedas cocheConRuedas) {
		RuedaMapper mapper = Mappers.getMapper(RuedaMapper.class);
		mapper.cocheConRuedasToRueda(rueda, cocheConRuedas);
	}
}
