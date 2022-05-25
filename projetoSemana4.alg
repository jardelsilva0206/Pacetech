algoritmo "Projeto semana 4"

var
grausCelsius:real
grausFahrenheit,cotacaoDolar,qtdReais,qtdDolar: real
opcao,i: inteiro
inicio
enquanto opcao <> 5 faca
   Escreval("Escolha a opção desejada:   ")
   Escreval("1 - Fahrenheit para celsius")
   Escreval("2 - Celsius para fahrenheit")
   Escreval("3 - Real para dólar")
   Escreval("4 - Dólar para real")
   Escreval("5 - Sair")
   leia(opcao)
   se (opcao = 3) OU (opcao = 4) entao
      Escreval("Informe a cotação atual do dólar:")
      leia(cotacaoDolar)
   fimse
   escolha opcao
   caso 1
      grausCelsius <- 0
      Escreval("Informe os graus fahrenheits: ")
      Leia(grausFahrenheit)
      grausCelsius<-(grausFahrenheit-32)*5/9
      Escreval("Graus celsius= ",grausCelsius:1:2,"ºC")
   caso 2
      grausFahrenheit <-0
      Escreval("Informe os graus celsius: ")
      leia(grausCelsius)
      grausFahrenheit<- grausCelsius*(9/5)+32
      Escreval("Graus Fahrenheit= ",grausFahrenheit:1:2,"ºF")
   caso 3
      Escreval("Informe quantos reais você quer trocar por dólar:")
      leia(qtdReais)
      qtdDolar<-qtdReais/cotacaoDolar
      Escreval("Você vai receber $ ",qtdDolar:1:2," nesta transação.")
   caso 4
      Escreval("Informe quantos dólares você quer trocar por reais:")
      leia(qtdDolar)
      qtdReais<-qtdDolar*cotacaoDolar
      Escreval("Você vai receber R$ ",qtdReais:1:2," nesta transação.")
   caso 5
      Escreval("Obrigado por utilizar este programa!")
   caso outro
      Escreval("Opção inválida")
   fimescolha
fimenquanto
fimalgoritmo
