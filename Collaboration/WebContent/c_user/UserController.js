myApp.controller("UserController",function($scope,$http,$rootScope,$location)
		{
	
		$scope.User={loginname:'',password:'',userName:'',emailId:'',mobileNo:'',address:'',role:''};
		
		$scope.register=function()
		{	
			$scope.User.role='ROLE_USER';
			
			alert("User Registered Successfully");
			
			$http.post('http://localhost:8082/ChatMiddleware/registerUser',$scope.User)
			.then(function(response)
					 {
					 
					 
					 console.log(response.statusText);
					 });
			
		}
		
		$scope.checklogin=function()
		{
			alert("Checking Login Process");
			
			$http.post('http://localhost:8082/ChatMiddleware/checkLogin',$scope.User)
			.then(function(response)
					{
						$scope.User=response.data;
						$rootScope.currentUser=$scope.User;
						console.log($rootScope.User);
						$location.path("/");
					});
		}
	
		});