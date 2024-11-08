package consorcio.consorcio_project.persistance.repository;

import consorcio.consorcio_project.domain.pojo.MarcaAutoPojo;
import consorcio.consorcio_project.domain.repository.IMarcaAutoRepository;
import consorcio.consorcio_project.persistance.Mapper.IMarcaAutoMapper;
import consorcio.consorcio_project.persistance.entity.MarcaAutoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca auto
 */
@RequiredArgsConstructor // crea constructor con los atributos final
@Repository
public class MarcaAutoRepository implements IMarcaAutoRepository {

    /**
     * Crud de marca Auto
     */
    private final IMarcaAutoCrudRepository iMarcaAutoCrudRepository;
    /*
     * Mapper de marca auto
     */
    private  final IMarcaAutoMapper iMarcaAutoMapper;

    /**
     *  Devuelve una lista con todas las marcas de autos
     * @return Lista con maras de Autos
     */
    @Override
    public List<MarcaAutoPojo> getAll() {
        return iMarcaAutoMapper.toMarcasAutoPojo(iMarcaAutoCrudRepository.findAll());
    }

    @Override
    public Optional<MarcaAutoPojo> getMarcaAuto(Integer id_marca) {
        return iMarcaAutoCrudRepository.findById(id_marca)
                .map(iMarcaAutoMapper::toMarcaAutoPojo);

        //marcaAutoEntity -> iMarcaAutoMapper.toMarcaAutoPojo(marcaAutoEntity) LAMBDA
        // iMarcaAutoMapper::toMarcaAutoPojo Metodo por referencia
    }

    /**
     * Guarda una nueva marca Auto
     * @param newMarcaAuto marca auto para guarda
     * @return marca auto guardada
     */
    @Override
    public MarcaAutoPojo save(MarcaAutoPojo newMarcaAuto) {
        MarcaAutoEntity marcaAutoEntity = iMarcaAutoMapper.toMarcaAutoEntity(newMarcaAuto);
         return iMarcaAutoMapper.toMarcaAutoPojo(iMarcaAutoCrudRepository.save(marcaAutoEntity));
    }

    /**
     * Elimina una Marca por su Id
     * @param idMarcaAuto id de marca auto a eliminar
     */

    @Override
    public void delete(Integer idMarcaAuto) {
        iMarcaAutoCrudRepository.deleteById(idMarcaAuto);
    }

}
