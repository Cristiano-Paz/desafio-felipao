fun main() {
    // Cauculando o saldo de ranqueadas
    fun calcularSaldo(vitorias: Int, derrotas: Int): Int {
        return vitorias - derrotas
    }

    // Determinando o nível com base nas vitórias
    fun determinarNivel(vitorias: Int): String {
        return when {
            vitorias < 10 -> "Ferro"
            vitorias in 11..20 -> "Bronze"
            vitorias in 21..50 -> "Prata"
            vitorias in 51..80 -> "Ouro"
            vitorias in 81..90 -> "Diamante"
            vitorias in 91..100 -> "Lendário"
            vitorias >= 101 -> "Imortal"
            else -> "Nível desconhecido"
        }
    }

    // Entradas
    var continuar = true
    while (continuar) {
        println("Quantidade de derrotas:")
        val vitorias = readLine()?.toIntOrNull() ?: 51
        println("Quantidade de derrotas:")
        val derrotas = readLine()?.toIntOrNull() ?: 0

        // Determinando o nível
        val saldoVitorias = calcularSaldo(vitorias, derrotas)
        val nivel = determinarNivel(vitorias)

        // Saída
        println("O Herói tem de saldo de $saldoVitorias está no nível de $nivel")
     // Pergunta se deseja continuar
        println("Deseja continuar? (s/n)")
        val resposta = readLine() 
       
        continuar = resposta.equals("s", ignoreCase = false)
        
        
    }
}
