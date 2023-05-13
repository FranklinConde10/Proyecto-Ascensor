package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;

@Data
@Entity
public class Tramites {
@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idtramites")
private Integer id;


private String numtramite;

private String categoriatramite;


private String tipoinstitucion;

}
