package textprocess.io;

import java.io.File;
import java.io.IOException;
import java.util.List;

import joinery.DataFrame;
import tech.tablesaw.api.Table;
import tech.tablesaw.io.csv.CsvReadOptions;
import tech.tablesaw.io.csv.CsvReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "src/main/resources/titanic-passengers.csv";
        TittianicDOA.readcsv(filename);
		TittianicDOA tittianicDOA = new TittianicDOA();
		
		// testing reading json file using jackson and ploting using xchart 
        List<TitanicPassenger> passengers =tittianicDOA.getPassengersFromJsonFile();
        tittianicDOA.graphPassengerAgesDraw(passengers);
        tittianicDOA.graphPassengerClass(passengers);
        tittianicDOA.graphPassengerSurvived(passengers);
        tittianicDOA.graphPassengerSurvivedGender(passengers);
        
        //System.out.println("test"+passengers.get(0).getName());
		
	}

}
