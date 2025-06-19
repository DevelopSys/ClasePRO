// https://pokeapi.co/api/v2/pokemon/?offset=20&limit=100

// fetch(url)
// then -> contestas ok
// catch -> contestas error

{
  /* <div class="col">
          <div class="card">
            <img src="..." class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">Card title</h5>
              <p class="card-text">
                This is a longer card with supporting text below as a natural
                lead-in to additional content. This content is a little bit
                longer.
              </p>
            </div>
          </div>
        </div> */
}

let divCards = document.querySelector("#pokemonCards");
console.log(divCards);

fetch("https://pokeapi.co/api/v2/pokemon/?offset=20&limit=100")
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log("Contesta OK");

    data.results.forEach((pokemon) => {
      console.log(pokemon);
      divCards.innertHTML += `<div class="col">
          <div class="card">
            <img src="https://i.pinimg.com/736x/54/f2/6b/54f26bea270ffdc9fd8a614c22d63970.jpg" class="card-img-top" alt="..." />
            <div class="card-body">
              <h5 class="card-title">${pokemon.name}</h5>
              <p class="card-text">
                This is a longer card with supporting text below as a natural
                lead-in to additional content. This content is a little bit
                longer.
              </p>
            </div>
          </div>
        </div>`;
    });
  })
  .catch((error) => {
    console.error("Contesta ERROR");
  });
