<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Изменение данных о машине</title>

    <style>
        h1 {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 400px;
            width: 250px;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            margin: auto;
        }

        .table {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 250px;
            width: 250px;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            margin: auto;
        }

        td, th {
            border: 1px solid #A9A9A9;
            text-align: left;
            padding: 8px;
            font-weight: normal;
        }

        tr:nth-child(even) {
            background-color: #F5F5F5;
        }
    </style>

</head>
<body>
<h1 class = "h1">Введите данные</h1>
<form action="/pageOfCarsForAdmin/pageForAddingCar" method="POST" class = "table">
    <label for="brand">Enter brand:</label>
    <input id="brand" name="brand" placeholder="brand of car">
    <br>
    <label for="model">Enter model:</label>
    <input id="model" name="model" placeholder="model of car">
    <br>
    <label for="color">Enter color:</label>
    <input id="color" name="color" placeholder="color of car">
    <br>
    <input type="submit" value="Добавить данные">
</form>

</body>
</html>
