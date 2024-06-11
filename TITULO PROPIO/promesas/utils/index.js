// CREAR UNA CLASE LLAMADA COCHE
// VALOR, MARCA, MODELO, CV, DISPONIBILIDAD, ACCESORIOS (NOMBRE, PRECIO)
// CREAR UN ARRAY DE COCHES (METER MANUALMENTE 5 COCHES)

// EN UN INPUT PONER UNA MARCA Y UN MODELO. AL PULSAR EN EL BOTON BUSCAR
// MOSTRAR TODOS LOS COCHES QUE CUMPLAN EL FILTO DE BUSQUEDA.
// ESTA BUSQUEDA SE REALIZA MEDIANTE UNA PROMESA

// EN LA PARTE SUPERIOR DE LA PAGINA APARECERA UN RELOJ DONDE SE MOSTRARA
// LA HORA:MINUTOS:SEGUNDO ACTUALES

new Date().setInterval(() => {
  console.log("Ejecucion recurrente");
}, 500);

// PROMESA -> RESPUESTA OK (RES) RESPUESTA FAIL (REJ)
let promesa = new Promise((res, rej) => {
  // La logica de la funcion promesa
  // pasados 5 segundos del lanzamiento de la promesa
  // si el numero generado es < 5 la promesa esta reject
  // 0 rechazo por no conexion
  // 1 rechazo por falta de datos
  // si el numero generado es >= 5 la promesa esta resolve

  setTimeout(() => {
    let numero = Math.random() * 11;
    if (numero < 5) {
      if (numero < 2) {
        rej(0);
      } else {
        rej(1);
      }
    } else {
      res(`Numero aleatorio generado de forma correcta ${numero}`);
    }
  }, 2000);
});

// OK -> then
// NO OK -> catch
promesa
  .then((result) => {
    console.log(result);
  })
  .catch((error) => {
    switch (error) {
      case 0:
        console.log("Falta de conexion");
        break;
      case 1:
        console.log("Falta de datos");
        break;
    }
  });
