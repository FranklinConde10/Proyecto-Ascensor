package proyecto.ponti.ProyectoAscensor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.ProyectoAscensor.api.model.Tramite;

public interface TramiteRepository extends JpaRepository<Tramite, Integer> {
}
