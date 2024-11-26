package es.santander.ascender.proyecto9.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.santander.ascender.proyecto9.Solicitud;

@RestController
@RequestMapping ("/solicitud")
public class SolicitudController {
    @PostMapping
    public long crear(@RequestBody Solicitud solicitud) throws Exception {
        if (solicitud.getId()!= 0){
            throw new Exception("Al crear no me puedes pasar el ID");
        }
        return 16;
        
    }
    @GetMapping ("/{id}")
    public Solicitud leer(@PathVariable long id) {
        Solicitud respuesta = new Solicitud();

        respuesta.setId(id);
        respuesta.setNombre("Jose");
        respuesta.setEdad(44);
        return respuesta;
    }
    @GetMapping
    public List<Solicitud> listar() {
        List <Solicitud>lista = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            Solicitud respuesta = new Solicitud();
            respuesta.setId(i);
            respuesta.setEdad(33+i);
            respuesta.setNombre("Jose "+i);
            lista.add(respuesta);
            
        }
        return lista;
    }
    @PutMapping
    public void modificar (@RequestBody Solicitud solicitud) throws Exception {
        if (solicitud.getId()== 0){
            throw new Exception("Al modificar me tienes que pasar un ID existente");
        }
        
    }
    @DeleteMapping ("/{id}")
    public void borrar (@PathVariable long id){
        
    }

}
