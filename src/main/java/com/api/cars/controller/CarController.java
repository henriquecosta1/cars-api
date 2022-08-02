package com.api.cars.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.api.cars.documents.LogCars;
import com.api.cars.dto.CarDTO;
import com.api.cars.model.Car;
import com.api.cars.service.LogCarService;

@RestController
@RequestMapping("/api")
public class CarController {
	
	@Autowired
	private LogCarService logCarService;
	
	@GetMapping(value = "/listCars")
	public List<Object> getCars() {
		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate restTemplate = new RestTemplate();
		Object cars = restTemplate.getForObject(url, Object.class);
		return Arrays.asList(cars);
	}
	
	@PostMapping(value = "/createCar")
	public Object createCar(@RequestBody Car car, LogCars logCars) {
		String url = "http://api-test.bhut.com.br:3000/api/cars";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Object> entity = new HttpEntity<Object>(car, headers);
		ResponseEntity<CarDTO> responseEntity = restTemplate.postForEntity(url, entity, CarDTO.class);
				
		logCars.setDataHora(LocalDateTime.now());
		logCars.setCarId(responseEntity.getBody().get_id());
		this.logCarService.salvar(logCars);
		
		return responseEntity.getBody();
	}
	
	@GetMapping(value = "/logs")
	public ResponseEntity<List<LogCars>> getLogs() {
		return ResponseEntity.ok(this.logCarService.listarLogs());
	}
}
