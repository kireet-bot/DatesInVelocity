import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.tools.generic.DateTool;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
        public static void main(String[] args) {
            VelocityEngine velocityEngine = new VelocityEngine();
            velocityEngine.init();

            VelocityContext context = new VelocityContext();


//            Date currentDate = new Date();
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String formattedDate = dateFormat.format(currentDate);
//
//            // Put data into the context
//            context.put("currentDate", formattedDate);
//
//            String template = "<p>Current Date: $currentDate</p>\n";
//
//            StringWriter writer = new StringWriter();
//            velocityEngine.evaluate(context, writer, "example.vm", template);

            context.put("tool", new DateTool()); // Initialize DateTool and add to context

            String template = "#set($dateTool = $tool.date)\n" +
                    "#set($currentDate = $dateTool.now)\n" +
                    "<p>Current Date: $currentDate</p>\n";

            StringWriter writer = new StringWriter();
            velocityEngine.evaluate(context, writer, "myDates.vm", template);

            System.out.println(writer.toString());
        }
    }


