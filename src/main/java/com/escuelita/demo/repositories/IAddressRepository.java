package com.escuelita.demo.repositories;

import com.escuelita.demo.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {
    @Query(value = "SELECT addresses.* from addresses " +
            "inner join clients on addresses.client_id = clients.id " +
            "where clients.id = :clientId", nativeQuery = true)
    List<Address> listAllAddressesByClientId(@Param("clientId") Long cliendId);
}
