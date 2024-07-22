<template>
    <div class="modal-overlay" v-if="visible">
        <div class="modale">
            <div class="modal-content">
                <div>
                    <h1>내역 추가</h1>
                    <hr />
                    <div>
                        <h1>날짜</h1>
                        <input type="date" v-model="date" />
                    </div>
                    <div>
                        <h1>카테고리(내역)</h1>
                        <select v-model="category">
                            <option>식비</option>
                            <option>생활비</option>
                            <option>소비</option>
                        </select>
                    </div>
                    <div>
                        <h1>내용</h1>
                        <input type="text" v-model="description" />
                    </div>
                    <div>
                        <h1>금액</h1>
                        <input type="text" v-model="amount" />
                    </div>

                    <div>
                        <input
                            type="radio"
                            id="one"
                            value="income"
                            v-model="picked"
                        />
                        <label for="one">수입</label>
                        <input
                            type="radio"
                            id="two"
                            value="expenses"
                            v-model="picked"
                        />
                        <label for="two">지출</label>
                    </div>
                    <br />
                    <button
                        class="comfirm-button"
                        @click="sendComfirm(), fetchListOrder()"
                    >
                        등록
                    </button>
                    <button class="close-button" @click="sendClose">
                        취소
                    </button>
                </div>
            </div>
            <slot></slot>
        </div>
    </div>
</template>

<script setup>
import { ref, defineProps, defineEmits } from "vue";
import axios from "axios";

import { useChangeStore } from "@/stores/changedb.js";

const changeStore = useChangeStore();
const { fetchListOrder } = changeStore;

const date = ref("");
const amount = ref(0);
const category = ref("");
const description = ref("");
const picked = ref("");

async function fetchList() {
    try {
        const url = "http://localhost:3000/users";
        const user_data = await axios.get(url);
        console.log("user_data", user_data);
    } catch (e) {
        alert("데이터 불러오기 문제 발생!");
        console.log(e);
    }
}

const props = defineProps({
    visible: {
        type: Boolean,
        required: true,
    },
});

const emit = defineEmits(["close-modal"]);

function sendClose() {
    emit("close-modal");
}

async function sendComfirm() {
    // console.log(date.value);
    // console.log(category.value);
    // console.log(description.value);
    // console.log(amount.value);
    // console.log(picked.value);

    if (date.value !== "" && description.value !== "" && amount.value !== 0) {
        if (picked.value === "income") {
            // emit("date");
            const url = "http://localhost:3000/income";
            const user_income = await axios.get(url);
            console.log("user_income", user_income);
            try {
                const newData = {
                    date: date.value,
                    // category: category.value,
                    description: description.value,
                    amount: Number(amount.value),
                };
                const addData = await axios.post(url, newData);

                if (addData.status !== 201) return alert("저장 실패");

                fetchListOrder();
            } catch (error) {
                alert("작업 중, ERR 발생");
                console.log(error);
            }
        } else if (picked.value !== "income") {
            const url = "http://localhost:3000/expenses";
            const user_expenses = await axios.get(url);
            console.log("user_expenses", user_expenses);
            try {
                const newData = {
                    date: date.value,
                    category: category.value,
                    description: description.value,
                    amount: Number(amount.value),
                };
                const addData = await axios.post(url, newData);

                if (addData.status !== 201) return alert("저장 실패");

                fetchListOrder();
            } catch (error) {
                alert("작업 중, ERR 발생");
                console.log(error);
            }
        }
        sendClose();
    } else {
        alert("다시 입력해주세요");
    }
}
fetchListOrder();
</script>

<style scoped>
.modal-overlay {
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: rgba(0, 0, 0, 0.5);
    display: flex;
    justify-content: center;
    align-items: center;
}

.modale {
    background: white;
    padding: 20px;
    border-radius: 5px;
    position: relative;
}

.close-button {
    position: absolute;
    bottom: 10px;
    right: 10px;
    background: transparent;
    border: none;
    font-size: 20px;
    font-weight: 700;
}
.comfirm-button {
    position: absolute;
    bottom: 10px;
    left: 10px;
    background: transparent;
    border: none;
    font-size: 20px;
    font-weight: 700;
}

.modal-content {
    margin-top: 30px;
}
</style>
