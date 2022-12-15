const subtrair = document.querySelector('#subtrair');
const somar = document.querySelector('#somar');

const controle = document.querySelectorAll("[data-controle]");

function manipulaDados(operacao,controle) {
    const peca = controle.querySelector("[data-contador]")
    if(operacao === "-") {
        peca.value = parseInt(peca.value) - 1;
    } else {
        peca.value =  parseInt(peca.value) + 1;
    }
}

controle.forEach( (elemento) => {
    elemento.onclick = (evento) => {
        manipulaDados(evento.target.dataset.controle, evento.target.parentNode);
    }
})