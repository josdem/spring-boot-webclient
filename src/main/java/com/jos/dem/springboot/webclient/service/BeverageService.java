package com.jos.dem.springboot.webclient.service;

import reactor.core.publisher.Mono;
import com.jos.dem.springboot.webclient.model.Beverage;

public interface BeverageService {

  Mono<Beverage> getBeverage(Long id);

}
