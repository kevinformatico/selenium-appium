@Login

Feature: Iniciar Sesion

	@TestCaseKey=FAL-T1
	Scenario Outline: Hacer Login
	Given existen los campos
	When ingreso usuario <user> y contraseña <pass>
	Then hago click en boton ingresar
	
	Examples:
	|	user						|	pass	|
	|	"ivan.mmeneses28@gmail.com"	|	"12345"	|