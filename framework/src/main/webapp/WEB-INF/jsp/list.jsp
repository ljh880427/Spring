<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>사용자 목록</title>
<link rel="icon" href="../../img/logo.png" type="image/x-icon">
<!-- <link href="../../lib/bootstrap@5.2.3/css/bootstrap.min.css" rel="stylesheet"> -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<style>
	.cursor-pointer {cursor: pointer;}
</style>
</head>
<body>
	<div class="container mt-3">
	  <h1 class="display-1 text-center">사용자 목록</h1>
	  <div class="btn-group">
	    <a href="/create" class="btn btn-primary">사용자 추가</a>
	  </div>
	  <table class="table table-hover mt-3">
	    <thead class="table-dark">
	      <tr>
	      	<th>이름</th>
	        <th>이메일</th>
	        <th>가입날짜</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr class="cursor-pointer" onclick="location.href = '/select';">
	        <td>스티븐</td>
	        <td>jobs@shellfolder.com</td>
	        <td>2023-02-28</td>
	      </tr>
	      <tr class="cursor-pointer" onclick="location.href = '/select';">
	        <td>에브릴</td>
	        <td>lavigne@shellfolder.com</td>
	        <td>2023-02-27</td>
	      </tr>
	    </tbody>
	  </table>
	</div>
</body>
</html>
