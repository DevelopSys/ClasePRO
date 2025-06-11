// array -> no dinamico
// arraylist -> dinamico

let numeros = [4123, 35468, 123124, 564, 65, 69, 574635, 2431];
// obtener un dato
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
/* for (let index = 0; index < numeros.length; index++) {
  console.log(numeros[index]);
} */
numeros.forEach((element, index) => {
  if (index % 2 == 0) {
    console.log(`Posicion ${index} -> ${element}`);
  }
});
