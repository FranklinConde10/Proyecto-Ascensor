package proyecto.ponti.ProyectoAscensor.api.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Enumerated(EnumType.STRING)
    private  String user;
    private String password;

    @ManyToOne
    @JoinColumn (name = "id_tipopersona")
    private Tipopersona tipopersona;

    }
