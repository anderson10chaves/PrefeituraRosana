package adcsistemas.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import adcsistemas.com.model.Acesso;
import adcsistemas.com.repository.AcessoRepository;
import adcsistemas.com.service.AcessoService;

@RestController
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso) {
		
		if (acesso.getId() == null) {
			List<Acesso> acessos = acessoRepository.pesquisaAcessoDesc(acesso.getDescricao().toUpperCase());
			
			if (!acessos.isEmpty()) {
				
			}
		}
		return null;
	}

}
