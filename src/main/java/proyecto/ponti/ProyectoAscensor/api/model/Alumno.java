package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_alumno")
    private  Integer id;

    private String carrera;

    private  String ciclo;

    private String voucher;

    @ManyToOne
    @JoinColumn(name="id_tipopersona")
    private Tipopersona idtipopersona;



}
