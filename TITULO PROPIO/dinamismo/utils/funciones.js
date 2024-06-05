function sumar(operando1, operando2) {
  let resultado = operando1 + operando2;
  console.log(`El resultado es ${resultado}`);
  return resultado;
}

//sumar(6, 4);

function sumarDiferente(operando1, operando2, operando3) {
  console.log(arguments);
  let resultado = operando1 + operando2;
  console.log("Funcion diferente " + operando3);
  return resultado;
}

function sumaOpcional(operando1, operando2 = 10) {
  let resultado = operando1 + operando2;
  console.log(`El resultado es ${resultado}`);
  return resultado;
}

function calcular(operacion, operando1, operando2) {
  operacion(operando1, operando2);
}

calcular(
  function (op1, op2) {
    console.log(op1 + op2);
  },
  5,
  8
);

calcular(
  function (op1, op2) {
    console.log(op1 - op2);
  },
  5,
  8
);

let sumaVar = (op1, op2) => {
  console.log("Esto es ejecutado desde una funcion de flecha");
  console.log(op1 + op2);
};

sumaVar(4, 6);
// sumarDiferente(6, 4, 67, 67, 23, 12, 312, 312, 123);
// sumar(sumar(4, 6), 10);
// sumaOpcional(5, 4);
// sumaOpcional();
