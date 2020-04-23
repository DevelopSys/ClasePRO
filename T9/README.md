- [Acceso a datos:](#tema8)
    - Interfaces de programación de acceso a bases de datos.
    - Establecimiento de conexiones.
    - Recuperación de información.
    - Manipulación de la información.
    - Ejecución de consultas sobre la base de datos. Mantenimiento de la persistencia de los objetos:
    - Mecanismos de consulta.
    - Recuperación, modificación y borrado de información.


### Interfaces de programación de acceso a bases de datos. 
****

En la mayoría de aplicaciones la necesidad de poder acceder a datos externos es básica. No importa cual sea el motor de base de datos con el que se quiera trabajar, ya que existen librerías para manejar cualquier tipo de base de datos, tanto relacionarles como no relacionales. Para el manejo interno de las bases de datos SQL, java incorpora la librería JDBC, incorporadas en los paquetes java.sql y java.sql. Antes de comenzar con el trabajo de base de datos, es necesario descargar el Driver correspondiente con el motor que se va a utilizar. Os dejo el link de los dos que utilizaremos en clase:

- https://dev.mysql.com/downloads/connector/j/ para motor de base de datos MySQL
- https://downloads.mariadb.org/connector-java/ para motor de base de datos MariaDB

Una vez descargado el conector el siguiente paso es incorporarlo al proyecto como librería externa, exactamente igual que hicimos con las librerías de Apache POI (File --> Proyect Structure --> Libraries --> +). A partir de este momento las librerías del conector que se va a utilizar está disponible para mi proyecto. 

Estas librerías permiten cargar el Driver de conexión en memoria para así poder comunicar con la base de datos. Ahora se verá en códigos, pero cada motor tiene una forma de cargar los drives. Los principales son los siguientes

````
// MariaDB
Class.forName("org.mariadb.jdbc.Driver");
// MySQL
Class.forName("com.mysql.cj.jdbc.Driver");

````

Del mismo modo para iniciar la conexión dependiendo de cual es el motor de base de datos se utiliza una sintaxis u otra:

````
// MySQL
Connection conexion = DriverManager.getConnection(
   "jdbc:mysql://servidor:3306/database",
   "usuario",
   "password"); 
// Oracle 
Connection conexion = DriverManager.getConnection(
   "jdbc:oracle:thin:@servidor:1521:database",
   "usuario",
   "password");  
// MariaDB
Connection conexion = DriverManager.getConnection(
   "jdbc:mariadb://servidor:5432/database",
   "usuario",
   "password");
````


### Establecimiento de conexiones

Con todas las librerías preparadas, simplemente queda la creación de la base de datos en el motor a utilizar con los usuarios y privilegios que se quiera. En este ejemplo se utilizarán las siguientes características

- Motor BD: MariaDB
- Host de connexion: 192.168.64.2
- Usuario BD: programacion
- Pass usuario: cesjpsegundo
- Servidor SQL con XAMPP (https://www.apachefriends.org/es/index.html)
