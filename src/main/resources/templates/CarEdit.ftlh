<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Редактирование информации о машине</title>
</head>
<body>
<div class="block">
    <h1>Редактирование информации о машине</h1>

    <form method="POST">
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