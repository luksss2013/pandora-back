package br.com.pandora.features.funcionario;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "funcionarios", path = "funcionario")
@CrossOrigin(origins = "http://localhost:8080")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long>{
	
}
