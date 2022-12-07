const robotron = document.querySelector('#robotron');

function dizOi() {
    console.log("Oi");
}

// robotron.addEventListener("click", dizOi);

robotron.onclick = function() {
    dizOi()
}