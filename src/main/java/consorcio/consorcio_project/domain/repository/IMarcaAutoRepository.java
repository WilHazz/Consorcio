package consorcio.consorcio_project.domain.repository;

import consorcio.consorcio_project.domain.pojo.MarcaAutoPojo;

import java.util.List;
import java.util.Optional;

public interface IMarcaAutoRepository {

    /**
     * Devuelve una lista con todas las marcas de autos
     * @return lista con marcas de autos
     */
    List<MarcaAutoPojo> getAll();

    /**
     *Devuele con una marca de auto segun su id
     * @param id_marca id de marca auto
     * @return Optional de la marca Auto encontrado
     */
    Optional<MarcaAutoPojo> getMarcaAuto(Integer id_marca);

    /**
     * Guarda una nueva marca de auto 
     * @param newMarcaAuto marca auto para guarda
     * @return Marca auto guardada
     */
    MarcaAutoPojo save(MarcaAutoPojo newMarcaAuto);

    /**
     * Eliminar una marca de auto por id
     * @param idMarcaAuto id de marca auto a eliminar
     */
    void delete(Integer idMarcaAuto);
}
