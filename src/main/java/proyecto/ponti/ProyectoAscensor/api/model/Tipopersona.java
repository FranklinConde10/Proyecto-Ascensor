package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tipopersona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtipopersona")
    private Integer id;

    @Enumerated(EnumType.STRING)

    private Rol rol;

    public enum Rol{
        ALUMNO,

        DOCENTE
    }

}
