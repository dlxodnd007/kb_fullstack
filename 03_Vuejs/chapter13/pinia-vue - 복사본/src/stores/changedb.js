import { ref, computed } from "vue";
import axios from "axios";
import { defineStore } from "pinia";

export const useChangeStore = defineStore("changedb", () => {
    const transaction = ref([]);
    const orderedDate = ref([]);

    async function fetchListOrder() {
        try {
            const url_income = "http://localhost:3000/income";
            const user_income = await axios.get(url_income);
            // console.log("user_income", user_income.data);

            for (let i = 0; i < user_income.data.length; i++) {
                user_income.data[i].check = "입금";
                user_income.data[i].mark = "+";
                transaction.value.push(user_income.data[i]);
            }

            const url_expenses = "http://localhost:3000/expenses";
            const user_expenses = await axios.get(url_expenses);
            // console.log("user_expenses", user_expenses);

            for (let i = 0; i < user_expenses.data.length; i++) {
                user_expenses.data[i].check = "지출";
                user_expenses.data[i].mark = "-";
                transaction.value.push(user_expenses.data[i]);
            }
            // console.log("transaction", transaction.value);

            orderedDate.value = transaction.value
                .sort(
                    (a, b) =>
                        new Date(a.date).getTime() - new Date(b.date).getTime()
                )
                .reverse();
            console.log("orderedDate", orderedDate.value);
        } catch (e) {
            alert("데이터 불러오기 문제 발생!");
            console.log(e);
        }
    }
    fetchListOrder();
    return { transaction, orderedDate, fetchListOrder };
});
