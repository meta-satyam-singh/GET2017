function redirect() 
{
    window.location="page.html";
}
function redirectToContact()
{
	window.location="Contacts.html";
}
function validateForm()
{
 	var x=document.getElementById("name");
 	var namepattern = /^([a-zA-Z]|\s)*$/;

 	if (!namepattern.test(x.value) || x.value=="")
 	{
    	alert("name should contain only alphabets.");
 		x.value="";
  		x.focus();
  		return false;
 	}
 	var emailpattern = /\S+@\S+\.\S+/ ;
	x=document.getElementById("email");
 	if(!emailpattern.test(x.value))
 	{
  		alert("Invalid email id.");
  		x.value="";
  		x.focus();
  		return false;
 	}
 	validateSelect();
 	var phoneno = /^\d{10}$/;
 	x=document.getElementById("contact");
 	if(!phoneno.test(x.value))
 	{
 		alert("Invalid no .");
  		x.value="";
  		x.focus();
 	}
 	var orgReg = /[a-zA-Z]+\.\S.\S+/;
 	x=document.getElementById("orgName");
 	if(!orgReg.test(x.value) || x.value=="")
 	{
 		alert("Invalid orgName ");
  		x.value="";
  		x.focus();
 	}
 	var message = document.getElementById("Message");
 	if(!message.value == "" || message.length > 250)
 	{
 		alert("Invalid message");
  		x.value="";
  		x.focus();
 	}
 }
 function validateSelect()
 {
 	var x =document.getElementById("select");
 	if (x.value=="Choose here") 
 	{
    	alert("Please make a selection");
        x.focus();
    }
    else
    {
    	var y = document.getElementById("textField");
    	y.defaultValue = x.value;
    	document.getElementById('textField').style.visibility='visible';
		document.getElementById('City').style.visibility='visible';
    }
 }