package proyecto.ponti.ProyectoAscensor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.ProyectoAscensor.api.model.Tramites;

import java.util.Optional;

public interface TramitesRepository extends JpaRepository<Tramites,Integer> {



    Optional<Tramites> findOneById(Integer id);


        Optional<Tramites> findOneByIdAndNumtramite(Integer id,String numtramite);

}
