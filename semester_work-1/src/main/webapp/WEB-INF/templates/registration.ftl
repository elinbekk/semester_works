<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="styles/reg.css">
</head>
<body>
<div class="container">
    <form class="form-center-content" method="post" action="registration">
        <div class="form-signin-heading">Регистрация</div>
        <label>
            <input class="form-control" name="email" type="email" placeholder="ваш email">
        </label>
        <label>
            <input class="form-control" name="name" type="text" placeholder="ваше имя">
        </label>
        <label>
            <input class="form-control" name="lastName" type="text" placeholder="ваша фамилия">
        </label>
        <label>
            <input class="form-control" name="password" type="password" placeholder="ваш пароль">
        </label>
        <input class="login-button" type="submit" value="Зарегистрироваться">
    </form>
    <form action="auth"><input class="auth-button" type="submit" value="У меня уже есть аккаунт"></form>
</div>
</body>
</html>