package servicesTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.test.employeeCrud.controller.EmployeeController;
import com.test.employeeCrud.model.Employee;
import com.test.employeeCrud.service.EmployeeService;

import static org.assertj.core.api.Assertions.assertThat;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class EmployeeServiceTest {

	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService service;
   // Employee e=new Employee(id, name, dept, city, contactInfo)
//    Employee e=new Employee(2, "ww","wd","wd",454541l);
//
//    @Test
//    public void greetingShouldReturnMessageFromService() throws Exception {
//        when(service.getEmployeeById(1)).thenReturn(e);
//        this.mockMvc.perform(get("/list")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("wd")));
//    }
}
