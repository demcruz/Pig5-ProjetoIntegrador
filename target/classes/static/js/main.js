/**
 * 
 */



$(document).ready(function(){
	
	$('.nBtn, table, .eBtn ').on('click' , function(e){
			e.preventDefault();
			var href = $(this).attr('href');
			var text = $(this).text();
			$.get(href, function(nome tal tal){
				
				
			})
}
	
})