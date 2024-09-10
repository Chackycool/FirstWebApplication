package com.example.FirstWebApplication.services;

import com.example.FirstWebApplication.Entity.Users;
import com.example.FirstWebApplication.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    // Новий метод для пошуку за штрих-кодом
    public Optional<Users> findByBarcode(String barcode) {
        return usersRepository.findByBarcode(barcode);
    }
    public Optional<Users> findUserById(int id) {
        return usersRepository.findUsersByid(id);
    }

    public Optional<Users> findUserByEmail(String email) {
        return usersRepository.findByEmail(email);
    }

    public Optional<Users> findUserByFirstName(String firstName) {
        return usersRepository.findByFirstname(firstName);
    }

    public Optional<Users> findUserByEmailAndPassword(String email, String password) {
        return usersRepository.findByEmailAndPassword(email, password);
    }

    public Optional<Users> findUserByFirstnameAndPassword(String firstname, String password) {
        return usersRepository.findByFirstnameAndPassword(firstname, password);
    }


    public Users saveUser(Users user) {
        return usersRepository.save(user);
    }

    public void deleteUserById(int id) {
        usersRepository.deleteById(id);
    }
}
