<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="calculator-servlet" method="POST">
            <div class="mb-3 w-25">
                <label for="num1">Enter first number:</label>
                <input type="number" class="form-control" id="num1" name="num1" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="num2">Enter second number:</label>
                <input type="number" class="form-control" id="num2" name="num2" required/>
            </div>

            <div class="mb-3 w-25">
                <label for="operation">Select operation:</label>
                <select id="operation" name="operation" class="form-select" aria-label="Select operation">
                    <option selected>Open this select menu</option>
                    <option value="add">Addition</option>
                    <option value="subtract">Subtraction</option>
                    <option value="multiply">Multiplication</option>
                    <option value="divide">Division</option>
                    <option value="pow">Exponentiation</option>
                    <option value="percentage">Percentage</option>
                </select>
            </div>

            <div class="btn-group" style="margin-bottom: 20px">
                <button type="submit" name="submit" class="btn btn-primary">Calculate</button>
            </div>
        </form>
    </div>
</body>
</html>
