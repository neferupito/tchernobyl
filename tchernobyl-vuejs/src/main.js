import Vue from 'vue'
import App from './App'
import crono from 'vue-crono';
import VueLogger from 'vuejs-logger';

Vue.config.productionTip = false
new Vue({
//     el: '#app',
//     template: '<App/>',
//     components: {App}
// })
    render: (h) => h(App),
}).$mount('#app');

Vue.use(crono);

const options = {
    isEnabled: true,
    logLevel : 'debug',
    stringifyArguments : false,
    showLogLevel : true,
    showMethodName : true,
    separator: '|',
    showConsoleColors: true
};
Vue.use(VueLogger, options);
