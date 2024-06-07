import { ref, computed } from "vue";
import { defineStore } from "pinia";

export const useDateStore = defineStore("date", () => {
    const today = new Date();

    const year = ref(today.getFullYear());
    const month = ref(today.getMonth() + 1);
    const day = ref(today.getDate());
    const flag = ref(0);
    let msg = ref("");

    return { year, month, day };
});
