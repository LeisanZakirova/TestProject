<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Редактирование информации о машине</title>

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
<div class="block">
    <h1 class="h1">Редактирование информации</h1>

    <form method="POST" class="table">
        <input class="input1" type=text" name="brand" placeholder="Введите название бренда">
        <input class="input2" type=text" name="model" placeholder="Введите название модели">
        <input class="input3" type=text" name="color" placeholder="Введите название цвета">
        <button class="button" type="submit">Обновить данные о машине</button>
    </form>
</div>
</body>
</html>

<style>
    .block {
        height: 350px;
        width: 350px;
        position: absolute;
        top: 0;
        left: 0;
        right: 0;
        bottom: 0;
        margin: auto;
    }

    .input1 {
        width: 300px;
        margin: 5px;
    }
    .input2 {
        width: 300px;
        margin: 5px;
    }
    .input3 {
        width: 300px;
        margin: 5px;
    }
    .button {
        width: 250px;
        margin: 5px;
    }
</style>