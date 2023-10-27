package oficinamecanica.support;


import jakarta.validation.constraints.NotNull;

public record AtualizarCliente  (
		@NotNull
		Long id,		
		String nome,		
		String  telefone,
		String endereco,
		String marca, 
		String modeloVeiculo,		
		String placa,
		int anoModelo ) {

}