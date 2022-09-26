import { createWebHistory, createRouter } from "vue-router";
import Home from './components/views/Home.vue'

const routes = [

    {
        path: '/',
        name: 'home',
        component: Home,
        title: "Tivansoft"
    }

];

const router = createRouter({
    history: createWebHistory(),
    base: process.env.BASE_URL,
    routes,
});

export default router;

