package com.car.center.repository;

import com.car.center.request.MecanicosRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.car.center.dto.MecanicosDTO;

@Repository
public interface MecanicosRepository extends CrudRepository<MecanicosRequest, Long> {

}
