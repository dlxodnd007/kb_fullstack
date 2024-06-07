let star = "";

for (let i = 1; i < 5; i++) {
    for (let j = 1; j <= 7; j++) {
        if (i < j) {
            star += " ";
        } else star += "*";
    }
    star += "\n";
}

console.log(star);
