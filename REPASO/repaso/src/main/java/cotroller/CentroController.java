package cotroller;

import dto.AlumnoDto;
import model.Alumno;

public class CentroController {
    private AlumnoDto alumnoDto;

    public CentroController(){
        alumnoDto = new AlumnoDto();
    }

    public void insertarUsuario(Alumno alumno){
        // logia de la aplicacion
        // el usuario tiene un correo que no es de gmail?
            // no se puede insertar
        // el correo ya esta dado de alta en la base de datos?
            // no se puede insertar
        // la pass cumple con los requisitros de comple?
            // no se puede insertar
        // lo insertas
        alumnoDto.insertarUsuario(alumno);
    }
}
