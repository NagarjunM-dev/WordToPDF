package com.wordtopdf.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

@Service
public class FileConverterService {

	
	

	public void convert(String file_path,String file_name) {
	 try {
		 System.out.println(file_path);
		 System.out.println(file_name);
		 Document doc= new Document(file_path); 
		 doc.save(file_path+"_output.pdf",SaveFormat.PDF);
	 }catch (Exception e) {
		System.out.println(e);
	}
 }

}
