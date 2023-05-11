package proyecto.ponti.ProyectoAscensor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.ProyectoAscensor.api.model.Tramite;

import java.util.Optional;

public interface TramiteRepository extends JpaRepository<Tramite, Integer> {
    //obtener tramite por ID


    @Override
    Optional<Tramite> findById(Integer integer);
    Optional<Tramite> findOneByIdAndNumtramite(Integer id, String numTramite);
}
