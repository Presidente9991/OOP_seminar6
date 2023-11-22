public class GenerateReportJSON extends GenerateReportPDF {
    @Override
    public Report generateReport(Document document) {
        System.out.println("Создание JSON-отчёта");
        // Логика генерации JSON-отчета
        return new Report("JSON-отчет".getBytes());
    }
}
