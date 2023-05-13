package proyecto.ponti.ProyectoAscensor.api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name ="idusuario")
    private Integer idsuario;
 private String nombre;

 private String apellido;

 private String dni;
 private  String telefono;

 private String correo;

private String user;
private String pass;

private String rol;

 }


