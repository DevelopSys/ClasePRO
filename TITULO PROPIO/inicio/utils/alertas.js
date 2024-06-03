/* alerta -> muestra informacion -> no retorna nada*/
// let nombreAlerta = "Borja";
// alert(`Hola ${nombreAlerta}, esto es una alerta`);

/* confirm -> si / no -> boolean*/
/* let respuestaConfirm = confirm("Quieres aceptar los terminos de uso");
console.log(respuestaConfirm); */

/* prompt -> introduzco datos -> string */
// let respuestaPrompt = prompt("Introduce tu nombre");
// console.log(typeof respuestaPrompt);

// let respuestaNumero = Number(respuestaPrompt);
// let respuestaNumero2 =parseInt(respuestaPrompt);

let nombreCalculadora = prompt("Introduce tu nombre");
let primerOperando = Number(prompt("Introduce primer operando"));
let segundoOperando = Number(prompt("Introduce segundo operando"));
let confrmacion = confirm("Estas seguro que quieres operar");
if (confrmacion) {
  if (!isNaN(primerOperando) && !isNaN(segundoOperando)) {
    //if (typeof primerOperando == Number && typeof segundoOperando == Number) {
    alert(`${nombreCalculadora}, las operaciones son:\n
${primerOperando} * ${segundoOperando} = ${primerOperando * segundoOperando}
${primerOperando} / ${segundoOperando} = ${primerOperando / segundoOperando}
${primerOperando} + ${segundoOperando} = ${primerOperando + segundoOperando}
${primerOperando} - ${segundoOperando} = ${primerOperando - segundoOperando}
`);
  } else {
    alert("Datos incorrectos");
  }
} else {
  alert("No hay confirmacion");
}
