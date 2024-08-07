const promise = new Promise((res, rej) => {
    setTimeout(() => {
        const num = Math.random();

        if (num >= 0.8) rej("생성된 숫자가 0.8 이상임 - " + num);

        return res(num);
    }, 2000);
});

promise
    .then((result) => {
        console.log(`처리 결과 : ${result}`);
    })
    .catch((error) => {
        console.log(`오류 : ${error}`);
    });
console.log("## Promise 생성");
