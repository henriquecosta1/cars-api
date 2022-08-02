package com.api.cars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.cars.documents.LogCars;
import com.api.cars.repositories.LogsRepository;

@Service
public class ClienteServiceAux implements LogCarService {

	@Autowired
	private LogsRepository logsRepository;
	
	@Override
	public LogCars salvar(LogCars logCars) {
		return this.logsRepository.save(logCars);
	}

	@Override
	public List<LogCars> listarLogs() {
		return this.logsRepository.findAll();
	}

}
