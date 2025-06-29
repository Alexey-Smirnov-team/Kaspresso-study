/**
 * Precompiled [convention.legal-documents.gradle.kts][Convention_legal_documents_gradle] script plugin.
 *
 * @see Convention_legal_documents_gradle
 */
public
class Convention_legalDocumentsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_legal_documents_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
