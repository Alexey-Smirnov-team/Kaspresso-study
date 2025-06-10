/**
 * Precompiled [convention.dependency-updates.gradle.kts][Convention_dependency_updates_gradle] script plugin.
 *
 * @see Convention_dependency_updates_gradle
 */
public
class Convention_dependencyUpdatesPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_dependency_updates_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
