package com.udacity.restAPIBootstrap.repository;

import com.udacity.restAPIBootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog,Long> {

    @Query(value = "select d.breed " +
            " from dog d " +
            "where d.id = (:id)",nativeQuery = true )
    String findDogBreedByUid(Long id);

  /*  @Query("select d.id, d.breed from Dog d where d.id=:id")
    String findBreedById(Long id);*/
}
