package com.example.microservices.limitsservice;

import com.example.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * // TODO Comment
 */
@RestController
public class LimitConfigurationController {

  @Autowired
  private Configuration configuration ;

  @GetMapping("/limits")
  public LimitConfiguration retrievLimitsFromConfigurations()  {
    return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
  }
}
