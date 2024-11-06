package br.com.rafaelsousapereira.springsecurityjwt.repository;

import br.com.rafaelsousapereira.springsecurityjwt.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByUsername(String username);
}
