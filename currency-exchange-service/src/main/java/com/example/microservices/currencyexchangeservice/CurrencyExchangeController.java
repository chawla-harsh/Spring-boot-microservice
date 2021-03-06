package com.example.microservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * // TODO Comment
 */

@RestController
public class CurrencyExchangeController {

  @Autowired
  private Environment environment;


  @Autowired
  private ExchangeValueRepository exchangeValueRepository;

  
  @GetMapping("currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue(@PathVariable("to") String to, @PathVariable("from") String from)
  {

        ExchangeValue exchangeValue=exchangeValueRepository.findByFromAndTo(from,to);
        //ExchangeValue exchangeValue=new ExchangeValue(1000L,from,to, BigDecimal.valueOf(65));
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
  }

  
}
