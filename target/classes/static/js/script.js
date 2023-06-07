// $("#add").click(function (e) { 
//     e.preventDefault();
//     for (let index = 0; index < 5; index++) {
//            var div=$("<div></div>").html("<h3>hello<h3>");
//            div.addClass("add");
//            $("body").append(div);


//     }
// });
// $("#disab").click(function (e) { 
//     e.preventDefault();
//    $("#rough").attr("disabled","true")
// });

$(document).ready(function () {

  $(".main-1 h1").animate({

    fontSize: "80px",
   }, 1400)
  $(".main").fadeIn(500);
  $(".main").css("display", "flex");
  $("#message").addClass("show")
  $("#message").fadeIn(400);
  $("#message").animate({
    top: "1000px",
    left: "300px",
    fontSize: '20px'
  }, 1200);
  $("#message").css("border", "2px solid #faebd7");
  $("#message").css("padding", "10px");
  $("#message").css("border-radius", "50px")

});
$("#project").animate({
  
})

$(".nav").hover(function () {
  $(this).addClass(".card.show");


});

$(".top-1").click(function (){
   $(this).slideUp("3000");
   $(".inner-1").addClass("disp-toggle");
   
});
$(".inner-1").click(function (){
  $(".top-1").slideDown("3000");
  $(".inner-1").removeClass("disp-toggle");
});

$(".top-2").click(function (){
  $(this).slideUp("3000");
  $(".inner-2").addClass("disp-toggle");
  
});
$(".inner-2").click(function (){
  $(".top-2").slideDown("3000");
  $(".inner-2").removeClass("disp-toggle");
});

$("#light").click(function (e) { 
  e.preventDefault();

  $("body").toggleClass("themeMode");
  $("body *").toggleClass("ThemeFont");


  
 
});



















