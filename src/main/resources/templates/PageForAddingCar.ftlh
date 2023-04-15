<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Введите данные для машины</h1>
<form action="/pageOfCarsForAdmin/pageForAddingCar" method="POST">
    <label for="brand">Enter brand:</label>
    <input id="brand" name="brand" placeholder="brand of car">
    <br>
    <label for="model">Enter model:</label>
    <input id="model" name="model" placeholder="model of car">
    <br>
    <label for="color">Enter color:</label>
    <input id="color" name="color" placeholder="color of car">
    <br>
    <input type="submit" value="Add">
</form>

</body>
</html>
