package suchi.swag;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
	
	
	
	@Value(value="${welcome.message}")
	private String message;
	
   @RequestMapping( path="/person", method=RequestMethod.POST)
    public Person person(@Valid @RequestBody Person person) {
        return person;
    }
   
   @RequestMapping( path="/", method=RequestMethod.GET)
   public String hello() {
       return message;
   }
}
