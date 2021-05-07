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
@Table(name = "PRESENTACION_PRODUCTO")
@Entity
public class ProductPresentation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRESENTACION_PRODUCTO")
  private Integer id;

  @Column(name = "NOMBRE_PRESENTACION_PRODUCTO")
  private String name;

  @Column(name = "ESTADO_PRESENTACION_PRODUCTO")
  private Boolean status;
}
