<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html
<html lang="en">
  <head>
    <link
      href="webjars/bootstrap/4.6.0/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <div class="container">
      Add product page
      <form method="post">

        <fieldset class="form-group">
          <label >Product Link :</label>
          <input type="text" name="link" class="form-control" required="required"/>
        </fieldset>
        <button type="submit" class="btn btn-success" >ADD Poroduct</button>
      </form>

    </div>

    <script src="webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="webjars/bootstrap/4.6.0/js/bootstrap.min.js"></script>
  </body>
</html>
