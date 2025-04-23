const readline = require('node:readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.question(`primo numero: `, number1 => {
    rl.question(`secondo numero: `, number2 => {
        rl.question(`operazione: `, choice => {
            switch (choice) {
                case "somma":
                    console.log(`${"risultato = " + number1 + number2}`);
                    break;
                case "sottrazione":
                    console.log(`${"risultato = " + number1 - number2}`);
                    break;
                case "moltiplicazione":
                    console.log(`${"risultato = " + number1 * number2}`);
                    break;
                case "divisione":
                    console.log(`${"risultato = " + number1 / number2}`);
                    break;
                default:
                    console.log(`${"boh"}`)
                    break;
            }
            rl.close();
        });
    });
});






