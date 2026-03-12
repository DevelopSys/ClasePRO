import database.DBConnector;
import dto.AlumnoDTO;
import model.Alumno;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        AlumnoDTO alumnoDTO = new AlumnoDTO();
        boolean resultado = alumnoDTO
                .addUser(new Alumno("Jose","Garcia","jose@gmail.com",1234));
        System.out.println(resultado);

        /*
        Crear un programa que pida por consola el nombde, apellido, correo y telefono del usuario
        En caso de insercion correcta -> sout("dato insertado correctamente")
        En caso de error en duplicidad -> indica un mail diferente, y lo vuelve a intentars
         */
    }
}
