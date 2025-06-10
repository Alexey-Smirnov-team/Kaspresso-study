/**
 * Precompiled [convention.publication-base.gradle.kts][Convention_publication_base_gradle] script plugin.
 *
 * @see Convention_publication_base_gradle
 */
public
class Convention_publicationBasePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_publication_base_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
