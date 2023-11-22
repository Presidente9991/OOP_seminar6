/*
Класс документ - описывает структуру документа.
Нужно спроектировать систему отчетов, которая будет формировать отчеты для документа.
1. Формирование PDF-файла (потенциально может быть несколько типом разметки PDF-файла).
2. Формирование JSON-файла с полями документа.
3. Формирование XML-файла с полями документа.
4. ... потенциально могут добавляться разные типы отчетов.
После реализации задать себе 2 вопроса и прикрепить их к сданной ДЗ:
1. Насколько сложно добавить поддержку нового типа отчета?
2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
*/

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Document myDoc = new Document(UUID.randomUUID(), "1234", "Безымянный", "Содержание");
        Report ReportJSON = ReportEntryPoint.create(myDoc, "JSON");
        Report myReportPDFSubType = ReportEntryPoint.create(myDoc, "PDF");
        Report myReportXml = ReportEntryPoint.create(myDoc, "XML");
    }
}

/* Ответы на вопросы
1. Насколько сложно добавить поддержку нового типа отчета?
  Добавление поддержки нового типа отчета будет зависеть от архитектурного решения, выбранного для системы отчетов.
  Чтобы упростить добавление новых типов отчетов, можно использовать принцип SOLID и разделить отчеты на отдельные
  классы, каждый из которых будет отвечать за определенный тип отчета. Например, можно создать интерфейс
  ReportGenerator, реализации которого будут представлять разные типы отчетов (GenerateReportJSON, GenerateReportPDF,
  GenerateReportXML и т. д.). Таким образом, для добавления нового типа отчета, нужно будет создать новый класс,
  реализующий интерфейс ReportGenerator, и добавить его в систему отчетов.
2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
   Если в проекте будет 1000+ типов отчетов, то он может стать громоздким и сложным для поддержки.
   В таком случае будет необходимо использование паттернов проектирования (например, паттерн "Фабричный метод"
   или паттерн "Абстрактная фабрика") для упрощения создания экземпляров форматтеров.
   Может потребоваться группировка форматтеров и организация их в структуру (например, иерархия классов). Также, может
   потребоваться использование библиотек и фреймворков для облегчения работы с большим количеством типов отчетов.
*/
