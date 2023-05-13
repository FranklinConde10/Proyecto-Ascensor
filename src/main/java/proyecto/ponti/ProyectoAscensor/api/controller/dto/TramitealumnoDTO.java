package proyecto.ponti.ProyectoAscensor.api.controller.dto;

import com.mysql.cj.util.StringUtils;
import lombok.Getter;
import lombok.Setter;
import proyecto.ponti.ProyectoAscensor.api.model.Tramitedocente;
import proyecto.ponti.ProyectoAscensor.api.model.Tramites;
import proyecto.ponti.ProyectoAscensor.api.model.Usuario;

@Getter
@Setter
public class TramitealumnoDTO {

 private Integer id;


 private String carrera;

 private String ciclo;

private String voucher;

private Usuario idusuario;

private Tramites idtramites;

}