package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.UserTable;
import com.app.util.Data;
import com.app.util.UtilTemplate;

@Controller
public class HomeController {

	@Autowired
	private UtilTemplate ut;

	@RequestMapping("/home")
	public ModelAndView show() {
		ModelAndView m = new ModelAndView();
		m.setViewName("indexPage");

		return m;

	}

	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public ModelAndView loginjkjk(@ModelAttribute("userTable")UserTable user) {

		ModelAndView mav = new ModelAndView("welcome");

		if ((user.getUserName().equals("manager") && user.getPassword().equals("manager"))
				|| (user.getUserName().equals("executive") && user.getPassword().equals("executive"))) {
			mav.addObject("userTable", user);
			// data access from database using dataList() from the UtilTemplate
			// class
			List<Data> appdata = ut.dataList1(user);
			// now adding the received data from the dataList() to UI
			mav.addObject("appdata", appdata);
		}
		else{
			mav.addObject("msg","invalid ");
		}
		return mav;
	}
	@RequestMapping("/searchresult")
	public ModelAndView styhhow(@RequestParam("username")String username) {
		ModelAndView m = new ModelAndView();
		m.setViewName("searchresult");
		if(username!=null&&username!=""){
		List<Data> adata=ut.searchData(username);
		m.addObject("appdata", adata);
		}
		else
			m.addObject("status", "no record found");

		return m;

	}
}
