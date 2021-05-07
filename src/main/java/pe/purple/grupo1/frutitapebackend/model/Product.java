package pe.purple.grupo1.frutitapebackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PRODUCTO")
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUCTO")
  private Integer id;

  @Column(name = "NOMBRE_PRODUCTO")
  private String name;

  @ManyToOne
  @JoinColumn(name = "ID_PROCEDENCIA")
  private Origin origin;

  @Column(name = "PRODUCTO_ORGANICO")
  private Boolean organic;

  @Column(name = "ESTADO_PRODUCTO")
  private Boolean status;
}
