let messaggio = "Ciao dal globale!";

function mostraMessaggio() {
    let messaggio = "Ciao dal locale!";
    console.log(messaggio);
}

mostraMessaggio();

console.log(messaggio);