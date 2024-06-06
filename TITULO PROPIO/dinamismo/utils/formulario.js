let inputNombre = document.querySelector("#input-nombre");
let inputApellido = document.querySelector("#input-apellido");
let inputTelefono = document.querySelector("#input-telefono");
let inputPass = document.querySelector("#input-pass");
let selectGenero = document.querySelector("#select-genero");
let botonEnviar = document.querySelector("#boton-envio");
let botonVaciar = document.querySelector("#boton-vaciar");
let botonObtener = document.querySelector("#boton-obtener");
let botonDesactivar = document.querySelector("#boton-desactivar");
let lista = document.querySelector("#lista-usuarios");

botonEnviar.addEventListener("click", (e) => {
  let nombre = inputNombre.value;
  let apellido = inputApellido.value;
  let telefono = inputTelefono.value;
  let pass = inputPass.value;
  let genero = selectGenero.value;

  if (
    nombre.length == 0 ||
    apellido.length == 0 ||
    telefono.length < 9 ||
    pass.length == 0
  ) {
    alert("Los datos no son correctos");
  } else {
    // crear el nodo
    let nodoLI = document.createElement("li");
    nodoLI.innerHTML = `${nombre} ${apellido} <button>Eliminar</button> `;
    nodoLI.className = "list-group-item";
    lista.append(nodoLI);

    // lista.innerHTML += `<li class='list-group-item animate__animated animate__fadeInUpBig'> ${nombre} ${apellido} ${telefono} <button class="btn btn-danger m-4">Eliminar</button> </li>`;
    /* console.log(nombre);
    console.log(apellido);
    console.log(telefono);
    console.log(pass);
    console.log(genero); */
  }
});

botonVaciar.addEventListener("click", () => {
  lista.innerHTML = "";
});

botonObtener.addEventListener("click", () => {
  let hijos = lista.childNodes;
  hijos.forEach((element) => {
    console.log(element);

    element.classList = "list-group-item animate__animated animate__fadeInUp";
    // let asdasd = ""
    //console.log(contenido.split(" ")[0]);
  });
});

botonDesactivar.addEventListener("click", () => {
  // botonDesactivar.remove();
  // lista.removeChild(botonEnviar);

  let hijos = lista.childNodes;
  hijos.forEach((element) => {
    //console.log(element);
    element.classList = "list-group-item animate__animated animate__shakeX";
    // let asdasd = ""
    //console.log(contenido.split(" ")[0]);
  });
});
