//Базовые селекторы

$('#id')//обращение по идентификатору(id)элемент 1.
$('.class')// обращение по классу
$('div')//обращение по тегу
$('*')//обращение по всем элементам


///взаимодействия с элементами

$('h2, p')///перваый второй третий и тд
$('h2 span')///outer u inner
$('h2 >span')///parent>third
$('h2 + p')///prev + next
$('h2 ~ p').css('border','2px solid #000');///prev ~ next



////взаимодействие с элементами по атрибутам

$('a[download]').css('border','1px solid red');
$('a[href="http:ya.ru"]').css('border','1px solid red');
$('a[href!="http:ya.ru"]').css('border','1px solid red');
$('a[href^="http"]').css('border','1px solid red');
$('a[href$=".com"]').css('border','1px solid red');
$('a[href*="google"]').css('border','1px solid red');
$('a[data-target|="main"]').css('border','1px solid red');
$('a[href][download]').css('border','1px solid red');


///////Фильтры

//$('p:firśt').css('barder','1px solid red');
//$('p:last').csscss('barder','1px solid red');
//$('a:eq(2)').csscss('barder','1px solid red');
//$('*:not(h2,p)').css('barder','1px solid red');
//$('li:odd')css('barder','1px solid red');
//$('li:even')css('barder','1px solid red');
//$('li:gt(0)')css('barder','1px solid red');
//$('li:lt(3)')css('barder','1px solid red');
//$('*:header')css('barder','1px solid red');
//$('li:animated')css('barder','1px solid red');
//$('li:hidden')css('barder','1px solid red');
//$('li:visible')css('barder','1px solid red');
//$('li:lang(ru)')css('barder','1px solid red');
