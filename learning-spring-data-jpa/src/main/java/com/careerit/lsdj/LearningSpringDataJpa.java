package com.careerit.lsdj;

import com.careerit.lsdj.domain.Course;
import com.careerit.lsdj.domain.Student;
import com.careerit.lsdj.domain.Trainer;
import com.careerit.lsdj.repo.AddressRepo;
import com.careerit.lsdj.repo.CourseRepo;
import com.careerit.lsdj.repo.StudentRepo;
import com.careerit.lsdj.repo.TrainerRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LearningSpringDataJpa implements CommandLineRunner {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private TrainerRepo trainerRepo;

    @Autowired
    private CourseRepo courseRepo;

    public static void main(String[] args) {
        SpringApplication.run(LearningSpringDataJpa.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        /*Address address = new Address();
        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setCountry("India");
        address = addressRepo.save(address);
        System.out.println("Address saved with id :"+address.getId());
        Student student = new Student();
        student.setName("Krish");
        student.setQualification("B.Tech");
        student.setMobile("9876543321");
        student.setAddress(address);
        student = studentRepo.save(student);
        System.out.println("Student saved with id :"+student.getId());*/

        /*createTrainers();
        addCourses();*/
        registerCourse();

    }
    @Transactional
    private void createTrainers(){
        Trainer trainer1 = new Trainer();
        trainer1.setName("Manoj");
        trainer1.setQualification("B.Tech");
        Trainer trainer2 = new Trainer();
        trainer2.setName("Rajani");
        trainer2.setQualification("MCOM");
        trainerRepo.saveAll(List.of(trainer1,trainer2));

    }
    @Transactional
    private void addCourses(){
        Optional<Trainer> trainer = trainerRepo.findById(1L);
            if(trainer.isPresent()){
                Trainer t = trainer.get();
                Course course = new Course();
                course.setDuration(120);
                course.setFee(10000);
                course.setTitle("Introduction to Java");
                course.setTrainer(t);
                course = courseRepo.save(course);
                System.out.println("Course is created with id :"+course.getId());
            }
    }
    @Transactional
    private void registerCourse(){
        List<Student> students = studentRepo.findAll();

        Optional<Course> optCourse = courseRepo.findById(1L);
        if(optCourse.isPresent()){
            Course course = optCourse.get();
            course.setStudents(students);
            courseRepo.save(course);
        }
    }
}
