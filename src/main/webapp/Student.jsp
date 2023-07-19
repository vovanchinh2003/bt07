<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="BT_07_04.Student"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student</title>
</head>
<body>
    <h1>Student</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Họ tên</th>
            <th>Ngày sinh</th>
            <th>Số điện thoại</th>
            <th>Gioi tính</th>
        </tr>
        <% 
        List<Student> students = new ArrayList<>();
            for (Student student : students) {
        %>
        <tr>
            <td><%= student.getId() %></td>
            <td><%= student.getHoten() %></td>
            <td><%= student.getNgaysinh() %></td>
            <td><%= student.getDienthoai() %></td>
            <td><%= student.getGioitinh() %></td>
        </tr>
        <% 
            }
        %>
    </table>
</body>
</html>
