package com.subham.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.subham.entity.OrderDetails;


@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String>{

}
