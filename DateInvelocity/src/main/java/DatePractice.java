import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.example.ToolManager;

import java.io.StringWriter;
import java.util.Properties;

public class DatePractice {
        public static void main(String[] args) {


            Properties props = new Properties();
            props.setProperty("resource.loader", "file");
            props.setProperty("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.FileResourceLoader");
            props.setProperty("file.resource.loader.path", "src/main/resources");

            VelocityEngine velocityEngine = new VelocityEngine(props);
            velocityEngine.init();

            // Get the template
            Template template = velocityEngine.getTemplate("myDate.vm");

            // Create Velocity context and add data
            VelocityContext context = new VelocityContext();
            context.put("tool", new ToolManager());

            // Render the template into a StringWriter
            StringWriter writer = new StringWriter();
            template.merge(context, writer);

            System.out.println(writer.toString());
        }
    }


