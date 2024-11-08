package consorcio.consorcio_project.persistance.Mapper;

import consorcio.consorcio_project.domain.pojo.MarcaAutoPojo;
import consorcio.consorcio_project.persistance.entity.MarcaAutoEntity;
import jakarta.persistence.MappedSuperclass;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper transforma objetos de marcaAuto a Pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaAutoMapper {

    /**
     * Convierte  una entidad a un pojo de marca auto
     * @param marcaEntity entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id_marca", target = "id_marca")
    @Mapping(source = "description", target = "description")
    MarcaAutoPojo toMarcaAutoPojo(MarcaAutoEntity marcaEntity);

    @InheritInverseConfiguration
    MarcaAutoEntity toMarcaAutoEntity(MarcaAutoPojo marcaPojo);

    /**
     * Retorna una lista marca autos transformada a pojo de una lista de entidades
     * @param marcasAutoEnityt entidad a transformar
     * @return Lista transformada
     */

    List<MarcaAutoPojo> toMarcasAutoPojo(List<MarcaAutoEntity> marcasAutoEnityt);
}
