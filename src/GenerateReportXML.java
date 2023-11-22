
public class GenerateReportXML implements ReportGenerator {

    @Override
    public Report generateReport(Document document) {
        System.out.println("Создание XML-отчёта");
        // Логика генерации XML-отчёта
        return new Report("XML-отчёта".getBytes());
    }
}
