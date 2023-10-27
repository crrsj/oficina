package oficinamecanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import oficinamecanica.model.Clientes;

public interface oficinaRepository extends JpaRepository<Clientes, Long>{

}
