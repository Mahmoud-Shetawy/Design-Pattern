package templatemethod.Bef_Use_Templatemethod;

import java.io.File;

public class WordCvReportGeneration implements CvRepotGeneration{
    @Override
    public GeneratedCvReport generateCvReport(String cvFilePath) {
        var file = new File(cvFilePath);
        var extractedData = extractDate(file);
        var analyzedData = analyzeData(extractedData);
        return generatedCvReport(analyzedData);
    }

    private GeneratedCvReport generatedCvReport(AnalyzedData analyzedData) {
        System.out.println("Generated CV Report from :" + analyzedData);
        return new GeneratedCvReport();
    }

    @Override
    public Date extractDate(File file) {
        System.out.println("extractDate Data from word file");

        return null;
    }

    @Override
    public File ReadFile(String filePath) {
        System.out.println("reading file from :" + filePath);

        return null;
    }

    @Override
    public AnalyzedData analyzeData(Date date) {
        System.out.println("AnalyzedData file from :" + date);

        return null;
    }
}
