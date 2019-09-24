<template>
    <div id="chat" v-for="chat of info" v-bind:key="chat.id">
        <!--            <div v-on:click="logger(chat)">-->
        {{chat.id}} - {{chat.name}} - {{chat.breed}} -
        <span v-if="chat.vomito">vomi!!!!</span>
        <span v-else>propre</span> - {{chat.randomValue}}
        <!--            </div>-->
    </div>
</template>

<script>
    const chat = {
        name: "Chat"
    }

    export default chat
</script>

<style>

    #chat {
        background-color: red;
    }

</style>