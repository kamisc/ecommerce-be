package com.sewerynkamil.ecommerce.dao;

import com.sewerynkamil.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("${allowed.page}")
@RepositoryRestResource(collectionResourceRel = "states", path = "states")
public interface StateRepository extends JpaRepository<State, Long> {
    List<State> findByCountryCode(@Param("code") final String code);
}
