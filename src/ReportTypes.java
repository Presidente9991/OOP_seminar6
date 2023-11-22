
import java.util.HashMap;
import java.util.Map;

public class ReportTypes {

        protected static Map<String, ReportGenerator> reportGenerators = new HashMap<>();

        static {
            reportGenerators.put("PDF", new GenerateReportPDF());
            reportGenerators.put("JSON", new GenerateReportJSON());
            reportGenerators.put("XML", new GenerateReportXML());
        }
    }