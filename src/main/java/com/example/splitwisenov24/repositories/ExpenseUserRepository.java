package com.example.splitwisenov24.repositories;

import com.example.splitwisenov24.models.ExpenseUser;
import com.example.splitwisenov24.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {

    List<ExpenseUser> findByUser(User user);
}
