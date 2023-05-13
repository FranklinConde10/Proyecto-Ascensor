package proyecto.ponti.ProyectoAscensor.api.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.ponti.ProyectoAscensor.api.model.Alumno;
import proyecto.ponti.ProyectoAscensor.api.model.Tramite;
import proyecto.ponti.ProyectoAscensor.api.repository.AlumnoRepository;

@RestController
@RequestMapping("api/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping
    Page<Alumno> index(@PageableDefault(sort = "id", size = 5) Pageable pageable) {
        return alumnoRepository.findAll(pageable);
    }
    @GetMapping("/{id}")
    Alumno obtener(@PathVariable Integer id) {
        return alumnoRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
