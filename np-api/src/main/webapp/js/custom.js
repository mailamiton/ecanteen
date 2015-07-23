$(document).ready(function(){
$(".search-bar").click(function(){
$(".search-box").slideToggle();
});
// plan Box javascript	
$('.yrplan-catagory a').click(function(){
//$('.extendedPlan').hide();
$(this).parent().next('.extendedPlan').toggle();
$(this).html($(this).text() == '-' ? '+' : '-');
//alert("d");
});			

// radio button: start
$('.myradio').click(function(){
$('.myradio').find(".like_red").removeAttr("checked");
$('.myradio').css('background-position', '0 0px');	
$(this).css('background-position', '0 -15px');
$(this).find('.like_red').attr("checked", "checked");
});


$('.myradio1').click(function(){
$('.myradio1').find(".like_red").removeAttr("checked");
$('.myradio1').css('background-position', '0 0px');	
$(this).css('background-position', '0 -15px');
$(this).find('.like_red').attr("checked", "checked");
});


$('.myradio2').click(function(){
$('.myradio2').find(".like_red").removeAttr("checked");
$('.myradio2').css('background-position', '0 0px');	
$(this).css('background-position', '0 -17px');
$(this).find('.like_red').attr("checked", "checked");
});



// radio button: end

// jquery tab2: start
$('.prm_tab_box > ul > li').click(function(){
var prm_ctr = $(this).index();
$('.prm_tab_box > ul > li').removeClass('prm_act');
$(this).addClass('prm_act');
$('.prm_tab_conts').hide();
$('.prm_tab_conts').eq(prm_ctr).show();
});
// jquery tab2: end


// check box: start
function my_checkbox(id){
$(id).click(function(){
//$(id).find(".like_red").removeAttr("checked");
//$(id).css('background-position', '0 0px');
$(this).toggleClass('backa');
$(this).find('.like_red').attr("checked", "checked");
});
}
$(document).ready(function() {
my_checkbox('.mycheckbox');
});
// check box: end

// thumbnail: start
$("[rel='tooltip']").tooltip();    
$('.thumbnail').hover(
function(){
$(this).find('.caption').slideDown(250); //.fadeIn(250)
},
function(){
$(this).find('.caption').slideUp(250); //.fadeOut(205)
}
); 

$('.fa-mail-forward').click(function()
{
$(this).parent().parent().parent().parent().next().find('.socialmedia1').toggle();
$(this).parent().parent().parent().parent().next().find('.circlertmargin').toggle();
});

$('.deleteBx').hide();
$(".wishlistplus a").click(function(){
//alert('test');
$('.deleteBx').slideToggle();
});
//close function
$(document).on('click','.close1',function() {
$('.deleteBx').slideToggle();
});

$('.nav-tabs1 > li p').hide();
$('.nav-tabs1 > li > a').click (function() {
$(this).parent().nextAll().find('p').hide();
$(this).parent().prevAll().find('p').hide();
$(this).next().toggle();
});



$('.deleteBx1').hide();
$('.deleteshortlist').click(function()
{
$(this).next().slideToggle();
});

$('.close2').click(function()
{
$(this).parent().slideUp();
});





// thumbnail: end





});
