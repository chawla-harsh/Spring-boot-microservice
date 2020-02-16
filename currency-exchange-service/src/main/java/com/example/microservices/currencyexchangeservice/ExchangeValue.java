package com.example.microservices.currencyexchangeservice;

import java.math.BigDecimal;

/**
 * // TODO Comment
 */
public class ExchangeValue {

  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionMultiple;
  private int port;

  public ExchangeValue() {
  }

  public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public int getPort() {
    return port;
  }

  public Long getId() {
    return id;
  }

  public String getFrom() {
    return from;
  }

  public String getTo() {
    return to;
  }

  public BigDecimal getConversionMultiple() {
    return conversionMultiple;
  }
}