package com.jos.dem.springboot.webclient.service.impl;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.jos.dem.springboot.webclient.model.Beverage;

@Service
public class BeverageService {

  private WebClient client = WebClient.create("http://jugoterapia.josdem.io/jugoterapia-server");
  
  public Mono<Beverage> getBeverage(Long id){
    client.get()
      .uri("/beverages/{id}", id).accept(MediaType.APPLICATION_JSON)
      .retrieve()
      .bodyToMono(Beverage.class);
  }
  
}