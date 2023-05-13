package proyecto.ponti.ProyectoAscensor.api.controller.dto;

import lombok.Getter;
import lombok.Setter;
import proyecto.ponti.ProyectoAscensor.api.model.Tipopersona;

@Getter
@Setter
public class AlumnoDTO {
    private String carrera;

    private String ciclo;

    private String vouchert;

    private Tipopersona tipopersona_id_tipopersona;
}
