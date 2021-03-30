<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %> <!-- 자바의 import문처럼 타일즈를 사용하기위해 반드시 추가 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!-- 공통변수 처리 -->
<c:set var="CONTEXT_PATH" value="${pageContext.request.contextPath}" scope="application"/>


<!-- JAVA웹 프로그램에서의 현재 프로젝트 경로를 ContextPath라고 한다. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript">
	var CONTEXT_PATH = "${CONTEXT_PATH}";
	
</script>
<link rel="stylesheet" href="${CONTEXT_PATH}/resouces/css/common.css">
<title><tiles:insertAttribute name="title" /></title> 
<!-- tiles_product.xml의 <definition>의 하위 태그인 <put-attribute> 태그의 name이 title인 값(value)를 표시 -->
</head>
<body>
    <!-- 전체를 감싸는 태그-->
    <div id="page-wrappger">
        <!-- 헤더 -->
 	<header id ="main-header"> 
        <tiles:insertAttribute name="header" />
    </header>
           

        <!--본문-->
        <div id="content">
       <tiles:insertAttribute name="body" />
        </div>
        <!--푸터-->
      <footer id="main-footer">
        <tiles:insertAttribute name="footer" />
	  </footer>
    </div>

</body>
</html>