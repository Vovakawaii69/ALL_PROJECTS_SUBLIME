/* ======= События клавиатуры ====== */

$('input').keydown(function(event) {
	console.log($(this).val())
});

$('input').keyup(function(event) {
	$('p').text($(this).val())
});

$('input').keypress(function(eventObject) {
	console.log(eventObject.which)
});