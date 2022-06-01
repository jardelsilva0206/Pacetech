algoritmo "Projeto semana 5"

var
grausCelsius,grausFahrenheit,medicaoAux:real
horaAux:literal
opcaoMenu,i,j: inteiro
horaMedicao : vetor[1..4] de literal
grausMedicao : vetor[1..4] de real

funcao menu():inteiro
inicio
Escreval("Escolha a opção desejada:   ")
Escreval("1 - Fahrenheit para celsius")
Escreval("2 - Celsius para fahrenheit")
Escreval("3 - Sair")
leia(opcaoMenu)
retorne opcaoMenu
fimfuncao

funcao converteFahCel(graus:real):real
inicio
retorne (graus-32)*(5/9)
fimfuncao

funcao converteCelFah(graus:real):real
inicio
retorne (graus*(9/5))+32
fimfuncao

procedimento converteTemperatura()
inicio
para i de 1 ate 4 faca
   Escreval("Informe a hora que a temperatura",i," foi registrada")
   leia(horamedicao[i])
   Escreval("Informe a temperatura",i," a ser convertida: ")
   leia(grausMedicao[i])
fimpara
ordenaVetor()
para i de 1 ate 4 faca
   se opcaoMenu = 1 entao
      Escreval("Temperatura",grausMedicao[i],"° Fahrenheit, registrada as ",horaMedicao[i],"h corresponde a ",converteFahCel(grausMedicao[i]):1:2,"° Celsius.")
   senao
      se opcaoMenu = 2 entao
         Escreval("Temperatura",grausMedicao[i],"° Celsius, registrada as ",horaMedicao[i],"h corresponde a ",converteCelFah(grausMedicao[i]),"° Fahrenheit.")
      fimse
   fimse
fimpara
Escreval("")
fimprocedimento
procedimento ordenaVetor()
inicio
para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se grausMedicao[j] > grausMedicao[i] entao
         medicaoAux<-grausMedicao[i]
         horaAux<-horaMedicao[i]
         grausMedicao[i]<-grausMedicao[j]
         grausMedicao[j]<-medicaoAux
         horaMedicao[i]<-horaMedicao[j]
         horaMedicao[j]<-horaAux
      fimse
   fimpara
fimpara
fimprocedimento
inicio

enquanto opcaoMenu <> 3 faca
   opcaoMenu<-menu()
   escolha opcaoMenu
   caso 1
      converteTemperatura()
   caso 2
      converteTemperatura()
   caso 3
      Escreval("Obrigado por utilizar este programa!")
   caso outro
      Escreval("Opção inválida")
   fimescolha
fimenquanto
fimalgoritmo
