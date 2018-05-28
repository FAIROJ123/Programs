function loginvalidation(){
	var uname=document.myform.name.value;
	var password=document.myform.password.value;
	if ( uname == ""||password == "")
	{
		
	    window.alert("Enter your username&password...!");
	    return false;
	    
	 }
	else{
		
		
		return true;
	}
}