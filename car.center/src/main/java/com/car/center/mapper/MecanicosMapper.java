package com.car.center.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.car.center.dto.MecanicosDTO;
import com.car.center.request.MecanicosRequest;

@Mapper(componentModel = "String", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MecanicosMapper {

	MecanicosDTO mecanicosRequestToMecanicosDTO(MecanicosRequest mecanicosRequest);
}
