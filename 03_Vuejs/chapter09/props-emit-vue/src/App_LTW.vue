<template>
    <div>
        <h1>{{ msg }}</h1>
        <ChildComponent @send-msg="emitHandler" :randnum="randnum" />
    </div>
</template>

<script setup>
import ChildComponent from "./components/ChildComponent.vue";
import { ref } from "vue";
const msg = ref("랜덤 숫자를 맞춰 주세요");
const randnum = ref(parseInt(Math.random() * 20));
function emitHandler(payload) {
    msg.value = payload;
}
</script>
