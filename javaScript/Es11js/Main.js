class Auto {
    constructor(marca, modello, anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    descrizione() {
        console.log(`Questa è una ${this.marca} ${this.modello} del ${this.anno}`);
    }
}

const auto1 = new Auto("BMW", "X1", 2021);

auto1.descrizione();