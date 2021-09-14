var form =document.getElementById("myForm")


form.addEventListener('submit', function (e) {
    e.preventDefault()
    var search=document.getElementById("search").value
    var originalName=search.split(' ').join('')
    document.getElementById("result").innerHTML=""
    fetch( "https://api.github.com/users/"+originalName)
        .then((result) =>result.json())
        .then((data) =>{
            console.log(data)
            document.getElementById("result").innerHTML=`
            Name of the user : ${data.name}
            <br>
            The ID of the user :${data.id}
            <br>
            Profile Picture:
            <br>
            <img src="${data.avatar_url}"/> 
            <br> 
            Link=<a target="_blank"  href="https://www.github.com/${originalName}"> link for user Account </a>
           
            `
        })

})