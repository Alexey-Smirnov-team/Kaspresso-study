/**
 * Precompiled [convention.publication-android-lib.gradle.kts][Convention_publication_android_lib_gradle] script plugin.
 *
 * @see Convention_publication_android_lib_gradle
 */
public
class Convention_publicationAndroidLibPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_publication_android_lib_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
