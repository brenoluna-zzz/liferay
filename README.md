# Recrutamento Liferay - Breno Luna

Implementação de casos de teste utilizando Selenium WebDrive, Cucumber e JUnit.

### Cenários de teste
* Se existe o texto "party rock" no formulário.
* Se todos os campos são obrigatórios.
* Se existe uma mensagem de erro, em cada campo, ao enviar o formulário sem ter preenchido todos os campos.
* Envio do formulário com sucesso.

## Pré-requisitos

Os testes fazem uso do navegador Google Chrome. Antes da execução, realizar um dos seguintes passos:
* informar o caminho do chromedriver.exe na classe Liferay.src.tests.TestRun
```
@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "[caminho do arquivo]\\chromedriver.exe");
	}
```
**OU**
* adicionar o chromdrive.exe ao PATH() do sistema e comentar o método setUp().

## Executando os testes

Com o projeto importado no workspace do Eclipse, executar a classe Liferay.src.tests.TestRun como teste JUnit.

## Built With

* [Cucumber](https://cucumber.io/) - Behavior-Driven Development Framework
* [Eclipse](https://www.eclipse.org/) - Development IDE
* [JUnit](https://junit.org/junit5/) - Testing Framework
* [Selenium](https://www.seleniumhq.org/) - Test Automation Framework

## Author

* **Breno Luna** - [GitHub](https://github.com/brenoluna)
