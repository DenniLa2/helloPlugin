module.exports = {
  cam1: function (title, message, buttonLabel, successCallback) {
    return cordova.exec(
      successCallback,
      null, // no callback
      "Photo",
      "cam1",
      [title, message, buttonLabel]);
  },

  cam2: function (title, message, buttonLabel, successCallback) {
    var params = [title, message, buttonLabel];
    cordova.exec(
      successCallback,
      null, // no callback
      "Photo",
      "cam2",
      params);
  }

};