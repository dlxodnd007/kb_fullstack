let human = {
    name: "김상형",
    age: 29,
    intro: function () {
        let name = "임시";
        console.log("name = " + this.name);
        console.log("age = " + this.age);
    },
};
human.intro();
