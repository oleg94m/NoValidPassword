$(function() {
    // Load groups
    $.get("/doctor", function(groups) {
        var groupList = $("#group-list");
        groupList.empty();
        groupList.append("<li><a href='/'>Default</a></li>");
        for (var i = 0; i < groups.length; i++) {
            var group = groups[i];
            groupList.append("<li><a href='/doctor/" + group.id + "'>" + group.name + "</a></li>");
        }
    });

    // Load contacts
    var currentPage = 0;
    var pageSize = 10;

    function loadContacts(page) {
        $.get("/patients?page=" + page + "&size=" + pageSize, function(data) {
            var contactList = $("#patients");
            contactList.empty();
            for (var i = 0; i < data.content.length; i++) {
                var patients = data.content[i];
                var DoctorName = contact.doctor ? patients.doctor.firstName : "Default";
                contactList.append("<tr>" +
                    "<td><input type='checkbox' name='toDelete[]' value='" + patients.id + "' id='checkbox_" + patients.id + "'/></td>" +
                    "<td>" + contact.firstName + "</td>" +
                    "<td>" + contact. + "</td>" +
                    "<td>" + contact.phone + "</td>" +
                    "<td>" + contact.email + "</td