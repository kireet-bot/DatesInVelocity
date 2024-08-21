Getting this as a output, trying to figure out how to solve this 



"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\lib\idea_rt.jar=63198:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1.4\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Kireet Mishra\IdeaProjects\DateInvelocity\target\classes;C:\Users\Kireet Mishra\.m2\repository\org\apache\velocity\velocity-engine-core\2.3\velocity-engine-core-2.3.jar;C:\Users\Kireet Mishra\.m2\repository\org\apache\commons\commons-lang3\3.11\commons-lang3-3.11.jar;C:\Users\Kireet Mishra\.m2\repository\org\slf4j\slf4j-api\1.7.32\slf4j-api-1.7.32.jar;C:\Users\Kireet Mishra\.m2\repository\org\apache\velocity\tools\velocity-tools-generic\3.1\velocity-tools-generic-3.1.jar;C:\Users\Kireet Mishra\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\Kireet Mishra\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\Kireet Mishra\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\Kireet Mishra\.m2\repository\org\apache\commons\commons-digester3\3.2\commons-digester3-3.2.jar;C:\Users\Kireet Mishra\.m2\repository\com\github\cliftonlabs\json-simple\3.0.2\json-simple-3.0.2.jar;C:\Users\Kireet Mishra\.m2\repository\log4j\log4j\1.2.17\log4j-1.2.17.jar;C:\Users\Kireet Mishra\.m2\repository\ch\qos\logback\logback-classic\1.2.10\logback-classic-1.2.10.jar;C:\Users\Kireet Mishra\.m2\repository\ch\qos\logback\logback-core\1.2.10\logback-core-1.2.10.jar" DatePractice
22:52:04.959 [main] DEBUG org.apache.velocity - Initializing Velocity, Calling init()...
22:52:04.961 [main] DEBUG org.apache.velocity - Starting Apache Velocity v2.3
22:52:04.964 [main] DEBUG org.apache.velocity - Default Properties resource: org/apache/velocity/runtime/defaults/velocity.properties
22:52:04.986 [main] DEBUG org.apache.velocity - ResourceLoader instantiated: org.apache.velocity.runtime.resource.loader.FileResourceLoader
22:52:04.987 [main] DEBUG org.apache.velocity.loader.file - FileResourceLoader: adding path '.'
22:52:04.988 [main] DEBUG org.apache.velocity - initialized (class org.apache.velocity.runtime.resource.ResourceCacheImpl) with class java.util.Collections$SynchronizedMap cache map.
22:52:04.991 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Stop
22:52:04.992 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Define
22:52:04.992 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Break
22:52:04.993 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Evaluate
22:52:04.993 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Macro
22:52:04.994 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Parse
22:52:04.995 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Include
22:52:04.996 [main] DEBUG org.apache.velocity - Loaded System Directive: org.apache.velocity.runtime.directive.Foreach
22:52:05.016 [main] DEBUG org.apache.velocity.parser - Created '20' parsers.
22:52:05.036 [main] DEBUG org.apache.velocity.macro - "velocimacro.library.path" is not set. Trying default library: velocimacros.vtl
22:52:05.038 [main] DEBUG org.apache.velocity.macro - Default library velocimacros.vtl not found. Trying old default library: VM_global_library.vm
22:52:05.039 [main] DEBUG org.apache.velocity.macro - Old default library VM_global_library.vm not found.
22:52:05.039 [main] DEBUG org.apache.velocity.macro - allowInline = true: VMs can be defined inline in templates
22:52:05.039 [main] DEBUG org.apache.velocity.macro - allowInlineToOverride = false: VMs defined inline may NOT replace previous VM definitions
22:52:05.039 [main] DEBUG org.apache.velocity.macro - allowInlineLocal = false: VMs defined inline will be global in scope if allowed.
22:52:05.039 [main] DEBUG org.apache.velocity.macro - autoload off: VM system will not automatically reload global library macros
22:52:05.058 [main] DEBUG org.apache.velocity.rendering - Null reference [template 'myDates.vm', line 3, column 18]: $currentDate cannot be resolved.
<p>Current Date: $currentDate</p>


Process finished with exit code 0
