algoritmo "Conversor de temperatura fahreneit para celsius"

var
grausCelsius:real
grausFahrenheit: real

inicio
Escreval("Informe os graus fahrenheits: ")
Leia(grausFahrenheit)
grausCelsius<-(grausFahrenheit-32)*5/9
Escreval("Graus celsius= ",grausCelsius:1:2)

se grausCelsius <= 15 entao
   escreval("est� frio!")
senao
   se grausCelsius <=28 entao
      escreval("est� agrad�vel!")
   senao
      escreval("est� calor!")
   fimse
fimse
fimalgoritmo
