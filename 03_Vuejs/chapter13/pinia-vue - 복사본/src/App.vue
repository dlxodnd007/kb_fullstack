<template>
    <button @click="showModal">모달 열기</button>
    <ModalComponents :visible="isModalVisible" @close-modal="hideModal" />
    <ShowList />
</template>

<script setup>
import { ref } from "vue";
import ModalComponents from "@/components/Modal.vue";
import Counter from "@/components/Counter.vue";
import Show from "./components/Show.vue";
import ShowList from "./components/ShowList.vue";
import MakeComponent from "./components/MakeComponent.vue";

const isModalVisible = ref(false);

function showModal() {
    isModalVisible.value = true;
}

function hideModal() {
    isModalVisible.value = false;
}
</script>
