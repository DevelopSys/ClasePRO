package database;

public interface SchemaDB {

    // método por defecto
    // variables FINALES CONSTANTES
    // nombre de las tablas
    // nombre de las columnas
    // version bd
    String DB_NAME = "colegio";

    // CAMPOS TABLA USUARIO
    String DB_TAB_USER = "usuario";
    String COL_NAME_USER_TAB = "nombre";
    String COL_SUR_USER_TAB = "apellido";
    String COL_PHO_USER_TAB = "telefono";

    // CAMPOS TABLA LOGIN
    String DB_TAB_LOGIN = "login";
    String COL_EMAIL_LOG_TAB = "correo";
    String COL_PASS_LOG_TAB = "pass";
    String COL_LOG_LOG = "lastlog";

    // métodos sin cuerpo

}
