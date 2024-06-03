let nota = 5;
// if () else if () else
// ternario -> v / f
// condicion ? ejecucion verdadera : ejecucion falsa
/* nota >= 5 && nota < 11
  ? console.log("Esta aprobada")
  : console.log("esta suspensa"); */

// any[]
let nombres = ["Nombre 1", "Nombre 2", "Nombre 3", "Nombre 4"];
// array con numeros del 0 al 10
// y con foreach sacar la tabla de multiplicar de todos los numeros
/* for (let index = nombres.length - 1; index >= 0; index--) {
  console.log(nombres[index]);
} */

let numeros = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let numerosMultiplicacion = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let notas = [4, 3, 6, 8, 2, 1, 5, 7, 9, 2, 3, 7, 9];
let numeroSS = 0;
let numeroAP = 0;

numeroAP = notas.filter((item) => item >= 5).length;
numeroSS = nota.length - numeroAP;

/* notas.forEach((element) => {
  if (element >= 5) {
    numeroAP++;
  } else {
    numeroSS++;
  }
});

console.log(`El numero de aprobados es ${numeroAP}`);
console.log(`El numero de suspensos es ${numeroSS}`);
 */
/* numeros.forEach((numero) => {
  console.log("Tabla del " + numero);
  numerosMultiplicacion.forEach((numeroMultiplicar) => {
    console.log(
      `\t${numero} * ${numeroMultiplicar} = ${numero * numeroMultiplicar}`
    );
  });
}); */

/* nombres.forEach((item, index) => {
  if (index % 2 == 0) {
    console.log(`${index} - ${item}`);
  }
}); */
