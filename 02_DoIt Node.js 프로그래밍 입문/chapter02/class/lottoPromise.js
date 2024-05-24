const shouldIBuyLotto = new Promise(function (resolve, reject) {
    console.log("나 로또 사도 될까!?");
    setTimeout(() => {
        const rand = parseInt(Math.random() * 10);
        console.log(`나온 숫자는 ${rand}`);
        // rand 가 5 이상이면 로또 사자!
        if (rand >= 5) {
            resolve("아싸! 로또 사자!");
        } else {
            reject("아... 망했어요...");
        }
    }, 3000);
});

function showResult(msg) {
    // console.log(msg);
}

shouldIBuyLotto
    .then((msg) => console.log(msg))
    .catch((msg) => console.log(msg));

// showResult(shouldIBuyLotto);

// shouldIBuyLotto.then((data) =>console.log(data));
// shouldIBuyLotto.catch((data) =>console.log(data));
