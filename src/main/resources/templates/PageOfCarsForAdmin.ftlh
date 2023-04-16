<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Page of cars for Admin</title>

    <style>
        h1 {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 600px;
            width: 380px;
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            margin: auto;
        }

        table {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 500px;
            width: 800px;
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
<h1 class = "h1">Список машин в наличии</h1>

<table class = "table">
    <tr>
        <th>№</th>
        <th>brand</th>
        <th>color</th>
        <th>model</th>
        <th>Узнать о машине подробнее</th>
    </tr>
    <#list cars as car>
        <tr>
            <th>${car.id}</th>
            <th>${car.brand}</th>
            <th>${car.model}</th>
            <th>${car.color}</th>
            <th>
                <form action="/pageOfCarsForAdmin/${car.id}" method="GET">
                    <button type="submit">Детальная информация</button>
                </form>
            </th>
        </tr>
    </#list>
    <tr>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th>
            <form action="/pageOfCarsForAdmin/pageForAddingCar" method="GET">
                <button type="submin">Добавить машину</button>
            </form>
        </th>
    </tr>
</table>

</body>
</html>