/* funciones -> metodos */
/* 
    public void nombre(parametros){}
    tradicional
        function nombre(param=9){
            return true
        }
    
        nombre(6)

    arrow
    let suma = (p1,p2)=> p1+p2 
    let suma = (p1,p2)=> { return p1+p2 }
    let suma = (p1,p2)=> { let suma = p1+p2
                            return suma
                            }
*/

function realizarSuma(operando1, operando2 = 0) {
  console.log(
    `Procedemos a la suma de dos parametos los cuales tienen el valor de ${operando1} y ${operando2}`
  );
  return Number(operando1 + operando2);
}

// console.log(`El resultado de la suma es ${realizarSuma(6, 4)}`);
// realizarSuma(6,4)

/* function realizarMultiplicacion() {
  let multiplicacion = 1;
  console.log(
    `Vamos a realizar la multiplicacion de unos pocos numeros: ${arguments.length}`
  );
  // sacar el valor de la multiplicacion de todos los numeros
  for (let index = 0; index < arguments.length; index++) {
    multiplicacion = multiplicacion * arguments[index];
  }
  console.log(`El resultado final es ${multiplicacion}`);
} */

function realizarMultiplicacion(...args) {
  let multiplicacion = 1;
  console.log(
    `Vamos a realizar la multiplicacion de unos pocos numeros: ${args.length}`
  );
  // sacar el valor de la multiplicacion de todos los numeros
  for (let index = 0; index < args.length; index++) {
    multiplicacion = multiplicacion * args[index];
  }
  console.log(`El resultado final es ${multiplicacion}`);
}

let funcionSuma = (p1, p2) => {
  return p1 + p2;
};

// realizarMultiplicacion(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
console.log(`La suma de los dos parametros es ${funcionSuma(1, 4)}`);

function realizarOperacion(operando1, operando2, operacion) {
  return operacion(operando1, operando2);
}

console.log(
  `El resultado de la multiplicacion es ${realizarOperacion(
    1,
    5,
    (p1, p2) => p1 * p2
  )}`
);
console.log(
  `El resultado de la division es ${realizarOperacion(
    1,
    5,
    (p1, p2) => p1 / p2
  )}`
);
console.log(
  `El resultado de la suma es ${realizarOperacion(1, 5, (p1, p2) => p1 + p2)}`
);
console.log(
  `El resultado de la resta es ${realizarOperacion(1, 5, (p1, p2) => p1 - p2)}`
);
