<template>
    <div>
        <h1>{{ randnum }}</h1>
        <input type="text" v-model.number="inputnum" />
        <button @click="sendAnswer">정답!</button>
    </div>
</template>

<script setup>
import { ref } from "vue";
import { defineProps } from "vue";
import { defineEmits } from "vue";

const emit = defineEmits(["send-msg"]);
const inputnum = ref(0);

const props = defineProps({
    randnum: {
        type: parseInt,
        required: true,
    },
});
function sendAnswer() {
    if (props.randnum == inputnum.value) {
        emit("send-msg", "정답입니다");
        inputnum.value = "";
    } else if (props.randnum > inputnum.value) {
        emit("send-msg", "UP");
        inputnum.value = "";
    } else if (props.randnum < inputnum.value) {
        emit("send-msg", "DOWN");
        inputnum.value = "";
    }
}
</script>
