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
@Table(name = "Productor")
@Entity
public class Producer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_PRODUCTOR")
  private Integer id;

  @Column(name = "NOMBRE_PRODUCTOR")
  private String name;

  @Column(name = "APELLIDO_PRODUCTOR")
  private String surname;

  @Column(name = "DOCUMENTO_PRODUCTOR")
  private String documentNumber;

  @Column(name = "ID_TIPO_DOCUMENTO")
  private Integer documentType;

  @Column(name = "ESTADO_PRODUCTOR")
  private Integer status;
}
