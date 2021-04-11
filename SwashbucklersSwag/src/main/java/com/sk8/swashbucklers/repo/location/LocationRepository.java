package com.sk8.swashbucklers.repo.location;

import com.sk8.swashbucklers.model.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Represents the Repository for Location Model
 *
 * @author Nick Zimmerman
 * */

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
