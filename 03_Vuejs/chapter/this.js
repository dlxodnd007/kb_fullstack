const tetzObj = {
    name: "dlxodnd007",
    isOld: false,
    sayHello: function () {
        console.log(this.name);
    },
    nesteObj: {
        name: "방시혁",
        isOld: true,
        sayHello: function () {
            // console.log(tetzObj.nesteObj.name);
            console.log(this.name);
        },
    },
};

// tetzObj.sayHello();
// tetzObj.nesteObj.sayHello();

const obj = {
    name: "이효석",
    isOld: true,
    condition: "good",
};

for (key in obj) {
    console.log(`key 값은 ${key} 이고, value 값은 ${obj[key]} 입니다`);
}
