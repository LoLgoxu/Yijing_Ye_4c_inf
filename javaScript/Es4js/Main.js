for (let i = Number(1); i < 21; i++) {
    if (i % 3 == Number(0) && i % 5 == Number(0)) {
        console.log(i + " Multiplo di entrambi");
    } else if (i % 3 == Number(0)) {
        console.log(i + " Multiplo di 3");
    } else if (i % 5 == Number(0)) {
        console.log(i + " Multiplo di 5");
    } else {
        console.log(i);
    }


}