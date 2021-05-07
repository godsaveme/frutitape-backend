package pe.purple.grupo1.frutitapebackend.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Catalogo_productor")
@Entity
public class CatalogProducer {

  @Id
  @Column(name = "ID_CATALOGO")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "ID_PRODUCTOR")
  private Producer producer;

  @ManyToOne
  @JoinColumn(name = "ID_PRODUCTO")
  private Product product;

  @Column(name = "PRECIO")
  private Double price;

  @Column(name = "STOCK_CATALOGO")
  private Double stock;

  @ManyToOne
  @JoinColumn(name = "ID_PRESENTACION_PRODUCTO")
  private ProductPresentation productPresentation;

  @Column(name = "CANTIDAD_UNIDADES")
  private Integer quantityUnit;

  @Column(name = "CANTIDAD_KILOS")
  private Double quantityKilos;

  @Column(name = "FECHA_ARRIBO")
  private LocalDate arrivalDate;

  @Column(name = "IMG_URL")
  private String imgUrl;

  @Column(name = "ESTADO_CATALOGO_PRODUCTOR")
  private Boolean status;
}
