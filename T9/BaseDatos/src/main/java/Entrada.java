import database.DBConnector;
import dto.UsuarioDTO;
import model.Usuario;

import java.sql.Connection;

public class Entrada {
    public static void main(String[] args) {
        // Connection connection = DBConnector.getConnection();
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        Usuario usuario = new Usuario(1,"Juan","Martin","correo1@gmail","pass"
                ,0,0);
        usuarioDTO.insertarUsuarios(usuario);

    }
}
