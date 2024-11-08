package consorcio.consorcio_project.domain.repository;

import consorcio.consorcio_project.domain.pojo.MarcaAutoPojo;
import consorcio.consorcio_project.domain.service.IMarcaAutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de Marca auto
 */
@RequiredArgsConstructor
@Service
public class MarcaAutoService implements IMarcaAutoService {
    /**
     * Repositorio Marca Autos
     */
    private final IMarcaAutoRepository iMarcaAutoRepository;

    /**
     * Devuelve una lista con todas las marcas de autos
     * @return lista con marcas de autos
     */
    @Override
    public List<MarcaAutoPojo> getAll() {
        return iMarcaAutoRepository.getAll();
    }
    /**
     *Devuele con una marca de auto segun su id
     * @param id_marca id de marca auto
     * @return Optional de la marca Auto encontrado
     */
    @Override
    public Optional<MarcaAutoPojo> getMarcaAuto(Integer id_marca) {
        return iMarcaAutoRepository.getMarcaAuto(id_marca);
    }
    /**
     * Guarda una nueva marca de auto
     * @param newMarcaAuto marca auto para guarda
     * @return Marca auto guardada
     */
    @Override
    public MarcaAutoPojo save(MarcaAutoPojo newMarcaAuto) {
        return iMarcaAutoRepository.save(newMarcaAuto);
    }
    /**
     * Eliminar una marca de auto por id
     * @param idMarcaAuto id de marca auto a eliminar
     * @return True si se elimino, false de lo contrario
     */

    @Override
    public boolean delete(Integer idMarcaAuto) {
        try{
            iMarcaAutoRepository.delete(idMarcaAuto);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
