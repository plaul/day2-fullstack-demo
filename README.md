Simple project using the suggested third semester architecture

Compare with the project we did day-1 (MVC)

Create an index.html file "somewhere" on you computer and paste in the code below to act as our frontend

```
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>All Students</h1>
<div>
<p id="count"></p>
<button id="btn">Fetch students</button>
<ul id="ul">
</ul>
</div>
<script>
function getStudents() {
  fetch("http://localhost:8080/api/students")
   .then(r => r.json())
   .then(data => {
const lis = data.map(s => `<li>${s.fullStudentName}</li>`)
const lisStr = lis.join("\n")
//WARNING XSS
document.getElementById("ul").innerHTML=lisStr
})
}
document.getElementById("btn").onclick=getStudents
</script>
</body>
</html>
```