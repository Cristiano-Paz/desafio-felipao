fun main() {
    // Variáveis
    val nomeDoHeroi = "Paz"
    val xpDoHeroi = 2001
    val rankingDoHeroi = " de XP e seu ranking atual é"
    val pedraMagica = true

    // Função para determinar o ranking do herói
    fun determinarRanking(xp: Int): String {
        return when (xp) {
            in 0..999 -> "Ferro"
            in 1000..2000 -> "Bronze"
            in 2001..5000 -> "Prata"
            in 5001..7000 -> "Ouro"
            in 7001..8000 -> "Platina"
            in 8001..9000 -> "Ascendente"
            in 9001..10000 -> "Imortal"
            else -> "Radiante"
        }
    }

     // Função para mensagens adicionais baseadas no ranking
    fun mensagemAdicionalRanking(ranking: String) {
        when (ranking) {
            "Ferro" -> println("Este é apenas o começo!")
            "Platina" -> println("Você está ficando forte, continue!")
            "Radiante" -> println("Você provou ser um bom guerreiro e está entre os mais fortes!")
        }
    }

    // Função para verificar atividades disponíveis
    fun verificarAtividades(xp: Int, pedraMagica: Boolean) {
        when {
            xp in 2001..5000 -> println("Parabéns! Você já pode participar das partidas ranqueadas.")
            xp in 7001..8000 -> println("A partir de agora, você já pode participar do PvP!")
            xp > 10000 -> {
                println("Com uma Pedra Mágica, vá para o portal e tente conquistar seu território!")
                if (pedraMagica) {
                    println("Você já tem uma Pedra Mágica, conquiste o território e espalhe seu legado!")
                } else {
                    println("Você ainda não tem uma pedra mágica, vá ao reino perdido em busca da sua e cuidado com os perigos!")
                }
            }
        }
    }

    // Determinar ranking e imprimir mensagem inicial
    val ranking = determinarRanking(xpDoHeroi)
    println("Olá $nomeDoHeroi, você tem $xpDoHeroi$rankingDoHeroi $ranking")
    mensagemAdicionalRanking(ranking)

    println("")

    // Verificar atividades disponíveis
    verificarAtividades(xpDoHeroi, pedraMagica)
}