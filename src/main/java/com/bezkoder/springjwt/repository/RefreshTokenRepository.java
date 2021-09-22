package com.bezkoder.springjwt.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.bezkoder.springjwt.model.RefreshToken;
import com.bezkoder.springjwt.model.User;

@Repository
public interface RefreshTokenRepository extends MongoRepository<RefreshToken, Long> {
  @Override
  Optional<RefreshToken> findById(Long id);

  Optional<RefreshToken> findByToken(String token);
  
  int deleteByUser(User user);
}
