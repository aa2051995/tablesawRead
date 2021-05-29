package textprocess.io;

import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;

public class TittianicDOA {
public static void readcsv(String filename) {
//	DataFrame<Object> titaincs_row = null;
//	try {
//		titaincs_row = DataFrame.readCsv("G:\\exported data\\iti\\Java & UML Programming\\titanic-passengers.csv");
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	CsvReadOptions.Builder builder = 
			CsvReadOptions.builder(filename)
				.separator(';')										// table is tab-delimited
				.header(true).maxNumberOfColumns(12)											// no header
				;  				// the date format to use. 

		CsvReadOptions options = builder.build();

		Table t1 = null;
		try {
			t1 = Table.read().usingOptions(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	System.out.println(t1.columns());
	System.out.println(t1.summary());
}
}
