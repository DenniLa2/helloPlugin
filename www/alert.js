module.exports = {
  alert: function (title, message, buttonLabel, successCallback) {
    return cordova.exec(
      successCallback,
      null, // no callback
      "Alert",
      "alert",
      [title, message, buttonLabel]);
  },

  alert2: function (title, message, buttonLabel, successCallback) {
    var params = [title, message, buttonLabel];
    return cordova.exec(
      successCallback,
      null, // no callback
      "Alert",
      "alert2",
      params);
  }

};