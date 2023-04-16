<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SignUp</title>
</head>
<body>
<div class="block1" >
    <h1>Page for User</h1>

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
                </th>
            </tr>
        </#list>
    </table>

</div>
</body>
</html>