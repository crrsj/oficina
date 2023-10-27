package oficinamecanica.support;

import jakarta.validation.constraints.NotBlank;

public record CadastroOficina (
		@NotBlank
		String nome,
		@NotBlank
		String  telefone,
		String endereco,
		String marca, 
		String modeloVeiculo,
		@NotBlank
		String placa,
		int anoModelo ) {

}
