<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Детальная информация о машине</title>

    <style>
        h1 {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 200px;
            width: 500px;
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
            height: 80px;
            width: 700px;
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
<h1 class = "h1">Детальная информация о машине</h1>

<table class = "table">
    <tr>
        <th>№</th>
        <th>brand</th>
        <th>color</th>
        <th>model</th>
        <th>Внести изменения</th>
        <th>Удалить</th>
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
