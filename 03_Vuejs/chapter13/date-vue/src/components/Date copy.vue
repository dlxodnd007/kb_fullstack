<template>
    <div>
        <h1>Date</h1>
        <h1 v-if="flag == 1">오늘은 {{ msg }} 입니다</h1>
        <button @click="showYear">년도 출력</button>
        <button @click="showMonth">월 출력</button>
        <button @click="showDay">일자 출력</button>
    </div>
</template>

<script setup>
import { ref, computed } from "vue";
import { useDateStore } from "@/stores/date";

const msg = ref("");
const flag = ref(0);

const dateStore = useDateStore();
const year = computed(() => dateStore.year);
const month = computed(() => dateStore.month);
const day = computed(() => dateStore.day);
function showYear() {
    msg.value = `${year.value}년`;
    flag.value = 1;
}
function showMonth() {
    msg.value = `${month.value}월`;
    flag.value = 1;
}
function showDay() {
    msg.value = `${day.value}일`;
    flag.value = 1;
}
</script>
