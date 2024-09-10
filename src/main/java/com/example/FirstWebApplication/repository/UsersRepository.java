package com.example.FirstWebApplication.repository;

import com.example.FirstWebApplication.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

    // Метод для пошуку користувача за email
    Optional<Users> findByEmail(String email);
    Optional<Users> findByBarcode(String barcode);
    Optional<Users> findByFirstname(String firstName);
    Optional<Users> findByEmailAndPassword(String email, String password);
    Optional<Users> findByFirstnameAndPassword(String firstname, String password);
    Optional<Users> findUsersByid(int id);
}
