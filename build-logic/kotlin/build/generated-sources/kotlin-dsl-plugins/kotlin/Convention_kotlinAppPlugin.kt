/**
 * Precompiled [convention.kotlin-app.gradle.kts][Convention_kotlin_app_gradle] script plugin.
 *
 * @see Convention_kotlin_app_gradle
 */
public
class Convention_kotlinAppPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_kotlin_app_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
