package controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Contacto;

import java.util.HashMap;

@Data
public class AgendaController {
    private HashMap<String, Contacto> listaContactos;
    public AgendaController(){
        listaContactos = new HashMap<>();
    }

    // metodos logicos que quiero ejecutar
    // añadir
    // buscar
    // borrar
    // listar


}
