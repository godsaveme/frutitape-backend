package pe.purple.grupo1.frutitapebackend.controller;

import io.reactivex.Flowable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.purple.grupo1.frutitapebackend.model.Producer;
import pe.purple.grupo1.frutitapebackend.service.FrutitaService;

@Slf4j
@RestController
@RequestMapping("v0/frutitape")
@RequiredArgsConstructor
public class FrutitaController {

  private final FrutitaService frutitaService;

  @GetMapping(value = "/producers", produces = {
    MediaType.APPLICATION_STREAM_JSON_VALUE,
    MediaType.APPLICATION_NDJSON_VALUE})
  public Flowable<Producer> getProducers() {
    return frutitaService.findAll();
  }
}
