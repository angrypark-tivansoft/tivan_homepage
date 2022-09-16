import http from "./http";

export default {
    async getSenmail(data) {
        return http.post('/vue/sendmail',data);
    }
}