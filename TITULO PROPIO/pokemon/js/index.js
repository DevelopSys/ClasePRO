// https://pokeapi.co/api/v2/pokemon/?offset=20&limit=100

// fetch(url)
// then -> contestas ok
// catch -> contestas error

fetch("https://pokeapi.co/api/v2/pokemon/?offset=20&limit=100")
  .then((response) => {
    console.log("Contesta OK");
    return response.json();
  })
  .then((data) => {
    //console.log(data.results);
    data.results.forEach((pokemon) => {
      console.log(pokemon.name);
    });
  })
  .catch((error) => {
    console.error("Contesta ERROR");
  });
