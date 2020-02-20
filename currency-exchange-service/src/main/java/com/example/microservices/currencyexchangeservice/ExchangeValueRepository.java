package com.example.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * // TODO Comment
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long>{

  ExchangeValue findByFromAndTo(String from,String to);
}
