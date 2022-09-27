const path = require("path");
/*   target: 'http://13.125.211.180:9000', */
module.exports = {
  devServer: {
    proxy: {
      '/vue': {
        target: 'http://13.125.211.180:9000',
        changeOrigin: true
      },
    }
  }
}