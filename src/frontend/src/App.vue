<template>
    <router-view />
</template>

<script>

  export default {
    name: 'app',
    watch: {
      $route: {
        immediate: true,
        handler(to) {
          document.title = to.meta.title || 'tivansoft';
        }
      },
    },
    data() {
      return {

      };
    },
    mounted(){
      //공통 이벤트 영역
      // $.initialize();
    },
    components: {
    }
  }
</script>
