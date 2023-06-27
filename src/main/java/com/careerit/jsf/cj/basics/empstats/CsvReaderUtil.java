package com.careerit.jsf.cj.basics.empstats;

import lombok.SneakyThrows;

import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

  private static final String FILE_NAME = "/emp_data.csv";

  private CsvReaderUtil() {
  }

  @SneakyThrows
  public static List<Employee> loadDataFromFile() {
    List<String> rows = Files.readAllLines(getPath());
    List<Employee> empList = new ArrayList<>();
    for (int i = 1; i < rows.size(); i++) {
      Employee emp = rowToEmployee(rows.get(i));
      empList.add(emp);
    }
    return empList;
  }

  private static Employee rowToEmployee(String row) {
    String[] arr = row.split(",");
    long empno = Long.parseLong(arr[0]);
    String ename = arr[1];
    String email = arr[2];
    double salary = Double.parseDouble(arr[3]);
    String country = arr[4];
    return new Employee(empno, ename, email, salary, country);
  }

  private static Path getPath() throws URISyntaxException {
    return Paths.get(CsvReaderUtil.class.getResource(FILE_NAME).toURI());
  }
}
