// alert -> feednack informativo
// confirm -> feedback de confirmación
// prompt -> feedback de entrada de datos
/* let nombre = "Borja Martin";
let edad = 41; */
// alert(`Primera pagina dinamica de ${nombre}`);
/* let respuesta = confirm("Estas seguro de que quieres continuar?");

if (respuesta) {
  alert(`Bienvenido ${nombre} a la segunda parte del ejercicio `);
} else {
  alert("Has seleccionado que no quieres continuar");
} */

/* let nombrePrompt = prompt("Introduce tu nombre", "nombre random");
console.log(nombrePrompt); */

/* PEdir por prompt un nombre */
// una vez introducido, preguntar al usuario si quiere hacer opreaciones
// en caso de que si, preguntar por operando 1 y opreando 2
// mostrar por consola todos los resultados de las operaciones (+, - , * ,/)
// En caso de que no, mostrar un mensaje de despedida

let nombre = prompt("Introduce tu nombre");
if (nombre != null) {
  let continuar = confirm("Quieres continuar con las operaciones?");
  if (continuar) {
    let operando1 = Number(prompt("Introduce el primer operando"));
    let operando2 = Number(prompt("Introduce el segudno operando"));

    if (isNaN(operando1) || isNaN(operando2)) {
      alert("Por favor, introduce números válidos para los operandos.");
    } else {
      let suma = operando1 + operando2;
      let resta = operando1 - operando2;
      let multi = operando1 * operando2;
      let div = operando1 / operando2;
      console.log("Los resuladode las operaciones son:");
      console.log(`Suma: ${suma}`);
      console.log(`Resta: ${resta}`);
      console.log(`Multiplicación: ${multi}`);
      console.log(`División: ${div}`);
    }
  } else {
    alert(`Adios ${nombre}, hasta la proxima!`);
  }
} else {
  alert(`Adios hasta la proxima!`);
}
