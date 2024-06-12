/* let promesa = new Promise((res, rej) => {
  res();
  rej();
}); */

window.addEventListener("load", () => {
  let divResultados = document.querySelector("#div-resultados");
  let selectGenero = document.querySelector("#select-genero");

  getAllUsers();

  selectGenero.addEventListener("change", () => {
    let seleccion = selectGenero.value;
    console.log(seleccion);

    divResultados.innerHTML = "";
    if (seleccion == "all") {
      getAllUsers();
    } else {
      fetch(`https://dummyjson.com/users/filter?key=gender&value=${seleccion}`)
        .then((result) => result.json())
        .then((result2) => {
          result2.users.forEach((element) => {
            paintUser(element);
          });
        });
    }
  });

  function getAllUsers() {
    fetch("http://dummyjson.com/users")
      .then((result) => {
        // resultado de la contestacion del servidor
        return result.json();
      })
      .then((result2) => {
        // resultado de la conversion del resultado anterior pasado a json
        result2.users.forEach((element) => {
          paintUser(element);
        });
      })
      .catch((error) => {
        console.log("Fallo en la conexion o interpretacion de la peticion");
      });
  }

  function paintUser(user) {
    // añadir la carta dentro del HTML de div resultados
    divResultados.innerHTML += `<article class="col mb-3">
              <div class="card" style="width: 18rem">
                <img src="${user.image}" class="card-img-top" alt="..." />
                <div class="card-body">
                  <h5 class="card-title">${user.firstName} ${user.lastName} - ${user.age}</h5>
                  <p class="card-text">
                    Genero: ${user.gender}
                  </p>
                </div>
              </div>
            </article>`;
  }
});

/* fetch("http://dummyjson.com/users", {
  method: "",
  body: {},
})
  .then((result) => result.json())
  .then((result2) =>
    result2.users.forEach((element) => {
      console.log(
        `${element.firstName} ${element.lastName} ${element.maidenName}`
      );
    })
  )
  .catch((error) => {
    console.log("Fallo en la conexion o interpretacion de la peticion");
  });
 */
/*   <article class="col mb-3">
          <div class="card" style="width: 18rem">
            <img src="..." class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">
                Some quick example text to build on the card title and make up
                the bulk of the card's content.
              </p>
              <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
          </div>
        </article> */
