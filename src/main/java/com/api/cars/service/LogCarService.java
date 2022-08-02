package com.api.cars.service;

import java.util.List;

import com.api.cars.documents.LogCars;

public interface LogCarService {

	LogCars salvar(LogCars logCars);
	
	List<LogCars> listarLogs();

}
