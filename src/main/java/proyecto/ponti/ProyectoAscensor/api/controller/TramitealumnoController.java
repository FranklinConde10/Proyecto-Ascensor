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
import proyecto.ponti.ProyectoAscensor.api.model.Tramitealumno;
import proyecto.ponti.ProyectoAscensor.api.repository.TramitealumnoRepository;

@RestController
@RequestMapping("api/alumnos")
public class TramitealumnoController {
    @Autowired
    private TramitealumnoRepository tramitealumnoRepository;

    @GetMapping
    Page<Tramitealumno> index(@PageableDefault(sort = "id", size = 5) Pageable pageable) {
        return tramitealumnoRepository.findAll(pageable);
    }
    @GetMapping("/{id}")
    Tramitealumno obtener(@PathVariable Integer id) {
        return tramitealumnoRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}