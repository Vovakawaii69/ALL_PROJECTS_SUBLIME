//Старый способ
let name = "Ivan",
	age = 30,
	mail = "ex@mail.ru";

	document.write('Пользователю ' +name + ' ' + age + ' лет. Его почтовый адрес: ' + mail);

//Интерполяция (ES6)
let name = "Ivan",
	age = 30,
	mail = "ex@mail.ru";

	document.write(`Пользователю ${name} ${age} лет. Его почтовый адрес: ${mail}`);

//let

function varTest() {
	var x = 1;
	if (true) {
		var x = 2;
		console.log(x);
	}
	console.log(x);
}

function letTest() {
	let x = 1;
	if (true) {
		let x 2;
		console.log(x);
	}
	console.log(x);
}

//Примечание: Идентификаторы констант могут быть объявлены как в верхнем,
// так и в нижнем регистре. Но правилом хорошего тона ялвяется использование
// верхнго регистра.

// определим MY_FAV как константу и присвоим ей значение 7
const MY_FAV = 7;

// Данное присваивание выдаст ошибку - Uncaught TypeError: Assignment to constant variable.
MY_FAV = 20;

// напечатает 7
console.log("my favorite number is" + MY_FAV);

// попробуем переопределить константу, будет брошено исключение - Uncaught SyntaxError
const MY_FAV = 20;

// имя MY_FAV зарезервированно константой выше, данная операция
// выкинет исключение
var MY_FAV = 20;

// здесь также будет ошибка
let MY_FAV = 20;

//var-let
function makeArray() {
	var items = [];
	for (var i = 0; i < 10; i++) {
		var item = function() {
			console.log(i);
		};
		items.push(item);
		}
		return items;
	}
	var arr = makeArray();

	arr[1]();
	arr[3]();
	arr[7]();



let fun = () => {
	console.log(this);
};

fun();

let obj = {
	number: 5,
	sayNumber: function() {
		let say = () => {
			console.log(this);
		};
		say();
	}
};

obj.sayNumber();

function calcOrDouble(number, basis) {
	basis = basis || 2;
	console.log(number*basis);
}

calcOrDouble(3,5);
calcOrDouble(6);

//ES6
function calcOrDouble(number, basis) {
	basis = basis || 2;
	console.log(number*basis);
}

calcOrDouble(3,5);
calcOrDouble(6);


class Rectangle {
	constructor(height, width) {
		this.height = height;
		this.width = width;
	}
	calcArea() {
		return this.height * this.width;
	}
}

const square = new Rectangle(10,10);

console.log(square.calcArea());
