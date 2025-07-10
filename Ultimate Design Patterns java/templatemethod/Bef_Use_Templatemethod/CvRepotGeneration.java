package templatemethod.Bef_Use_Templatemethod;

import java.io.File;

public interface CvRepotGeneration {

    GeneratedCvReport  generateCvReport(String cvFilePath);

    Date extractDate(File file);

    File ReadFile(String filename);

    AnalyzedData analyzeData(Date date);

}
