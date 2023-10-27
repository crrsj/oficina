package oficinamecanica.support;

import jakarta.validation.constraints.NotBlank;
import oficinamecanica.model.Clientes;

public record BuscarCliente (
		Long id,
		@NotBlank
		String nome,
		@NotBlank
		String  telefone,		
		String marca, 		
		@NotBlank
		String placa ) {
	
	public BuscarCliente(Clientes clientes) {
		this(clientes.getId(),clientes.getNome(),clientes.getTelefone(),clientes.getMarca(),clientes.getPlaca());
	}
	

}


