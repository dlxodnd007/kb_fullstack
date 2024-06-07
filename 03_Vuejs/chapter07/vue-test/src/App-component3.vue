<script setup>
import SandNameComponent from "./SandNameComponent.vue";
</script>

<style></style>

<template>
    <div>
        <h1>너의 이름은 {{ name }}</h1>
        <SandNameComponent v-on:nameChange="nameChangeHandler" />
    </div>
</template>
<script>
export default {
    name: "App",
    data() {
        return {
            name: "",
        };
    },
    methods: {
        nameChangeHandler(e) {
            this.name = e.name;
        },
    },
};
</script>

<style scoped></style>
