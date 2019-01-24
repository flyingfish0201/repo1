<%--
  Created by IntelliJ IDEA.
  User: 。。。。。。
  Date: 2019/1/17
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
    $(function () {
        $("#btn").click(function () {
            $.ajax({
                url:"account/testAjax",
                contentType:"application/json;charset=UTF-8",
                data:'{"id":1,"name":"小明","money":1000}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    alert(data.id);
                    alert(data.name);
                    alert(data.money);
                }
            })
        })
    })
    </script>


</head>
<body>

<button id="btn">我是一个按钮</button>
</body>
</html>
