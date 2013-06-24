<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
<script language="Javascript" type="text/javascript">
var xmlHttp;

function callSyn(){
	if (typeof XMLHttpRequest != "undefined"){
		xmlHttp= new XMLHttpRequest();
		}
		else if (window.ActiveXObject){
		xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
		}
		if (xmlHttp==null){
		alert("Browser does not support XMLHTTP Request")
		return;
		} 
	//alert(str1);
	var url="service";
	//alert(url);
	xmlHttp.onreadystatechange = displayOutput;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
	}

	function displayOutput(){   
	if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
	//	alert(xmlHttp.responseText+" hxhhh");
	document.getElementById('output').innerHTML=xmlHttp.responseText;   
	}   
	}

function callAsyn(){
	if (typeof XMLHttpRequest != "undefined"){
		xmlHttp= new XMLHttpRequest();
		}
		else if (window.ActiveXObject){
		xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
		}
		if (xmlHttp==null){
		alert("Browser does not support XMLHTTP Request")
		return;
		} 
	var url="serviceAsyn";
	//alert(url);
	xmlHttp.onreadystatechange = displayOut;
	xmlHttp.open("GET", url, true);
	xmlHttp.send(null);
	}

	function displayOut(){   
	if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){
	//	alert(xmlHttp.responseText+" hxhhh");
	document.getElementById('output1').innerHTML=xmlHttp.responseText;   
	}   
	}

</script>
</head>
<br>
<body>

 <form>     
<table>
<tr>    <td>Operation Name:</td>
  
   <td>OP11</td>
</tr>                 <tr>
                 <td>
                  <div id='output'>    </div>
	<input type="button" value="Invoke Synchronus" onclick="callSyn()"  />
	  <div id='output1'>    </div>
	<input type="button" value="Invoke Asynchronus" onclick="callAsyn()"  />
                    
                    </td>
                    </tr>
                     
                      
</table>
</form> 
 
</body>
</html>