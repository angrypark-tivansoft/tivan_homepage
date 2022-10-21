import http from "./http";

export default {
    async selectHisList() {
        return http.get('/vue/selectHisList');
    }
}