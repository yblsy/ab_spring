<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<body>
<h2>文件上传实例</h2>


<form action="fileUpload/fileUpload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file">
    <input type="submit" value="提交">
</form>


</body>
</html>
