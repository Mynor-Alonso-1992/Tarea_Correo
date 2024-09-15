class Email(
    val destinatarios: List<String>,
    val asunto: String,
    val cuerpo: String,
    val adjuntos: List<String>
) {
    override fun toString(): String {
        return " Email \n destinatarios=$destinatarios \n asunto='$asunto' \n cuerpo='$cuerpo' \n adjuntos=$adjuntos)"
    }
}