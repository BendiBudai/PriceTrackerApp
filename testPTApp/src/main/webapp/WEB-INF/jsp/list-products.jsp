<html>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <head>
    <title>Tracking Ppage</title>
    <link
      href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
      rel="stylesheet"/>
   
  </head>
  <body>
    <div class="container">
      <h1>Tracked products :</h1>
      <table class="table table-striped">
        <caption></caption>
        <thead>
          <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Last updated</th>
            <th>Link</th>
            <th>Stop Tracking</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${products}" var="product">
            <tr>
              <td>${product.name}</td>
              <td>${product.price}</td>
              <td>${product.lastCheck}</td>
              <td><a type="button" class="btn btn-success" href="${product.link}">GO TO STORE</a></td>
              <td><a type="button" class="btn btn-warning" href="/delete-product?ID=${product.ID}">STOP</a></td>
            </tr>
          </c:forEach>
        </tbody>
      </table>

    <div>
      <a class="button" href="/add-product">Add product</a>
    </div>
    <div class="container">
      <form  method="post">
        <label for="quantity">Update Products every </label>
        <input type="number" id="quantity" name="quantity" min="1" max="100" value="25">
        <label for="quantity">[minutes]</label>
        <input type="submit" id="update">
      </form>
    </div>
      <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
      <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>

    </div>
  </body>
</html>
