package pe.purple.grupo1.frutitapebackend.repository;

import io.reactivex.Flowable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.Producer;

import java.util.List;

@Repository
public interface CatalogProducerRepository extends JpaRepository<CatalogProducer, Integer> {

    @Query(value = "SELECT cp.* FROM CATALOGO_PRODUCTOR as cp WHERE cp.ID_PRODUCTOR = ?1", nativeQuery = true)
    List<CatalogProducer> ListCatalogProducerbyProducerId(Integer productorId);



  /*
    public List<CatalogProducer> findAllCatalogsbyProductorId(Integer productorId){
        List<CatalogProducer> ListCatalogProducer =

    }
*/
}
