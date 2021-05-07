package pe.purple.grupo1.frutitapebackend.controller;

import io.reactivex.Flowable;
import io.reactivex.Single;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.purple.grupo1.frutitapebackend.model.CatalogProducer;
import pe.purple.grupo1.frutitapebackend.model.Producer;
import pe.purple.grupo1.frutitapebackend.model.ProducerResponse;
import pe.purple.grupo1.frutitapebackend.service.FrutitaService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("v0/frutitape")
@RequiredArgsConstructor
public class FrutitaController {

  private final FrutitaService frutitaService;

  @GetMapping(value = "/producers", produces = {
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.APPLICATION_STREAM_JSON_VALUE,
    MediaType.APPLICATION_NDJSON_VALUE})
  public Single<ProducerResponse> getProducers() {
    return frutitaService.findAllProducers();
  }

  @GetMapping(value = "/catalogs", produces = {
    MediaType.APPLICATION_JSON_VALUE,
    MediaType.APPLICATION_STREAM_JSON_VALUE,
    MediaType.APPLICATION_NDJSON_VALUE})
  public Flowable<CatalogProducer> getCatalogProducers() {
    return frutitaService.findAllCatalogs();
  }
  @GetMapping(value = "/catalogs/{id}", produces = {
          MediaType.APPLICATION_JSON_VALUE,
          MediaType.APPLICATION_STREAM_JSON_VALUE,
          MediaType.APPLICATION_NDJSON_VALUE})
  public Flowable<CatalogProducer> getCatalogProducersbyProducerId(@PathVariable("id") Integer ProducerId) {
    return frutitaService.findAllCatalogsbyProducerId(ProducerId);
  }

}
