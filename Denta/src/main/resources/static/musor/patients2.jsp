
<html>
<meta charset="UTF-8">
<head>
    <title>Карта клієнта</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul id="groupList" class="nav navbar-nav">
                    <li><button type="button" id="create_patients" class="btn btn-default navbar-btn">Add patients</button></li>
                    <li><button type="button" id="delete_patients" class="btn btn-default navbar-btn">Delete patients</button></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">doctor <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <c:forEach items="${doctor}" var="doctor">
                                <li><a href="/group/${doctor.id}">${doctor.name}</a></li>
                            </c:forEach>
                        </ul>
                    </li>
                </ul>
                <form class="navbar-form navbar-left" role="search" action="/search" method="post">
                    <div class="form-group">
                        <input type="text" class="form-control" name="pattern" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <table class="table table-striped">
        <thead>
        <tr>
            <td></td>
            <th scope="col">Прізвище</th>
            <th scope="col">Ім'я</th>
            <th scope="col">Прізвище</th>
            <th scope="col">Телефон</th>
            <th scope="col">Захворювання</th>
            <th scope="col">Супутні захворювання</th>
            <th scope="col">Алергія</th>
            <th scope="col">Медикаменти</th>
            <th scope="col">Скарги</th>
        </tr>
        </thead>
        <c:forEach items="${patients}" var="patients">
        <tr>
            <td><input type="checkbox" name="toDelete[]" value="<${patients.id}>" id="checkbox_<${patients.id}>"/></td>
            <td th:text="${patients.lastName}"></td>
            <td th:text="${patients.firstName}"></td>
            <td th:text="${patients.midlName}"></td>
            <td th:text="${patients.phone}"></td>
            <td th:text="${patients.pastConditions}"></td>
            <td th:text="${patients.relatedConditions}"></td>
            <td th:text="${patients.allergies}"></td>
            <td th:text="${patients.medications}"></td>
            <td th:text="${patients.complaints}"></td>

            <c:choose>
                <c:when test="${patients.doctor ne null}">
                    <td>${patients.doctor.name}</td>
                </c:when>
                <c:otherwise>
                    <td>masiuk</td>
                    <td>other</td>
                    <td>lavet</td>
                </c:otherwise>
            </c:choose>
        </tr>
        </c:forEach>
    </table>

    <nav aria-label="Page navigation">
        <ul class="pagination">
            <c:forEach var="i" begin="1" end="${pages}">
                <li><a href="/?page=<c:out value="/></a></li>
            </c:forEach>
        </ul>
    </nav>
</div>

<script>
    $('.dropdown-toggle').dropdown();

    $('#create_patients').click(function(){
        window.location.href='/create_patients';
    });

    $('#delete_patients').click(function(){
        var data = { 'toDelete[]' : []};
        $(":checked").each(function() {
            data['toDelete[]'].push($(this).val());
        });
        $.post("/patients/delete", data, function(data, status) {
            window.location.reload();
        });
    });
</script>
</body>
</html>