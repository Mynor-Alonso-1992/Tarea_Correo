fun main() {
    // Construir un Email utilizando el patrón Builder en Kotlin
    val email = EmailBuilder()
        .withDestinatario("destinatario1@correo.com")
        .withDestinatario("destinatario2@correo.com")
        .withAsunto("Reunión de trabajo")
        .withCuerpo("Estimados, por favor revisen el siguiente documento.")
        .withAdjunto("archivo.pdf")
        .build()

    // Imprimir detalles del correo
    println(email)
}