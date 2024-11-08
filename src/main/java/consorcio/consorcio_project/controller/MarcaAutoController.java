package consorcio.consorcio_project.controller;

import consorcio.consorcio_project.domain.pojo.MarcaAutoPojo;
import consorcio.consorcio_project.domain.service.IMarcaAutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

/**
 * Controlador Rest de marca autos
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/marcas-autos")
public class MarcaAutoController {

    /**
     * Servicio marca Auto
     */
    private final IMarcaAutoService iMarcaAutoService;

    @GetMapping
    public ResponseEntity<List<MarcaAutoPojo>> getAll(){
        return ResponseEntity.ok(iMarcaAutoService.getAll());

       // return ResponseEntity.status(HttpStatus.OK).body(iMarcaAutoService.getAll()); Posible opcion para crear response entity

        //return new ResponseEntity<>(iMarcaAutoService.getAll(), HttpStatus.OK); Posible opcion para crear response entity

    }

    @GetMapping(path = "/{id_marca}")
    public ResponseEntity<MarcaAutoPojo> getMarcaAuto(@PathVariable Integer id_marca) {
        return ResponseEntity.of(iMarcaAutoService.getMarcaAuto(id_marca));
    }

    @GetMapping
    public ResponseEntity<MarcaAutoPojo> save(@RequestBody MarcaAutoPojo marcaAutoPojoNuevo){
        try{
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iMarcaAutoService.save(marcaAutoPojoNuevo));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
