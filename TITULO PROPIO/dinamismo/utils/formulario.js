let inputNombre = document.querySelector("#input-nombre");
let inputApellido = document.querySelector("#input-apellido");
let inputTelefono = document.querySelector("#input-telefono");
let inputPass = document.querySelector("#input-pass");
let selectGenero = document.querySelector("#select-genero");
let botonEnviar = document.querySelector("#boton-envio");
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
    lista.innerHTML += `<li class='list-group-item animate__animated animate__fadeInUpBig'> ${nombre} ${apellido} ${telefono}</li>`;

    console.log(nombre);
    console.log(apellido);
    console.log(telefono);
    console.log(pass);
    console.log(genero);
  }
});
