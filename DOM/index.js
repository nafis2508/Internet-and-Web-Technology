
   /*
    alert("Muntasir hey");
    document.write("I love Bangladesh");
    console.log("let's get started");

    document.write("Name :Muntasir Md Nafis <br/>");
    document.write("Preferrable Language : Java <br/>" );
    */
    //var Name = "Yo" ;
    //alert(Name) ;
    // according to the lecture vdo of Sam3 
    //const body = document.body ;
    //alternate to code of line 13 
    //const div = document.querySelector("div") ;//used for selecting any tags
    //console.log(div.textContent) ; //shows us all the elements in the documentbody
    //console.log(div.innerText) ; //shows us the elements which are only shown to us 
   // body.append("henlo! Do you speak English ?") ;
   // const grid = document.createElement("div") ;
    //grid.textContent = "Nafis is a chill guy" ;
    //grid.innerText = "What's up people! " ;
    //body.append(grid) ;
    //onload="alert('Hello');" inline js 
    //two different implementations 
   // const body = document.body ;
    //const div = document.createElement("div") ;
   // div.innerText = "Are you guys going to USA soon ? " ;
   // body.append(div) ;
    //div.innerHTML - "<h1> aloha mora </h1>" ;
   // body.append(div) ;
    // for the two spans in the div
    const body = document.body ;
    const div =  document.querySelector("div") ;
    const spanon =  document.querySelector("#on") ;
    const spanout =  document.querySelector("#out") ;
    spanon.remove();
    console.log(spanon.id); //shows the id of the spanon 
  //  console.log(spanon.title) ; // shows the title of the  spanon 
  //  console.log(spanon.setAttribute("title", "bye bye title")) ;//changes the attribute title in the document of the console ssection
    spanout.removeAttribute("id") ;
    spanout.removeAttribute("color");
    spanout.classList.add("classesareon") ;
    spanout.style.color = "blue" ; 