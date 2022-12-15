calcular = document.querySelector('#calcular');
resultado = document.querySelectorAll('.resultado');



calcular.onclick = () => {
    for (cont = 0; cont < resultado.length; cont++) {
        resultado[cont].innerHTML = "Fui clicado"
    }
    
}