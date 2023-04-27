<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    >
    <meta charset="UTF-8">
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Descricao</th>
        <th>Data</th>
        <th>Valor</th>
        <th>Categoria</th>
    </tr>

<tr>
    <td>despesa.getDescricao()</td>
    <td>despesa.getData()</td>
    <td>despesa.getValor()</td>
    <td>despesa.getCategoria()</td>
</tr>

</table>
</body>
</html>
