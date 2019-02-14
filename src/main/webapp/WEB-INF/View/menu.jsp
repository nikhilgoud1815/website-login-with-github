<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div style="border: 1px solid #ccc; padding: 5px; margin-bottom: 20px;">

	<!-- <h2></h2> -->
	<h3 style="color: red;" align="center">
		<a href="${pageContext.request.contextPath}/">Home</a> | &nbsp;
		<button onClick="logout()" >Logout</button>
		<script>
		
		$.get("/user", function(data) {
			$("#user").html(data.userAuthentication.details.name);
			$(".unauthenticated").hide()
			$(".authenticated").show()
		});
		var logout = function() {
			$.post("/logout", function() {
				$("#user").html('');
				 window.open("http:/www.github.com/logout") 
				$(".unauthenticated").show();
				$(".authenticated").hide();
			});
			return true;
		}
	</script>
	</h3>

	<form id="logoutForm" method="POST" action="${contextPath}/logout">
	</form>

</div>