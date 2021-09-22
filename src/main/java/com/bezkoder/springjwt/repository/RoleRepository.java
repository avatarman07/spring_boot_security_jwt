package com.bezkoder.springjwt.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.bezkoder.springjwt.model.ERole;
import com.bezkoder.springjwt.model.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
