const robotron = document.querySelector('#robotron');

function dizOi(nome) {
    console.log('Oi ' + nome + ',');
    console.log("Bem-vindo ao Robotron 2000");
}

// robotron.addEventListener("click", dizOi);

// robotron.onclick = function() {
//     console.log("Cliquei no robô.")
// }

robotron.onclick = (evento) => {
    console.log(evento);
    console.log("Cliquei no robô.");
}

dizOi('pedro');

