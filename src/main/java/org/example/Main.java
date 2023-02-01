package org.example;

import com.aspose.cells.TxtLoadOptions;
import com.aspose.cells.Workbook;

public class Main {
    public static void main(String[] args) throws Exception {

        // This code example demonstrates how to convert a CSV file to an XML with options.
// Initialize TXT load options
        TxtLoadOptions options = new TxtLoadOptions();
        options.setMultiEncoded(true);

// Load the CSV file into Workbook
        Workbook workbook = new Workbook("src/main/resources/proyectos.csv", options);

// Save it as XML
        workbook.save("src/main/resources/proyectos.xml");
    }
}