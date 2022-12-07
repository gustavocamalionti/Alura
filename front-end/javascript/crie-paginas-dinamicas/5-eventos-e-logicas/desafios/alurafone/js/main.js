const listaDeTeclas = document.querySelectorAll('input[type=button]');
const inputTel = document.querySelector('input[type=tel]');


function ImprimeInputClick(tecla) {
    inputTel.value = inputTel.value + tecla.value;
}


for (let indice = 0; listaDeTeclas.length; indice++) {
    const tecla = listaDeTeclas[indice];

    tecla.onclick = function() {
        ImprimeInputClick(tecla);
    }

    tecla.onkeydown = function(e) {
        if(e.code === "Enter" || e.code === "Space") {
            tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function() {
        listaDeTeclas.classList.remove('ativa');
    }
}