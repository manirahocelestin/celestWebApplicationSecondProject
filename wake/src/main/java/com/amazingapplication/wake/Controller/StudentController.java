package com.amazingapplication.wake.Controller;

import com.amazingapplication.wake.Service.IStudentService;
import com.amazingapplication.wake.Service.StudentService;
import com.amazingapplication.wake.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private IStudentService studentService;


    public StudentController(IStudentService studentService) {
        super();
        this.studentService = studentService;
    }
    //listing a student method
    @GetMapping("/viewListStudent")
    public String listStudent(Model model){
        model.addAttribute("student",studentService.findAll());
        return "student";

    }
    //create add new student
    @GetMapping("/createStudent/new")
    public String createStudent(Model model){
        Student student = new Student();
        model.addAttribute("student",student);
        return "StudentRegistration";
    }
    //create save method
    @PostMapping("/saveStudent")
    public String studentSave(@ModelAttribute("student") Student student){
      studentService.CreateStudent(student);
      return "redirect:/student";

    }
    // update student from page
    @GetMapping("/studentList/{id}")
    // {id} is related with long id help us to find student in on database
    public String updateStudent(@PathVariable Long id,Model model){
        //view student id
        Student exitStudent = studentService.getStudentById(id);
        model.addAttribute("student",exitStudent);
        return "editStudent";

    }
    // update existing student
    @PostMapping("/updateExistStudent/{id}")
    // @ModelAttribute("student") will help me to keeping student data
    //@PathVariable will help us to edit long id
    public String  updateExitList(@PathVariable Long id, Model model, @ModelAttribute("student") Student student){
        // get student details from database
        Student existStudent = studentService.getStudentById(id);
        // give authorizations update student
        existStudent.setId(student.getId());
        existStudent.setNames(student.getNames());
        existStudent.setGender(student.getGender());
        existStudent.setDob(student.getDob());
        existStudent.setAddress(student.getAddress());
        existStudent.setDepartment(student.getDepartment());
        existStudent.setCourses(student.getCourses());

        // save update student object
        studentService.updateStudent(existStudent);
        return "redirect:/student";

    }
    // deleting student
    @GetMapping("/deleteStudent/{id}")
    public String removeStudent(@PathVariable Long id){
        studentService.removeStudent(id);
        return "redirect:/student";

    }

}
