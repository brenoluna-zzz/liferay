# Liferay

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

## Criado com

* [Cucumber](https://cucumber.io/) - _Framework_ de Desenvolvimento Baseando em Comportamento (BDD)
* [Eclipse](https://www.eclipse.org/) - Ambiente de Desenvolvimento
* [JUnit](https://junit.org/junit5/) - _Framework_ de Controle de Testes
* [Selenium](https://www.seleniumhq.org/) - _Framework_ de Automação de Testes

## Autor

* **Breno Luna** - [GitHub](https://github.com/brenoluna)
