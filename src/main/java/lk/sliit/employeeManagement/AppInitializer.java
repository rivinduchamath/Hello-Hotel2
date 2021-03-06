package lk.sliit.employeeManagement;
/*
*
  Created by IntelliJ IDEA.
  User: Rivindu Chamath
  Date: 21-May-20
  Time: 2:43 AM
  To change this template use File | Settings | File Templates.
*/

import lk.sliit.employeeManagement.dao.EmployeeDAO;
import lk.sliit.employeeManagement.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
@ServletComponentScan
public class AppInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class,args);
    }

    String str="2020-05-11";
    Date date= Date.valueOf(str);

    @Bean //Add Demo System User To the System
    CommandLineRunner init2(EmployeeDAO employeeDAO) {
        return args -> {
            List<String> names = Arrays.asList ( "1");
            names.forEach ( name -> employeeDAO.save ( new Employee(

                            "1",
                            "Rivindu Wijayarathna",
                            0223123456,
                            "someOne@gmail.com",
                            "Galle",
                            "Admin",
                            "1",
                            date,
                            "Male",
                            date,
                            "img.jpg",
                            false)
                    )
            );
        };
    }}//End Class