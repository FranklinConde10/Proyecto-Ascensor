package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Tramitealumno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtramitealumno")
    private Integer id;
    private String carrera;

    private String ciclo;

private String voucher;



@ManyToOne
    @JoinColumn(name = "idtramites")
    private Tramites idTramites;

    @OneToOne
    @JoinColumn(name="idusuario")
    private Usuario idusuario;

}
