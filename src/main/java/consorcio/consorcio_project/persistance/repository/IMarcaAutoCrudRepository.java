package consorcio.consorcio_project.persistance.repository;

import consorcio.consorcio_project.persistance.entity.MarcaAutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMarcaAutoCrudRepository  extends JpaRepository<MarcaAutoEntity,Integer> {

}
