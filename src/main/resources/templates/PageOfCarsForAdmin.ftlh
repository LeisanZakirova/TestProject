<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Список машин в наличии</h1>

<table>
    <tr>
        <th>Id</th>
        <th>brand</th>
        <th>color</th>
        <th>model</th>
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
</table>

<form action="/pageOfCarsForAdmin/pageForAddingCar" method="GET">
    <button type="submin">Добавить машину</button>
</form>

</body>
</html>