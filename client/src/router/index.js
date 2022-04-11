import Vue from 'vue'
import Router from 'vue-router'
import Garagem from '@/components/Garagem.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Garagem',
      component: Garagem
    }
  ]
})
