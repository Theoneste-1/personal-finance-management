package com.finebk.api.repository;

import com.finebk.api.model.account.Account;
import com.finebk.api.model.account.Balance;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
    void deleteByAccount(Account account);

     Optional<Balance> findLatestBalanceByAccount(Account account);

    Optional<Object> findFirstByAccountOrderByCreatedAtAsc(Account account);

    Page<Balance> findByAccount(Account account, Pageable pageable);

    Optional<Balance> findByTransactionIdAndCreatedBy(Long transactionId, Long id);

    Optional<Balance> findByGoalIdAndCreatedBy(Long goalId, Long id);

    @Query("SELECT SUM(b.amount) FROM Balance b WHERE b.account.user.id = :userId")
    Optional<Double> findTotalBalanceByUser(@Param("userId") Long userId);

}
