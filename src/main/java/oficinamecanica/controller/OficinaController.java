package oficinamecanica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import oficinamecanica.model.Clientes;
import oficinamecanica.repository.oficinaRepository;
import oficinamecanica.support.AtualizarCliente;
import oficinamecanica.support.BuscarCliente;
import oficinamecanica.support.CadastroOficina;

@RestController
@RequestMapping("/oficina") 
public class OficinaController {
	@Autowired
	private oficinaRepository oficinaRepository;
    
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid CadastroOficina oficina) {
	oficinaRepository.save(new Clientes(oficina));	
		
		
	}
	@GetMapping	
	public List<BuscarCliente>listar(){		
	return	oficinaRepository.findAll().stream().map(BuscarCliente::new).toList();
	
	}
	
	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid  AtualizarCliente oficina) {
	var atualizacao = oficinaRepository.getReferenceById(oficina.id());
	atualizacao.update(oficina);
		
	}
	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
	 oficinaRepository.deleteById(id);
		
		
	}
}
