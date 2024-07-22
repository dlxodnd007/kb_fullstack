<template>
    <div v-for="ordered of orderedDate">
        <!-- <li v-for="ordered of orderedDate"> -->
        날짜 : {{ ordered.date }}--금액 : {{ ordered.mark
        }}{{ ordered.amount }}원--내용 : {{ ordered.description }}--
        {{ ordered.check }}
        <!-- </li> -->
    </div>
</template>

<script setup>
import { ref, computed, watch } from "vue";
import { useChangeStore } from "@/stores/changedb.js";

const changeStore = useChangeStore();
const orderedDate = computed(() => changeStore.orderedDate);
</script>
