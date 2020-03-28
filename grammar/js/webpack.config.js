const path = require('path');

module.exports = {
  node: { module: "empty", net: "empty", fs: "empty" },
  entry: './index.js',
  output: {
    filename: 'main.js',
    libraryTarget: 'var',
    library: 'n3',
    path: path.resolve(__dirname, 'dist'),
  },
};