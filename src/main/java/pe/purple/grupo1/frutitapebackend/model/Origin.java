package pe.purple.grupo1.frutitapebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PROCEDENCIA_PRODUCTO")
@Entity
public class Origin {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PROCEDENCIA")
  private Integer id;

  @Column(name = "PAIS_PROCEDENCIA")
  private String country;

  @Column(name = "PROVINCIA_PROCEDENCIA")
  private String province;

  @Column(name = "ESTADO_PROCEDENCIA")
  private Boolean status;
}
