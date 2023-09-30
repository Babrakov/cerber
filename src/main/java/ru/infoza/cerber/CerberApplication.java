package ru.infoza.cerber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CerberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CerberApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(PhoneRepository phoneRepository) {
//		return args -> {
//			Stream.of("9184109310", "9064333655", "9282071984").forEach(number -> {
//				Phone phone = new Phone(number, number + " some text");
//				phoneRepository.save(phone);
//			});
//			phoneRepository.findAll().forEach(System.out::println);
//		};
//	}

}
