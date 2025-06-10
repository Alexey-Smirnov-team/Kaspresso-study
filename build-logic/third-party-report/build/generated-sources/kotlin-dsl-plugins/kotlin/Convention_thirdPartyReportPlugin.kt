/**
 * Precompiled [convention.third-party-report.gradle.kts][Convention_third_party_report_gradle] script plugin.
 *
 * @see Convention_third_party_report_gradle
 */
public
class Convention_thirdPartyReportPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Convention_third_party_report_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
