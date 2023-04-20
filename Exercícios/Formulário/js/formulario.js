document.addEventListener('DOMContentLoaded', function() {
    let elems = document.querySelectorAll('select');
    let options = document.querySelectorAll('option')
    let instances = M.FormSelect.init(elems, options);
  });



  function validar(){
    let turno = formulario.turno;

    if(turno.checked) {
        console.log("tudo certo");

    } else {
        alert("Selecione um turno para reuniões");
        turno.focus();
    }

    
  }

const handlePhone = (event) => {
    let input = event.target
    input.value = phoneMask(input.value)
}

const phoneMask = (value) => {
    if (!value) return ""
    value = value.replace(/\D/g,'')
    value = value.replace(/(\d{2})(\d)/,"($1) $2")
    value = value.replace(/(\d)(\d{4})$/,"$1-$2")
    return value
}

