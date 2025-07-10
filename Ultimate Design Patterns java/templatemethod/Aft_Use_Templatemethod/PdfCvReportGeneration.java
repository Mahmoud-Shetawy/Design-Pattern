package templatemethod.Aft_Use_Templatemethod;


import java.io.File;

public class PdfCvReportGeneration extends CvReportGeneration {

    @Override
    public Date extractDate(File file) {
        System.out.println("extractDate Data from Pdf :" + file);

        return null;
    }

}
