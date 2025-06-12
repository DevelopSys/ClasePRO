// array -> no dinamico
// arraylist -> dinamico

let numeros = [4123, 35468, 123124, 564, 65, 69, 574635, 2431];
/* // obtener un dato
numeros[1];
numeros[numeros.length - 1];
// cuantos tengo
numeros.length;
// modifico un elemento
numeros[0] = 1;
// agregar un array
numeros[124] = 7654;
// como obtener todos los numeros de un array
// for -> recorrer todos los elementos del arary
for (let index = 0; index < numeros.length; index++) {
  console.log(numeros[index]);
}
numeros.forEach((element, index) => {
  if (index % 2 == 0) {
    console.log(`Posicion ${index} -> ${element}`);
  }
}); */

let tareas = ["Programar", "Documentar", "Probar", "Presentar"];
// length -> 4

// agregar cosas al array -> Al final
tareas.push("Testea", "Modificar", "Gestionar");
// agregar cosas al array -> Al pricipio
tareas.unshift("Planificar", "Entrevistar");

// borra el ultimo elemento del array
console.log(`El elemento borrado es ${tareas.pop()}`);
// borra el primer elemento del array
console.log(`El elemento borrado es ${tareas.shift()}`);

// tareas.forEach((item, index) => console.log(`${index} - ${item}`));
/* 
0 - Entrevistar
arrays.js:38 1 - Programar
arrays.js:38 2 - Documentar
arrays.js:38 3 - Probar
arrays.js:38 4 - Presentar
arrays.js:38 5 - Testea
arrays.js:38 6 - Modificar
*/

// busquedas simples -> undefined o any
let elementoBuscado = tareas.find((item) => {
  return item.length == 6;
  /* if (item.length == 6) {
    return true;
  }
  return false; */
});

let elementoBuscado2 = tareas.find((item) => item.length == 16);
let elementosBuscados = tareas.filter((item, index) => {
  return item.length == 6;
});

console.log("elementos buscados");
console.log(elementosBuscados);

// quiero que elimineis el elemento Presentar del array

/* if (elementoBuscado2 == undefined) {
  console.log("elemento no encontrado");
}
 */
