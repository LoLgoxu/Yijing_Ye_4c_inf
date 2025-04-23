// Creazione dell'oggetto studente usando new Object()
const studente = new Object();

// Assegnazione delle proprietà
studente.nome = "Luca";
studente.cognome = "Rossi";
studente.matricola = "12345";

// Aggiunta del metodo scheda
studente.scheda = function() {
    return `Nome: ${this.nome}, Cognome: ${this.cognome}, Matricola: ${this.matricola}`;
};

// Stampa del risultato del metodo
console.log(studente.scheda());