<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>登录</title>
</head>
<body>
<form action="/login" method="post">
    <input type="text" name="name">请输入登录名</input>
    <input type="password" name="pticket">请输入密码</input>
    <input type="submit"></input>
    <span>${message}</span>
</form>
</body>

</html>