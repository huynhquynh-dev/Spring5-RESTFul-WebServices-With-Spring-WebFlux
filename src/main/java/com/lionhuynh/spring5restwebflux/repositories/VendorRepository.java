package com.lionhuynh.spring5restwebflux.repositories;

import com.lionhuynh.spring5restwebflux.model.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
