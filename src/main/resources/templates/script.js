
    console.log("djhbd");

    function loginFunc() {
    let data={
            "username": document.getElementById("username").value,
            "password": document.getElementById("password").value
    }

    console.log(JSON.stringify(data))
    fetch('http://localhost:8080/login', {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    }).then(
        response => response.json() //.text() // .json(), etc.
        // same as function(response) {return response.text();}
    ).then(
        html => console.log(html)
    );
}
