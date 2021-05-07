package pe.purple.grupo1.frutitapebackend.service;

import io.reactivex.Flowable;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.Producer;

import java.util.List;

public interface FrutitaService {

  Flowable<Producer> findAllProducers();
  Flowable<CatalogProducer> findAllCatalogs();
  Flowable<CatalogProducer> findAllCatalogsbyProducerId(Integer productorId);
}
