module.exports = {
  alert: function (title, message, buttonLabel, successCallback) {
    cordova.exec(successCallback,
      null, // no callback
      "Alert",
      "alert",
      [title, message, buttonLable]);
  }
};