import database.DBConnector;
import dto.UsuarioDTO;
import model.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        // Connection connection = DBConnector.getConnection();
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        Usuario usuario = new Usuario(1, "Marcos", "Lopez", "marcos@gmail", "pass"
                , 0, 0);
        ;
        //usuarioDTO.listarUsuarios();
        //System.out.println("el numero de despidos es de "+usuarioDTO.borrarUsuario(55500));
        // usuarioDTO.insertarUsuarios(usuario);
        /*Scanner scanner = new Scanner(System.in);
        boolean fallo = false;
        do {
            try {
                usuarioDTO.insertarUsuariosPS(usuario);
                fallo = false;
            } catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("Por favor introduce un correo diferente");
                String correo = scanner.next();
                usuario.setCorreo(correo);
                fallo = true;
            } catch (SQLException e){
                System.out.println("Error en la query");
            }
        } while (fallo);*/
        int idLogin = usuarioDTO.realizarLogin("borja@gmail.com", "123123");
        if (idLogin!=-1) {
            System.out.println("entrando a la app en modo "+idLogin);
        } else {
            System.out.println("error en el login");
        }

        // hacer un sistema que permite el login de los usuarios. Para ello
        // el sistema pedirá el correo y pass del usuario que quiere acceder
        // al sistema. En caso de hacer un login correcto,
        // aparecera el mensaje de bienvenido a la app
        // en caso de no hacer login, aparecerá el mensaje de
        // fallo de seguridad

    }
}
