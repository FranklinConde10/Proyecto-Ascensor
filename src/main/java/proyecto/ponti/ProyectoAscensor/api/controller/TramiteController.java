package proyecto.ponti.ProyectoAscensor.api.controller;


import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import proyecto.ponti.ProyectoAscensor.api.controller.dto.TramiteDTO;
import proyecto.ponti.ProyectoAscensor.api.model.Tramite;
import proyecto.ponti.ProyectoAscensor.api.repository.TramiteRepository;

@RestController
@RequestMapping("/api/aea/tramite")
public class TramiteController {

    private final TramiteRepository tramiteRepository;

    public TramiteController(TramiteRepository tramiteRepository) {
        this.tramiteRepository = tramiteRepository;
    }

    @GetMapping("")
    Page<Tramite> index(@PageableDefault(sort = "numtramite", size = 5) Pageable pageable) {
        return tramiteRepository.findAll(pageable);
    }

    @GetMapping("/{id}")
    Tramite obtener(@PathVariable Integer id) {
        return tramiteRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Tramite crear(@RequestBody @Validated TramiteDTO tramiteDTO) {
        Tramite tramite = new ModelMapper().map(tramiteDTO, Tramite.class);
        return tramiteRepository.save(tramite);
    }

    @PutMapping("/{id}")
    Tramite actualizar(@PathVariable Integer id, @RequestBody TramiteDTO tramiteDTO) {
        Tramite tramite = tramiteRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);

        new ModelMapper().map(tramiteDTO, tramite);
        return tramiteRepository.save(tramite);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id) {
        Tramite tramite = tramiteRepository
                .findById(id)
                .orElseThrow(EntityNotFoundException::new);
        tramiteRepository.delete(tramite);
    }
}

