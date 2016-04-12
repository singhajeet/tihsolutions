'use strict';

//Define the adaApp as module name and set the dependency on ngResource to call the REST services
var tihsApp = angular.module('tihsApp', []);

//Set View to navigate the user to different pages
tihsApp.config(function($routeProvider,$locationProvider) {
	alert("Hi");
	//$httpProvider.defaults.useXDomain = true;
	//delete $httpProvider.defaults.headers.common['X-Requested-With'];
	$locationProvider.html5mode(true);
	$routeProvider.when("/spring/resources", {
		templateUrl : "/spring/home/homePage.jsp"
	});

});