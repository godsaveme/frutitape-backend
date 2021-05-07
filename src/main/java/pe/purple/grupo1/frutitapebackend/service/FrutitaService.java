package pe.purple.grupo1.frutitapebackend.service;

import io.reactivex.Flowable;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.Producer;

public interface FrutitaService {

  Flowable<Producer> findAllProducers();
  Flowable<CatalogProducer> findAllCatalogs();
}
