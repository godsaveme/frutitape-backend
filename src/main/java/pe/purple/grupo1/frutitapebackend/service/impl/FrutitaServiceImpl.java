package pe.purple.grupo1.frutitapebackend.service.impl;

import io.reactivex.Flowable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.purple.grupo1.frutitapebackend.model.Producer;
import pe.purple.grupo1.frutitapebackend.repository.ProducerRepository;
import pe.purple.grupo1.frutitapebackend.service.FrutitaService;

@Service
@RequiredArgsConstructor
public class FrutitaServiceImpl implements FrutitaService {

  private final ProducerRepository producerRepository;

  @Override
  public Flowable<Producer> findAll() {
    return Flowable.fromIterable(producerRepository.findAll());
  }
}
