
function nameValidator(name) {
    if (name.length == 0) {
        $("#name-error").text("* Name cannot be empty");
        $("#name-error").css("color", "red");
        return false;
    }
    else {
        $("#name-error").text("");
    }
    return true;
}


function helo(data){
	console.log(data);
}


function ageValidator(Age) {

    age = parseInt(Age);

    if (Age.length == 0) {
        $("#age-error").text("* Age cannot be empty");
        $("#age-error").css("color", "red");

        return false;
    }
    else {
        $("#age-error").text("");
    }
    if (age >= 80 || age <= 0) {
        //check if age is a number or less than or greater than 100
        $("#age-error").text("* Enter a valid age");
        return false;

    }
    else {
        $("#age-error").text("");
        return true
    }
}
  

$("#submit").click(async function (e) {
    e.preventDefault();
    var data = $('#contact-form').serialize();
    let arr = data.split("&");
    var arrmain = new Array();
    var i = 0;
    arr.forEach(element => {
        let dummy = element.split("=");
        let dummyMain = new Array(dummy);
       
        arrmain[i] = dummyMain[0][1];
        i++;
    });
    console.log(arrmain);
    checkName = await nameValidator(arrmain[0]);
    checkAge = await ageValidator(arrmain[1]);
    if(checkName && checkAge){
         var Data=JSON.stringify({
			userName:arrmain[0],
			gmail:arrmain[2],
			age:arrmain[1],
			description:arrmain[3]
		})
		CallRequest(Data);
		
	 }
})
    
    //checkGmail=await ValidateEmail(arrmain[2]);
   // console.log(checkAge);
    // checkEmail=await emailValidator(arr[2]);
    
    
  $("#getall").click(function(e){
	  url="http://localhost:7070/allqueries";
	  $.ajax({
		  method:"GET",url})
	  .done(function(response){
		  console.log(response);
	  })
  })
    
    //--
    
    function CallRequest(ans){	
   $.ajaxSetup({
	headers:{
		'X-CSRF-TOKEN':$('meta[name="csrf-token"]').attr('content'),
	     "Content-Type": 'application/json'
	}
	 });
    $.post("http://localhost:7070/add",ans,function(data){
		console.log(data);
		$("#contact-form")[0].reset();
		$("fieldset").attr("disabled",true);
		$("fieldset").css("opacity","0.5")
		$(".back-home").css("display","block")
		$("#back-link").css("display","block")
		$("#back-msg").css("color","black")
		$("#back-msg").text(data);
		$("contact-form").attr("disabled")
		
	})
}

	
   
   