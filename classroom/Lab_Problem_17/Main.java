package Lab_Problem_17;
/**
 * ==========================================================
 * Program Name: Main
 * Description : Template 
 * Author      : Nihal Kumar
 * Created On  : 01-03-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

abstract class ReportGenerator<T> {
    public final void generateReport() {
        initializeReport();
        T data = fetchData();
        processData(data);
        generateOutput(data);
        closeReport();
    }

    protected abstract void initializeReport();
    protected abstract T fetchData();
    protected abstract void processData(T data);
    protected abstract void generateOutput(T data);
    protected abstract void closeReport();
}

class PDFReportGenerator<T> extends ReportGenerator<T> {
    @Override
    protected void initializeReport() {
        System.out.println("Initializing PDF Report...");
    }

    @Override
    protected T fetchData() {
        T data = (T) "Sales Data";
        System.out.println("Fetching Data: " + data);
        return data;
    }

    @Override
    protected void processData(T data) {
        System.out.println("Processing Data...");
    }

    @Override
    protected void generateOutput(T data) {
        System.out.println("Generating PDF Report...");
    }

    @Override
    protected void closeReport() {
        System.out.println("Closing PDF Report...\n");
    }
}

class CSVReportGenerator<T> extends ReportGenerator<T> {
    @Override
    protected void initializeReport() {
        System.out.println("Initializing CSV Report...");
    }

    @Override
    protected T fetchData() {
        T data = (T) java.util.Arrays.asList(10, 20, 30, 40);
        System.out.println("Fetching Data: " + data);
        return data;
    }

    @Override
    protected void processData(T data) {
        System.out.println("Processing Data...");
    }

    @Override
    protected void generateOutput(T data) {
        System.out.println("Generating CSV Report...");
    }

    @Override
    protected void closeReport() {
        System.out.println("Closing CSV Report...\n");
    }
}

public class Main {
    public static void main(String[] args) {
        ReportGenerator<String> pdfReport = new PDFReportGenerator<>();
        pdfReport.generateReport();

        ReportGenerator<java.util.List<Integer>> csvReport = new CSVReportGenerator<>();
        csvReport.generateReport();
    }
}

