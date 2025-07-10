package templatemethod.Aft_Use_Templatemethod;



import java.io.File;

public abstract class CvReportGeneration {

    GeneratedCvReport generateCvReport(String cvFilePath) {
        var file = new File(cvFilePath);
        var extractedData = extractDate(file);
        var analyzedData = analyzeData(extractedData);
        return generatedCvReport(analyzedData);
    }

    protected abstract Date extractDate(File file) ;

    private GeneratedCvReport generatedCvReport(AnalyzedData analyzedData) {
        System.out.println("Generated CV Report from :" + analyzedData);
        return new GeneratedCvReport();
    }




    private File ReadFile(String filePath) {
        System.out.println("reading file from :" + filePath);

        return null;
    }

    private AnalyzedData analyzeData(Date date) {
        System.out.println("AnalyzedData file from :" + date);

        return null;
    }

}
