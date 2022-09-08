package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
