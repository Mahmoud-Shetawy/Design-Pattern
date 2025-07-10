package templatemethod.Aft_Use_Templatemethod;



import java.io.File;

public class ImageCvReportGeneration extends CvReportGeneration {

    @Override
    protected Date extractDate(File file) {
        System.out.println("Extracting Date from image..." );
        return null;
    }



}
