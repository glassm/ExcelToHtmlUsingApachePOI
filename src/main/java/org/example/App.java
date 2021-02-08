package org.example;

import java.io.IOException;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Converter toHtml = new Converter();
        try {
            toHtml.convertXlsToHtml("example/test.xls", "example/out/test_xls.html");
            toHtml.convertXlsToHtml("example/test.xlsx", "example/out/test_xlsx.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
