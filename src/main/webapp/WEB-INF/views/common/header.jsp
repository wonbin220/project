<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="RESOURCES_PATH" value="${CONTEXT_PATH}/resources" scope="application"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상단부</title>
<script type="text/javascript">
var CONTEXT_PATH = "${CONTEXT_PATH}";
var RESOURCES_PATH = "${RESOURCES_PATH}";
</script>
</head>
<body>
 
	  <div id=companylogo> 
		<a href="${contextPath}/main.jsp">
		<img src="${RESOURCES_PATH}/image/logo_sample2.png }" />
		</a>
	  </div>
	            
	        <!--네비게이션-->
	        <nav id ="main-navigation">
	            <div class="main-menu">
	                <ul class="main-category">
	                    <li class="menu-category"><a href="/main.html"></a>
	                        <span class="menu-title">Home</span>
	                    </li>
	                    <li class="menu-category"><a href="/company.html"></a>
	                        <span class="menu-title">Company</span>
	                    </li>
	                    <li class="menu-category"><a href="/product.html"></a>
	                        <span class="menu-title">Product</span>
	                    </li>
	                    <li class="menu-category"><a href="/contact.html"></a>
	                        <span class="menu-title">Contact</span>
	                    </li>
	                </ul>
	            </div>
	        </nav>
	
</body>
</html>