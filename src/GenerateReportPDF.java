
public class GenerateReportPDF implements ReportGenerator {

        @Override
        public Report generateReport(Document document) {
            System.out.println("Создание PDF-отчёта");
            // Логика генерации PDF-отчета
            return new Report("PDF-отчет".getBytes());
        }
    }