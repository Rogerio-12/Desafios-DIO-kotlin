fun main(args: Array<String>) {
    /*
    DESAFIO DIO KOTLIN / CALCULADORA
    PROF : ANA LUÍSA DIAS

     AUTOR : ROGÉRIO FILHO
     DATA : 04-03/2021

     */


    println("Digite um número para o cálculo")
        val num1 :Float = readLine()!!.toFloat()
    println("Digite um númeor para o cálculo")
        val num2 :Float = readLine()!!.toFloat()

    println("---------------------------------------")
        println("Digite 1 para somar")
        println("Digite 2 para subtrair")
        println("Digite 3 para multiplicar")
        println("Digite 4 para dividisão")
        println("Digite 5 para porcentagem")
    println("---------------------------------------")

        val operacional: Int = readLine()!!.toInt()

        val soma: Float = num1.plus(num2)
        val subtracao: Float = num1.minus(num2)
        val dividi: Float = num1.div(num2)
        val multiplica: Float = num1.times(num2)
        val porcentagem: Float = num1.times(num2) / 100

    println("---------------------------------------")

        when (operacional) {

            1 -> println("A soma de $num1 + $num2 = $soma")
            2 -> println("A subtração de $num1 - $num2 = $subtracao")
            3 -> println("A multiplicação de $num1 x $num2 = $multiplica")
            4 -> println("A divisão de $num1 / $num2 = $dividi")
            5 -> println("A porcentagem de $num2% de $num1 = $porcentagem")
            else -> println("Valor digitado não corresponde com nenhum operacional")
        }

    /*
        Adicionar restrições ao usuário : receber somento números.
     */

}