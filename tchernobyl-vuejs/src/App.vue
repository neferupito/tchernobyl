<template>
    <div id="app">
        <Chat />
    </div>
</template>

<script>
    import axios from 'axios';
    import Chat from './components/Chat'

    const app = {
        name: "app",
        components: {
            Chat
        },
        data() {
            return {
                info: null
            }
        },
        methods: {
            refresh() {
                this.$log.debug('Refresh Data');
                axios
                    .get('http://localhost:8080/chats/all')
                    .then(response => (this.info = response.data));
            }
        },
        created() {
            this.refresh();
        },
        cron: {
            time: 10000,
            method: 'refresh'
        }
    }

    export default app


</script>

<style>
    #app {
        background-color: bisque;
        font-family: Arial;
    }
</style>
