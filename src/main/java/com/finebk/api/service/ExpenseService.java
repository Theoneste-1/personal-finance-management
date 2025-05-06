package com.finebk.api.service;

import com.finebk.api.model.expense.Expense;
import com.finebk.api.payload.ExpenseRequest;
import com.finebk.api.payload.ExpenseResponse;
import com.finebk.api.payload.PagedResponse;
import com.finebk.api.security.UserPrincipal;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.Instant;
import java.util.List;

public interface ExpenseService {

    ExpenseResponse createExpense(ExpenseRequest expenseRequest, UserPrincipal currentUser);

    ExpenseResponse getExpenseById(Long id, UserPrincipal currentUser);

    ExpenseResponse updateExpense(Long id, ExpenseRequest expenseRequest, UserPrincipal currentUser);

    void deleteExpense(Long id, UserPrincipal currentUser);

    Page<ExpenseResponse> getAllExpenses(UserPrincipal currentUser, Pageable pageable);

    Page<ExpenseResponse> getExpensesByCategory(UserPrincipal currentUser, String category, Pageable pageable);

    Page<ExpenseResponse> getExpensesByDateRange(UserPrincipal currentUser, Instant startDate, Instant endDate, Pageable pageable);

    List<String> getUserCategories(UserPrincipal currentUser);
}
