package pe.purple.grupo1.frutitapebackend.service;

import io.reactivex.Flowable;
import io.reactivex.Single;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.ProducerResponse;

public interface FrutitaService {

  Single<ProducerResponse> findAllProducers();
  Flowable<CatalogProducer> findAllCatalogs();
  Flowable<CatalogProducer> findAllCatalogsbyProducerId(Integer productorId);
}
