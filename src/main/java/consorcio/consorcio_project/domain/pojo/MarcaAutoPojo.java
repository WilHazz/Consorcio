package consorcio.consorcio_project.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Pojo de Marca Auto no usar el @Data en su lugar usaremos lo getter and Setter de lombok
 */
@Getter
@Setter
public class MarcaAutoPojo {
    /**
     * Id de la marca
     */
    private Integer id_marca;

    /**
     * Descripcion de la marca
     */
    private String description;
}
