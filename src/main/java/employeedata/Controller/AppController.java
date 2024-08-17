package employeedata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import employeedata.dao.EmployyeDao;
import employeedata.dto.Employee;

@Controller
public class AppController {
	
	@Autowired
	EmployyeDao dao;
	
	@RequestMapping("/signup")
	public ModelAndView signup() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("signup.jsp");
		modelandview.addObject("emp", new Employee());
		return modelandview;
	}
	
	@RequestMapping("/saveemployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee emp) {
		dao.saveEmployee(emp);
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("login.jsp");
		return modelandview;
		
	}
	
	@RequestMapping("/login")
		public ModelAndView login (@RequestParam String email, @RequestParam String password) {
			Employee emp = dao.findByEmailId(email);
			if(emp!=null) {
				if(emp.getPassword().equals(password)) {
					ModelAndView modelAndView = new ModelAndView();
					modelAndView.setViewName("home.jsp");
					modelAndView.addObject("emps", dao.findAll());
					return modelAndView;
				}else {
					return new ModelAndView("login.jsp");
				}
			}
			else {
				return new ModelAndView("login.jsp");			}
			
		}
	}
	


