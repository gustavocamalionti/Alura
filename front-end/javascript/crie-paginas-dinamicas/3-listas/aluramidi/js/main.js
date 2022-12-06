
//Pom -----------------------------------------------------------------------------
function TocaSomPom(){
    document.querySelector('#som_tecla_pom').play();
}

// document.querySelector('.tecla_pom').onclick = TocaSomPom;


//Lista -----------------------------------------------------------------------------
const listaDeTeclas = document.querySelectorAll('.tecla');

listaDeTeclas[0] = TocaSomPom();