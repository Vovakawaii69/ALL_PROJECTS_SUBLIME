/* ====== События, связанные с мышью ==== */

$('button').click(function() {
	console.log('Ты кликнул на кнопку')
});

$('button').click(function() {
	console.log('Ты кликнул на кнопку дважды')
});

//$('ul li').mouseenter(function(event) {
//$(this).css('color', 'red');
//});

$('ul li').mouseenter(function(event) {
	$(this).css('color', 'red');
});

$('ul li').mouseenter(function(event) {
	$(this).css('color', '#333');
});

$('ul li').mouseenter(function(event) {
	$(this).css('color', 'blue');
});

$('ul li').mouseenter(function(event) {
	$(this).css('color', 'black');
});