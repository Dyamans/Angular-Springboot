/**
 * 
 */
package com.pateelu.dev.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author dgpats
 *
 */
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface BikeRepository extends JpaRepository<Bike, Long>{
	
}
