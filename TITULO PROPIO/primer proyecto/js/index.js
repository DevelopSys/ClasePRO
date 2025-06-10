/*  */
// clase, metodo (funciones), clases y funciones, variables
const DNI = "123123123A";
var nombre = "Borja";
nombre = "Borja Martin";
let edad = 41;

console.log(`Me llamo ${nombre} y tengo ${edad} años y mi DNI es ${DNI}`);

if (true) {
  let edad = 20;
  console.log("Mi edad es " + edad);
}
console.log("Mi edad es " + edad);

/* console.log(
  "Hola me llamo " + nombre + " tengo " + edad + " años y mi DNI es " + DNI
); */
// console.log(`Hola me llamo ${nombre} tengo ${edad} años y mi DNI es ${DNI}`);

// number (tanto con coma como sin ella), string, boolean, object, null, undefined

let numero = 1;
let numerosDecimal = 3.14;
let acierto = false;
let nombreCompleto = "Borja Martin";
let persona = { nombre: "Borja", edad: 41, dni: "123123123A" };
let nulo = null;
let indefinido = undefined;
// isNaN (is Not a Number) -> sirve para saber si un valor es un numero o no
console.log(typeof numero); // number
console.log(numero);
console.log(typeof numerosDecimal); // number
console.log(numerosDecimal);
console.log(typeof acierto); // boolean
console.log(acierto);
console.log(typeof nombreCompleto); // string
console.log(nombreCompleto);
console.log(typeof persona); // object
console.log(persona);
console.log(typeof nulo); // object (es un bug de javascript)
console.log(nulo);
console.log(typeof indefinido); // undefined
console.log(indefinido);
