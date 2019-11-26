package com.lti.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	
  
    
   
    @RequestMapping(value="savefile",method=RequestMethod.POST)  
    public ModelAndView saveimage( @RequestParam("file") MultipartFile m,  
           HttpSession session) throws Exception{  
  
String path ="D:/images/";
		
		String finalpath = path + m.getOriginalFilename();
		
		try {
			m.transferTo(new File(finalpath));
		}
		catch (IOException e) {
			e.printStackTrace();
		}  
           
    return new ModelAndView("fileuploaded");  
    }  
}


