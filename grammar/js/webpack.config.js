const path = require('path');

// N3
module.exports = {
  // exclude node.js-only modules
  // node: { module: "empty", net: "empty", fs: "empty" }, // older versions of webpack
  resolve: { fallback: { fs: false } }, // webpack v5
  
  entry: './parser/n3/index.js',
  output: {
    filename: 'n3Main.js',
    libraryTarget: 'var',
    library: 'n3',
    path: path.resolve(__dirname, 'dist'),
  },
  optimization: {
    minimize: false
  }
};

// TurtleStar
/*module.exports = {
  node: { module: "empty", net: "empty", fs: "empty" },
  entry: './parser/turtlestar/index.js',
  output: {
    filename: 'turtlestarMain.js',
    libraryTarget: 'var',
    library: 'turtlestar',
    path: path.resolve(__dirname, 'dist'),
  },
  optimization: {
    minimize: false
  }
};*/