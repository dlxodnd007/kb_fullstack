<template>
    <slot>
        <div>
            <FancyPhotoBox>
                <template v-slot:title>
                    <h1>지겨운 장동민 마멋</h1>
                </template>
                <template v-slot:photo>
                    <img
                        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRc_M2DPukPfdBYdFKHz95YwEJZwoOP1-eghw&s"
                        alt="장동민마멋"
                    />
                </template>
            </FancyPhotoBox>
        </div>
    </slot>
</template>

<script>
import FancyPhotoBox from "./FancyPhotoBox.vue";

export default {
    name: "ParentFancyPhotoBox",
    components: { FancyPhotoBox },
};
</script>

<style lang="scss" scoped></style>
