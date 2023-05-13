package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="alumno")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_alumno")
    private  Integer id;

    private String carrera;

    private  String ciclo;

    private String voucher;

    @ManyToOne
    @JoinColumn(name="tipopersona_id_tipopersona")
    private Tipopersona tipopersona_id_tipopersona;



}
