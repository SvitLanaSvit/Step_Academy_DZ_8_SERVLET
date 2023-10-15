<%--
  Created by IntelliJ IDEA.
  User: Svitlana
  Date: 15.10.2023
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Text input</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <form action="text-servlet" method="POST">
            <div class="mb-3 w-25">
                <label for="textInput">Enter text:</label>
                <textarea class="form-control" id="textInput" name="textInput" rows="4" required></textarea>
            </div>

            <div class="btn-group">
                <button type="submit" name="submit" class="btn btn-primary">Analyze Text</button>
            </div>
        </form>
    </div>
</body>
</html>
