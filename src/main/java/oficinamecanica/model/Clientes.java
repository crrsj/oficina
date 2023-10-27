package oficinamecanica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import oficinamecanica.support.AtualizarCliente;
import oficinamecanica.support.CadastroOficina;

@Entity(name = "clientes")
@Table(name = "Clientes")
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nome;
	private String telefone;
	private String endereco;
	private String marca;
	private String modeloVeiculo;
	private String placa;
	private int anoModelo;
	public Clientes(Long id, String nome, String telefone, String endereco, String marca, String modeloVeiculo,
			String placa, int anoModelo) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.marca = marca;
		this.modeloVeiculo = modeloVeiculo;
		this.placa = placa;
		this.anoModelo = anoModelo;
	}
	public Clientes() {
		
	}
	public Clientes(@Valid CadastroOficina oficina) {
		this.nome = oficina.nome();
		this.telefone = oficina.telefone();
		this.endereco = oficina.endereco();
		this.marca = oficina.marca();
		this.modeloVeiculo = oficina.modeloVeiculo();
		this.placa = oficina.placa();
		this.anoModelo = oficina.anoModelo();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public void update( AtualizarCliente oficina) {
		if(oficina.nome()!= null) {
			this.nome = oficina.nome();
			
		}
		if(oficina.endereco()!= null) {
			this.endereco =  oficina.endereco();
			
		}
		if(oficina.telefone() != null) {
			this.telefone = oficina.telefone();
			
		}
		if (oficina.marca()!= null) {
			this.marca = oficina.marca();
		}
		if(oficina.modeloVeiculo() != null) {
			this.modeloVeiculo =  oficina.modeloVeiculo();
		}
		if(oficina.placa() != null) {
			this.placa = oficina.placa();
		}
	}
	
	
	
	
	
}
