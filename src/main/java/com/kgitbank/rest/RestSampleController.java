package com.kgitbank.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgitbank.rest.model.FruitVO;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;


@Log4j
@RestController
@RequestMapping("/sample")
public class RestSampleController {
   
   @GetMapping(value="/getstr", produces="text/plain; charset=UTF-8")
   public String getString() {
      return "�ȳ��ϼ��� REST��Ʈ�ѷ� �Դϴ�.";
   }
   
   @GetMapping(value="/getstr2", produces=MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
   public String getString2() {
	      return "<h3>�ȳ� ����Ʈ!</h3>";
   }
   
   @GetMapping(value="/getstr3", produces=MediaType.TEXT_HTML_VALUE)
   public String getString3() {
	   return "<h3>Hello Rest!!</h3>";
   }
   
   @GetMapping(value = "/getsample", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8")
   public FruitVO getSampleObject() {
	   
	   return new FruitVO();
   }
   
   @GetMapping(value = "/getsampleXML", produces = MediaType.APPLICATION_XML_VALUE)
   public FruitVO getSampleObject2() {
	   return new FruitVO();
   }
   
   @GetMapping(value = "/getlist", produces = MediaType.APPLICATION_JSON_VALUE)
   public List<FruitVO> getSampleList() {
	   List<FruitVO> list = new ArrayList<>();
	   
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());
	   list.add(new FruitVO());

	   return list;
   }
   
   @GetMapping(value = "/getmap", produces = MediaType.APPLICATION_JSON_VALUE)
   public Map<String, FruitVO> getSampleMap() {
	   Map<String, FruitVO> map = new HashMap<>();
	   
	   map.put("apple1", new FruitVO());
	   map.put("apple2", new FruitVO());
	   map.put("apple3", new FruitVO());
	   
	   return map;
   }
   
   @GetMapping(value = "/getmap2", produces = MediaType.APPLICATION_XML_VALUE)
   public Map<String, FruitVO> getSampleMap2() {
	   Map<String, FruitVO> map = new HashMap<>();
	   
	   map.put("apple1", new FruitVO());
	   map.put("apple2", new FruitVO());
	   map.put("apple3", new FruitVO());
	   
	   return map;
   }
   
   @GetMapping(value = "/getresp")
   public ResponseEntity<FruitVO> getRespEntity() {
	   
	   // ResponseEntity : ���α׷��Ӱ� ���� Http������ �ڼ��� ������ �� �ִ�
	   // ������ �޴� ������ status �ڵ带 Ȱ���� �� �ִ�
	   ResponseEntity<FruitVO> result = null;
	   
	   result = ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new FruitVO());
	   
	   return result;
   }
   
   @GetMapping(value = "/path/{year}/{month}", produces = MediaType.TEXT_PLAIN_VALUE)
   public String pathTest(
		   @PathVariable("year") Integer year,
		   @PathVariable("month") Integer month
	) {
	   return "Hello! you putted " + year + "/" + month + " in your uri path.";	   
   }
   
   /*
    	@RequestBody
    	
    	  - ��Ʈ�ѷ����� JSON �����͸� �޾ƾ� �� �� ����ϴ� ������̼�
    	  - ��û�� body�� �Ƿ��ִ� JSON�����͸� �˾Ƽ� ��ȯ���ش�
    	  
    	@PostMapping�� �޼����� ������ ���? 
    	
    	  - ũ���� REST Client Ȯ�� ���α׷� �� ������ ��� ���� ����Ѵ�
   */
   
   @PostMapping(value = "/fruit", produces = MediaType.TEXT_PLAIN_VALUE)
   public String convertJsonFruit(@RequestBody FruitVO fruit) {
	   
	   
	   return "You fruit is " + fruit;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}