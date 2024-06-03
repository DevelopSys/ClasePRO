console.log("Codigo ejecutado desde el fichero js");

/* 
const -> constantes
let -> bloque
var -> genera (peligrosas)
*/

const PI = 3.141516; // number
let nombre = "Borja"; // string
let edad = 40; // number
let experiencia = true; // boolean
let altura = 1.74; // number
let valor = null; // null
let cosa; // undefined
// valorUnd -> undefined
let fecha = new Date(); // Date
// NaN

// console.log(typeof edad);

edad = "Cuarenta";

// Mi nombre es Borja, tengo 40 años mido 1.74 y tengo experiencia.
// La fecha de hoy es XX
// console.log("Mi nombre es "+nombre+ " ");
console.log(
  `Mi nombre es ${nombre}, tengo ${edad} y mido ${altura}. Hoy es ${fecha}`
);

// console.log(typeof edad);
