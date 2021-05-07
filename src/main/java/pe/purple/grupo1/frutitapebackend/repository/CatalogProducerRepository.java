package pe.purple.grupo1.frutitapebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.Producer;

@Repository
public interface CatalogProducerRepository extends JpaRepository<CatalogProducer, Integer> {

}
