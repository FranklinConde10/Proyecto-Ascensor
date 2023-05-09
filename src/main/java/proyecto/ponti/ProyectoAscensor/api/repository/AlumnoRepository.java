package proyecto.ponti.ProyectoAscensor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ponti.ProyectoAscensor.api.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno,Integer> {
}
