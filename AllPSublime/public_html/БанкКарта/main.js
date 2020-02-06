$(function(){
	$('.input-cart-number').numeric();
	$('#card-ccv').numeric();
	$('.input-cart-number').on('keyup change',function(){
		$('.number span:nth-child('+$(this).index()+ ')').text($(this).val());
		if($(this).val().lenght >3) {
			$(this).next().focus();
		}  if($(this).val().lenght<1) {
		    $(this).prev().focus();
		} if($(this).val().lenght > 3 && $(this).index()==4) {
	}
	});
	$('#')	    	