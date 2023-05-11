package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tramite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tramite")

    private Integer id;

    private String nombre;

    private String apellido;

    private String codigo;

    private String ocupacion;

    private String institcion;

    private String correoinstitucional;

    private String foto;

    @ManyToOne
    @JoinColumn (name = "id_alumno")
    private Alumno idalumno;

}
