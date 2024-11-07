package com.example.splitwisenov24.services;

import com.example.splitwisenov24.exceptions.UserNotFoundException;
import com.example.splitwisenov24.models.Expense;
import com.example.splitwisenov24.models.ExpenseUser;
import com.example.splitwisenov24.models.User;
import com.example.splitwisenov24.repositories.ExpenseUserRepository;
import com.example.splitwisenov24.repositories.UserRepository;
import com.example.splitwisenov24.strategy.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SettleUpService {
    private UserRepository userRepository;
    private ExpenseUserRepository expenseUserRepository;
    private SettleUpStrategy settleUpStrategy;

    public SettleUpService(UserRepository userRepository,
                           ExpenseUserRepository expenseUserRepository,
                           SettleUpStrategy settleUpStrategy) {
        this.userRepository = userRepository;
        this.expenseUserRepository = expenseUserRepository;
        this.settleUpStrategy = settleUpStrategy;
    }

    public List<Expense> settleUpUser(Long userId) throws UserNotFoundException {
        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("User with id : " + userId + " not found.");
        }

        User user = optionalUser.get();

        //Fetch all the expenses where this user was present.
        List<ExpenseUser> expenseUsers = expenseUserRepository.findByUser(user);

        Set<Expense> expensesToSettle = new HashSet<>();
        for (ExpenseUser expenseUser : expenseUsers) {
            expensesToSettle.add(expenseUser.getExpense());
        }

        //Convert set of expenses into list of expenses.
        List<Expense> transactions = settleUpStrategy.settleUp(expensesToSettle.stream().toList());

        //Instead of returning all the transactions, we should only return the transactions
        // where the current user is present.
        List<Expense> transactionToReturn = new ArrayList<>();
        for (Expense expense : transactions) {
            for (ExpenseUser expenseUser : expense.getExpenseUsers()) {
                if (expenseUser.getUser().equals(user)) {
                    transactionToReturn.add(expense);
                    break;
                }
            }
        }

        return transactionToReturn;
    }

    public List<Expense> settleUpGroup(Long groupId) {
        /*
        1. get the group with the given groupId.
        2. Get all the expenses for this groupId.
        3. Call the settleUpStrategy to settle Up all the expenses.
         */

        return null;
    }
}
