<script setup>
import { ref, reactive, computed } from "vue";
import PropsChild from "./components/PropsChild.vue";
</script>

<template>
    <!-- <h1>Vue3 Counter</h1>
    <h2>Count : {{ count }}</h2>
    <h2>두배로! {{ double }}</h2>
    <h2>지금까지 계산한 횟수 : {{ totalClick - 1 }}</h2>
    <button @click="increment">Increment</button>
    <button @click="decrement">Decrement</button>
    <button @click="Clear">Clear</button> -->
    <PropsChild :msg="msg" />
</template>

<script>
const msg = ref("props 로 전달 될 메세지");

const count = ref(0);
const totalClick = ref(0);
const double = computed(function () {
    totalClick.value += 1;
    return count.value * 2;
});
function increment() {
    count.value++;
    // totalClick.value += 1;
}
function decrement() {
    count.value--;
    // totalClick.value += 1;
}
function Clear() {
    count.value = 0;
    totalClick.value = 0;
}
</script>
