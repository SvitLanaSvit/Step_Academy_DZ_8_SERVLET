<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 14.10.2023
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Numbers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="max-number-servlet" method="POST">
            <div class="mb-3 w-25">
                <label for="num1">Enter the first number:</label>
                <input type="number" class="form-control" id="num1" name="num1" required>
            </div>

            <div class="mb-3 w-25">
                <label for="num2">Enter the second number:</label>
                <input type="number" class="form-control" id="num2" name="num2" required>
            </div>

            <div class="mb-3 w-25">
                <label for="num3">Enter the third number:</label>
                <input type="number" class="form-control" id="num3" name="num3" required>
            </div>

            <div class="mb-3 w-25">
                <label>Select action:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="action" id="max" value="max" checked>
                    <label class="form-check-label" for="max">Maximum</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="action" id="min" value="min">
                    <label class="form-check-label" for="min">Minimum</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="action" id="avg" value="avg">
                    <label class="form-check-label" for="avg">Average</label>
                </div>
            </div>

            <div class="btn-group">
                <button type="submit" name="submit" class="btn btn-primary">Calculate Maximum</button>
            </div>
        </form>
    </div>
</body>
</html>
