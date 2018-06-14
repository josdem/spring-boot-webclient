package com.jos.dem.springboot.webclient.service;

public interface BeverageService {
  
  Mono<Beverage> getBeverage(Long id);
  
}