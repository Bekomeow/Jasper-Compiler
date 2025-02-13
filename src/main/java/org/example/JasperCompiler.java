package org.example;

import net.sf.jasperreports.engine.JasperCompileManager;

public class JasperCompiler {
    public static void main(String[] args) {
        try {
            // Путь к JRXML файлу
            String jrxmlFile = "C:\\Users\\BEKZHAN\\Desktop\\dara-project\\RepairDocumentSub2.jrxml";

            // Путь для сохранения скомпилированного файла
            String jasperFile = "C:\\Users\\BEKZHAN\\Desktop\\dara-project\\RepairDocumentSub2.jasper";

            JasperCompileManager.compileReportToFile(jrxmlFile, jasperFile);

            System.out.println("Файл успешно скомпилирован: " + jasperFile);
        } catch (Exception e) {
            System.err.println("Ошибка при компиляции файла: " + e.getMessage());
        }
    }
}
