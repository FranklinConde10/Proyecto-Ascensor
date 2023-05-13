package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tramitealumno")
public class Tramitealumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtramitealumno")
    private Integer idtramitealumno;
    private String carrera;

    private String ciclo;

private String voucher;

    @OneToMany
    @JoinColumn(name="idusuario")
    private Usuario idusuario;

@ManyToOne
    @JoinColumn(name = "idtramites")
    private Tramites idTramites;


}
