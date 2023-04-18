const vocales = ["a", "e", "i", "o", "u"];
const llaves = ["ai", "enter", "imes", "ober", "ufat"];
var textoIntroducido = document.getElementById("texto");
var textoResultado = document.getElementById("text-cifrado");

function limpiarTextoIntroducido() {
  document.getElementById("texto").value = "";
}

function encriptar() {
  var textoIntroducido = document.getElementById("texto").value.toLowerCase();
  var textoEncriptado = "";
  var encontrado = false;

  if (textoIntroducido.trim() !== "") {
    for (var i = 0; i < textoIntroducido.length; i++) {
      encontrado = false;
      for (var j = 0; j < vocales.length; j++) {
        if (textoIntroducido.charAt(i) === vocales[j]) {
          textoEncriptado += llaves[j];
          encontrado = true;
          break;
        }
      }
      if (!encontrado) {
        textoEncriptado += textoIntroducido.charAt(i);
      }
    }
  }

  textoResultado.value = textoEncriptado;

  mostrarResultado();
  limpiarTextoIntroducido();
}

function desencriptar() {
  var textoDesencriptado = textoIntroducido.value.toLowerCase();

  if (textoIntroducido.value.trim() !== "") {
    for (var j = 0; j < llaves.length; j++) {
      var re = new RegExp(llaves[j], "g");
      textoDesencriptado = textoDesencriptado.replace(re, vocales[j]);
    }
  }
  textoResultado.value = textoDesencriptado;

  mostrarResultado();
  limpiarTextoIntroducido();
}

function copiarTexto() {
  var textoCopiado = document.getElementById("text-cifrado");
  textoCopiado.select();
  document.execCommand("copy");
  window.getSelection().removeAllRanges();
}

function mostrarResultado() {
  if (textoIntroducido.value.trim() !== "") {
    document.querySelector(".resultado").style.display = "block";
    document.querySelector(".resultado").scrollIntoView(); // mostrar resultado
    document.querySelector(".rectangulo").style.display = "none";
  } else {
    document.querySelector(".resultado").style.display = "none"; //ocultar resultado
    document.querySelector(".rectangulo").style.display = "block";
    document.querySelector(".rectangulo").classList.remove("highlight");
    void document.querySelector(".rectangulo").offsetWidth; // Forzar reseteo de la animacion
    document.querySelector(".rectangulo").classList.add("highlight");
    document.querySelector(".rectangulo").scrollIntoView();
  }
}
