/**
 * Precompiled [convention.sonatype.gradle.kts][Convention_sonatype_gradle] script plugin.
 *
 * @see Convention_sonatype_gradle
 */
public
class Convention_sonatypePlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_sonatype_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
