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


 /*
 	x=document.form1.contctno;
 	if(x.value=="")
 	{
 		alert("Please enter the Contact number.");
 		x.value="";
  		x.focus();
  		return false;
 	}
 	else if(isNaN(x.value))
 	{
  		alert("Contact number should contain only digits.");
  		x.value="";
  		x.focus();
  		return false;
 	}
 	else if(x.value.length!=10)
 	{
  		alert("Contact number should contain only 10 digits.(Mobile number)");
  		x.value="";
  		x.focus();
  		return false;
 	}
 	else if(!phonepattern.test(x.value))
 	{
  		alert("Invalid Contact number.");
  		x.value="";
  		x.focus();
  		return false;
 	}






}
/*
 if((document.form1.gender[0].checked==false)&&(document.form1.gender[1].checked==false))
 {
  document.form1.gender[0].focus();
  alert("Please select a gender.");
  return false;
 }
 var dd=document.form1.dd.value;
 var mmm=document.form1.mmm.value;
 var yyyy=document.form1.yyyy.value;
 if(!validdate(dd,mmm,yyyy))
 {
  return false;
 }
  
 x= document.getElementById("address");
 if(x.value==null || x.value=="" )
 {
  alert("Please enter the Address.");
  x.value="";
  x.focus();
  return false;
 }
 else if(x.value.length<20)
   {
  alert("Address should be greater than 20 characters.");
  x.value="";
  x.focus();
  return false;
 }

 x=document.form1.contctno;
 if(x.value=="")
 {
  alert("Please enter the Contact number.");
  x.value="";
  x.focus();
  return false;
 }
 else if(isNaN(x.value))
 {
  alert("Contact number should contain only digits.");
  x.value="";
  x.focus();
  return false;
 }
 else if(x.value.length!=10)
 {
  alert("Contact number should contain only 10 digits.(Mobile number)");
  x.value="";
  x.focus();
  return false;
 }
 else if(!phonepattern.test(x.value))
 {
  alert("Invalid Contact number.");
  x.value="";
  x.focus();
  return false;
 }

 

 if(confirm("Do you want to submit the form?"))
{
alert("Registration Form Submitted Successfully.");
}
else
return false;

}

 
 function confirmreset()
 {
  return confirm("Do you want to reset the form?");
 }*/