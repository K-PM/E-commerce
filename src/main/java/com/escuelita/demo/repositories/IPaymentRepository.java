package com.escuelita.demo.repositories;

import com.escuelita.demo.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {
    @Query(value = "SELECT  payments.* from payments " +
            "where client_id = :clientId", nativeQuery = true)
    List<Payment> listAllPaymentsByClientId(@Param("clientId") Long clientId);
}
