import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

Vue.config.productionTip = false

// axios.defaults.header.common['Authorization'] =  'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJncmVnIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY2OTk5MDIzNH0.D43CIahX_uOtOM5yQqbxnksMuY36LxZIExG5Om4qAv60whpln8XmkbV1453j5jDl68kh0VCRUsVi8VPrMQoppg';
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
