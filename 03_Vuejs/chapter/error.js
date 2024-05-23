setInterval(() => {
    try {
        const rand = parseInt(Math.random() * 10);
        console.log(`셍성된 수는 ${rand}`);

        if (rand > 5) return console.log("아싸 로도 사자!");

        throw new Error("아... 망했어요");
    } catch (error) {
        console.log(error);
    }
}, 2000);
