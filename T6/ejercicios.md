# Ejercicio 
1. (ListaMultimedia) 

Desarrollar una aplicación para la gestión de una colección multimedia. Todo elemento multimedia tiene 4 características; identificador, titulo, autor, tamaño, formato. Adicionalmente cada uno de los elementos tendrán:
a. Imagen (ISBN, número de páginas)
b. Video (director, actores)
c. Audio (duración, formato)
La aplicación deberá poder manejar cualquier tipo de objeto, dando la posibilidad de:
1. Añadir a la colección (preguntara que tipo de objeto y los elementos correspondientes)
a. Los datos serán pedidos por consola
b. Una vez añadido el programa mostrará una confirmación de que el elemento
está bien añadido
2. Eliminar de la colección
a. Se pedirá el identificador del elemento a eliminar
b. Una vez eliminado el programa mostrará una confirmación de que el elemento
está bien eliminado
3. Listar elementos
a. Imagen
b. Video
c. Audio
d. Todos
4. Salir

Los listados mostrarán información completa de los elementos en cuestión.
La restricción que se pone a la colección es que no se pueden añadir elementos con el mismo id. Crea tres clases: Entrada (donde se sitúa el main), Elemento (la base del objeto que será abstracta), Video (la cual extenderá de Elemento), Audio (la cual extenderá de Elemento) e Imagen (la cual extenderá de Elemento) y Colección (donde se sitúa la lista y los métodos). Cada una de las clases tendrá los métodos y atributos que consideres necesarios
