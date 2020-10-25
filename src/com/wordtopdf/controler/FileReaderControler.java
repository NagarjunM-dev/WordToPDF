package com.wordtopdf.controler;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.wordtopdf.service.FileConverterService;


@Controller
public class FileReaderControler {

	@Autowired
	private FileConverterService storageService;

	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
		   return "index";
	   }

	@RequestMapping(value = "/doUpload", method = RequestMethod.POST, consumes = { "multipart/form-data" })
	public String upload(@RequestParam MultipartFile file) {	
		String filePath = request.getServletContext().getRealPath("/");
		try {
			File f1 = new File(filePath+"/"+file.getOriginalFilename());
			file.transferTo(f1);
			storageService.convert(f1.getAbsolutePath(),f1.getName());
		} catch (Exception e) {
			System.out.println(e);
		}
		return "success";
	}

}
