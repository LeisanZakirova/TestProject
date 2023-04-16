<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>PageForUser</title>
    <style>
        h1 {
            font-family: serif, "Times New Roman", sans-serif;
            font-style: normal;
            height: 450px;
            width: 200px;
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
            height: 350px;
            width: 350px;
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
<div class="block1" >
    <h1 class = "h1">Page for User</h1>

    <table class="table">
        <tr>
            <th>№</th>
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
            </tr>
        </#list>
    </table>

</div>
</body>
</html>