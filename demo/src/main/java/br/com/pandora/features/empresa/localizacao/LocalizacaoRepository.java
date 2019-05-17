package br.com.pandora.features.empresa.localizacao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "localizacoes", path = "localizacao")
@CrossOrigin(origins = "http://localhost:8080")
public interface LocalizacaoRepository extends CrudRepository<Localizacao, Long> {

}