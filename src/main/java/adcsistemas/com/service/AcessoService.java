package adcsistemas.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import adcsistemas.com.model.Acesso;
import adcsistemas.com.repository.AcessoRepository;

@Service
public class AcessoService {

	@Autowired
	private AcessoRepository acessoRepository;
	
	public Acesso save(Acesso acesso) {
		
		return acessoRepository.saveAndFlush(acesso);
	}
}
