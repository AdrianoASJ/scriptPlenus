package scriptplenus

class Desafio {

    String pergunta
    String resposta
    static belongsTo = [eventoPai: Evento]

    static constraints = {
    }
}
