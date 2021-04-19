package com.te.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.te.springmvc.controller.dao.EmployeeDao;
import com.te.springmvc.dto.EmployeeBean;
import com.te.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	 private EmployeeService service;

	@GetMapping("/emplogin")
	public String getLogin() {
		return "loginformemp";
	}//end of login method

	@PostMapping("/emplogin")
	public String authenticate(int id, String pw, HttpServletRequest request, ModelMap map) {
		EmployeeBean employeeBean = service.authenicate(id, pw);
		if (employeeBean != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("emp", employeeBean);
			return "Header";

		} else {
			map.addAttribute("errorMsg", "Invalidcredentials");
			return "loginformemp";
		}

	}
	@GetMapping("/searchForm")
	public String getSearchForm(ModelMap modelMap, HttpSession session) {
		if (session.getAttribute("emp")!=null) {
			return "search";
			
		}else {
			modelMap.addAttribute("errorMsg","please login first");
			return"loginformemp";
		}
		
	}//close search form method
	@GetMapping("/search")
	public String getSearchEmp(int id,ModelMap map, @SessionAttribute("emp")EmployeeBean employeeBean) {
		if (employeeBean!=null) {
			EmployeeBean employeeBean2=service.getId(id);
			if (employeeBean2!=null) {
				map.addAttribute("data",employeeBean2);
				
			}else {
				map.addAttribute("msg","data not found for ID:"+id);
				
			}
			return "search";
			
		}else {
			map.addAttribute("errorMsg","please login first");
			return"loginformemp";
		}
	}
	
	@GetMapping("/logout")
	 public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("msg","logout successfully");
		return "loginformemp";
		
	}
	@GetMapping("/deleteform")
	public String getDeleteForm(ModelMap map,@SessionAttribute("empData") EmployeeBean bean) {
		if (bean!=null) {
			return "delete";
			
		}
		else {
			map.addAttribute("errorMsg","please login first");
			return"loginformemp";
		}
		
		
	}
	@GetMapping("/delete")
	public String getDeleteEmp(int id,@SessionAttribute("emp") EmployeeBean bean, ModelMap map) {
		if (bean!=null) {
			boolean bean2=service.delete(id);
			if (bean2==true) {
				map.addAttribute("msg","deleted successfully");
				return "delete";
			}
		}else {
			map.addAttribute("errorMsg","please login first");
			return "delete";
		}
		return null;
		
		}
	@GetMapping("/getAll")
	public String viewAllEmployee(ModelMap map, @SessionAttribute("emp") EmployeeBean bean) {
		if (bean != null) {
			List<EmployeeBean> employeeBeans = service.getAllEmployees();
			map.addAttribute("empdata", employeeBeans);
			return "getAll";
		} else {
			map.addAttribute("msg", "no employees found");
			return "getAll";
		}

	}//end of viewAllEmployee

	
	
	

}
