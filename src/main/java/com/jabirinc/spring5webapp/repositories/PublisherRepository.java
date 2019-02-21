package com.jabirinc.spring5webapp.repositories;

import com.jabirinc.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Getinet on 2019-02-20
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
