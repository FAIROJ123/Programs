
function validation(){  
var name=document.myform.name.value;
var uname=document.myform.username.value;
var password=document.myform.password.value;  
var pon=document.myform.phoneNumber.value;
  
if (name == ""&& uname == ""&& password == "" && pon == "")
{
    window.alert("Required all feilds...!!!");
    return false;
}

else{
	return true;
}

}  