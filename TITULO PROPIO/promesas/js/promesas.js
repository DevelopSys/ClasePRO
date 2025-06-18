// vamos a calcular un numero aleatorio entre 0 y 10
// si el numero es mayor de 5, se resuelve la promesa OK
// si el numero es menor o igual a 5, se resuelve la promesa NO OK

let promesa = new Promise((res, rej) => {
  setTimeout(() => {
    let aleatorio = Math.floor(Math.random() * 10);
    console.log(`Numero aleatorio: ${aleatorio}`);
    if (aleatorio >= 5) {
      res(`Funcion ok: ${aleatorio}`);
    } else {
      rej(`Funcion no ok: numero pequeño`);
    }
  }, 3000);
});

promesa
  .then((res) => {
    console.log(res);
  })
  .catch((err) => {
    console.log(err);
  });
