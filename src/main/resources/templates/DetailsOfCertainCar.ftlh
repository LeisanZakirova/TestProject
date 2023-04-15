<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Детальная информация о машине</title>
</head>
<body>
<h1>Детальная информация о машине</h1>

<table>
    <tr>
        <th>Id</th>
        <th>brand</th>
        <th>color</th>
        <th>model</th>
    </tr>
    <#list CarsForDetails as cars>
        <tr>
            <th>${cars.id}</th>
            <th>${cars.brand}</th>
            <th>${cars.color}</th>
            <th>${cars.model}</th>
            <th>
                <form action="/pageOfCarsForAdmin/${cars.id}/edit" method="GET">
                    <button type="submit">Внести изменения</button>
                </form>
            </th>
            <th>
                <form action="/pageOfCarsForAdmin/${cars.id}/delete" method="POST">
                    <button type="submit">Удалить</button>
                </form>
            </th>
        </tr>
    </#list>
</table>


</body>
</html>
