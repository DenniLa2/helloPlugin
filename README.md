# hello-word Plugin
hello-word cordova plugin

- Android
- (- ios)

#install
$ cordova plugin add https://github.com/DenniLa2/helloPlugin.git

#use
window.Photo.cam1(title, message, button, successCallback)

#sample
window.Photo.cam1($scope.al.title,$scope.al.message,$scope.al.button,
        function(data){
          $timeout(function(){$scope.succ(data)})
        });
        
This action binded on "open Alert" button.
