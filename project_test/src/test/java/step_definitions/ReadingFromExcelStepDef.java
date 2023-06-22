package step_definitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import utilites.for_excel.ExcelConfiguration;
import utilites.for_excel.ExcelDataReader;
import utilites.for_excel.IDataReader;

import java.util.List;
import java.util.Map;

public class ReadingFromExcelStepDef {
    @Given("a user has the file location, file name, and sheet name")
    public void a_user_has_the_file_location_file_name_and_sheet_name(IDataReader dataTable) {
        System.out.println(dataTable.getAllRows());
        List<Map<String,String>> list = dataTable.getAllRows();
        System.out.println(list.get(1).get("EmailAddress"));

        System.out.println(dataTable.getASingleRow());

        Map<String,String> map = dataTable.getASingleRow();
        System.out.println(map);
        System.out.println( map.get("Country"));




    }

//    @DataTableType
//    public IDataReader excelToDataTable(Map<String, String> entry) {
//        ExcelConfiguration config = new ExcelConfiguration.ExcelConfigurationBuilder()
//                .setFileName(entry.get("FileName"))
//                .setFileLocation(entry.get("FileLocation"))
//                .setSheetName(entry.get("SheetName"))
//                .setIndex(Integer.valueOf(entry.getOrDefault("Index", "0")))
//                .build();
//        return new ExcelDataReader(config);
//    }
}
