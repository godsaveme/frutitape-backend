package pe.purple.grupo1.frutitapebackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("productor")
@NoArgsConstructor
@AllArgsConstructor
public class Producer {

  @Id
  @Column("ID_PRODUCTOR")
  private Integer id;

  @Column("NOMBRE_PRODUCTOR")
  private String name;

  @Column("APELLIDO_PRODUCTOR")
  private String surname;

  @Column("DOCUMENTO_PRODUCTOR")
  private String documentNumber;

  @Column("ID_TIPO_DOCUMENTO")
  private String documentType;
}
