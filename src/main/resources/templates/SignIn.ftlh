<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SignIn</title>
</head>
<body>
<div class="block1" >
    <h1 >Sign In Page</h1>
    <h2>Please Enter your data:</h2>
    <form method="post">
        <label for="email">Enter email:</label>
        <input type="email" id="email" name="email" placeholder="Your email">
        <br>
        <label for="password">Enter password:</label>
        <input type="password" id="password" name="password" placeholder="Your password">
        <input type="submit" value="Sign In">
    </form>
</div>
</body>
</html>

<style>
    .block1 {
        height: 350px;
        width: 350px;
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        margin: auto;
    }
</style>