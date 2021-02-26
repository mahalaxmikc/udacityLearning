package com.udacity.restAPIBootstrap.repository;

import com.udacity.restAPIBootstrap.entity.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location,Integer> {

    @Query(value = "select l.address " +
            " from location l " +
            "where l.id = (:id)",nativeQuery = true )
    String findLocationByUid(Integer id);


}
