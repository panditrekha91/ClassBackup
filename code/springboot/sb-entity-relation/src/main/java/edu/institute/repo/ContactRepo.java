package edu.institute.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {
}
