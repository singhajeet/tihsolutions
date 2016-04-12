<html data-ng-app="tihsApp">
<head>
	<spring:url value="/resources/static/js/angularJS/angular.min.js" var="angularMinJs" />
	<spring:url value="/resources/static/js/angularJS/angular-resource.min.js" var="angularResourceJs" />
	<spring:url value="/resources/static/js/angularJS/angular-route.min.js" var="angularRouteJs" />
	
	<spring:url value="/resources/static/js/tihsJS/tihsApp-global.js" var="tihsAppJs" />
	<spring:url value="/resources/static/js/tihsJS/tihsApp-homePage-controllers.js" var="tihsAppHomePageContrJs" />
    
   
    <script src="${angularMinJs}"></script>
    <script src="${angularResourceJs}"></script>
    <script src="${angularRouteJs}"></script>
    <script src="${appJs}"></script>
    <script src="${tihsAppHomePageContrJs}"></script>
</head>
<body>
	<h1>Helloooooo</h1>
	<data-ng-view></data-ng-view>
</body>

</html>