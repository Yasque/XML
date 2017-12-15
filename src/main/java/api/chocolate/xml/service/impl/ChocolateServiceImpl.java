package api.chocolate.xml.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import api.chocolate.xml.domain.Chocolate;
import api.chocolate.xml.domain.repository.ChocolateRepository;
import api.chocolate.xml.service.ChocolateService;

@Service
public class ChocolateServiceImpl implements ChocolateService{
 @Autowired
 ChocolateRepository gomitaRepository;
	
	
	@Override
	public List<Chocolate> obtenerTodas() {
		return Lists.newArrayList(gomitaRepository.findAll());
	}


	@Override
	public void insertarChocolate(Chocolate gomita) {
		gomitaRepository.save(gomita);
	}

}
