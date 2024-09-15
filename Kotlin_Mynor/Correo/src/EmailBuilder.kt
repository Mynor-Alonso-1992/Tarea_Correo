class EmailBuilder {
    private val destinatarios = mutableListOf<String>()
    private var asunto: String = ""
    private var cuerpo: String = ""
    private val adjuntos = mutableListOf<String>()

    // Métodos del Builder
    fun withDestinatario(destinatario: String) = apply {
        destinatarios.add(destinatario)
    }

    fun withAsunto(asunto: String) = apply {
        this.asunto = asunto
    }

    fun withCuerpo(cuerpo: String) = apply {
        this.cuerpo = cuerpo
    }

    fun withAdjunto(adjunto: String) = apply {
        adjuntos.add(adjunto)
    }

    // Método build para crear la instancia de Email
    fun build(): Email {
        // Validaciones
        require(destinatarios.isNotEmpty()) { "Debe haber al menos un destinatario" }
        require(asunto.isNotBlank()) { "El asunto es obligatorio" }
        require(cuerpo.isNotBlank()) { "El cuerpo es obligatorio" }

        return Email(destinatarios, asunto, cuerpo, adjuntos)
    }
}
