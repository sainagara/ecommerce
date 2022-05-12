package com.demo.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.dto.LaptopsDto;
import com.demo.ecommerce.dto.TvDto;
import com.demo.ecommerce.dto.WatchesDto;
import com.demo.ecommerce.entities.Laptops;
import com.demo.ecommerce.entities.Tv;
import com.demo.ecommerce.entities.Watches;
import com.demo.ecommerce.repository.LaptopsRepository;
import com.demo.ecommerce.repository.TvRepository;
import com.demo.ecommerce.repository.WatchesRepository;
@Service
public class ProductsServiceImpl implements ProductsService {
	private String ok="ok";
	private String notOk="Not Ok";
	@Autowired
	private WatchesRepository watchRepo;
	@Autowired
	private LaptopsRepository laptopRepo;
	@Autowired
	private TvRepository tvRepo;
	
	public JSONObject productsResponse(String status,String message, String accessToken)
	{

   	 JSONObject obj=new JSONObject();
   	 obj.put("ststus",status);
   	 obj.put("message",message);
   	 obj.put("accessToken",accessToken);
   	 return obj;
	}

	@Override
	public List<Watches> getAllWatches() {
		return watchRepo.findAll();
		
	}

	@Override
	public JSONObject saveWatches(Watches watches) {
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Watches> findById = watchRepo.findById(watches.getProductId());
		if(findById.isPresent())
		{
			return productsServ.productsResponse(notOk,"Watche with that id alredy exist please try with different id" , "eyJhbGciOiJIUzI1NiIsInR5dC1d2");
	    	  
		}
		else
		{
			watchRepo.save(watches);
			return productsServ.productsResponse(ok,"Watches Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1d1");
		}
	}

	@Override
	public JSONObject updateWatch(WatchesDto watchDto, int productId) {
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Watches> findById = watchRepo.findById(productId);
		if(findById.isPresent())
		{
			Watches watch = findById.get();
		String productName = watchDto.getProductName();
		String bandType = watchDto.getBandType();
		String watchType = watchDto.getWatchType();
		String waterResistant = watchDto.getWaterResistant();
		int price = watchDto.getPrice();
	    watch.setProductName(productName);
	    watch.setWatchType(watchType);
	    watch.setBandType(bandType);
	    watch.setWaterResistant(waterResistant);
	    watch.setPrice(price);
	    watchRepo.save(watch);
	    
			return productsServ.productsResponse(ok,"Watch Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1d3");
	    	  
		}
		else
		{
			return productsServ.productsResponse(notOk,"Watch with that id does not exist so unable to Update watch details" , "eyJhbGciOiJIUzI1NiIsInR5dC1d4");
	    	  
		}
		
	}

	@Override
	public JSONObject delateWatch(int id) {
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Watches> findById = watchRepo.findById(id);
		if(findById.isPresent())
		{
		watchRepo.deleteById(id);
		return productsServ.productsResponse(ok,"Watch Details are Getting Deleted succesfully" , "eyJhbGciOiJIUzI1NiIsInR5dC1d5");
		}
		else
		{
			return productsServ.productsResponse(ok,"product Id does not exist please enter valid Watch Id" , "eyJhbGciOiJIUzI1NiIsInR5");	
		}
	}
	@Override
	public List<Laptops> getAllLaptops() {
		return laptopRepo.findAll();
		
	}

	@Override
	public JSONObject saveLaptops(Laptops laptop) {
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Laptops> findById = laptopRepo.findById(laptop.getProductId());
		if(findById.isPresent())
		{
			return productsServ.productsResponse(notOk,"Laptops with that id alredy exist Try with differenty Id" , "eyJhbGciOiJIUzI1NiIsInR5dC1d6");
	    	 
		}
		else
		{
			 laptopRepo.save(laptop);
			return productsServ.productsResponse(ok,"Laptops Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1d7");
	    	  
		}
	}

	@Override
	public JSONObject updateLaptops(LaptopsDto laptopDto, int productId) {
		Optional<Laptops> findById = laptopRepo.findById(productId);
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		if(findById.isPresent())
		{
		Laptops laptop = findById.get();
		String brandName = laptopDto.getBrandName();
		String os = laptopDto.getOs();
		String ram = laptopDto.getRam();
		String displaySize = laptopDto.getDisplaySize();
		String processor = laptopDto.getProcessor();
		String touchScreen = laptopDto.getTouchScreen();
		int price = laptopDto.getPrice();
		laptop.setBrandName(brandName);
		laptop.setOs(os);
		laptop.setProcessor(processor);
		laptop.setRam(ram);
		laptop.setDisplaySize(displaySize);
		laptop.setTouchScreen(touchScreen);
		laptop.setPrice(price);
		laptopRepo.save(laptop);
		
		return productsServ.productsResponse(ok,"Laptops Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1d8");
	    	 
		}
		else
		{
			return productsServ.productsResponse(notOk,"Laptop Id deos not exist So unable to Update" , "eyJhbGciOiJIUzI1NiIsInR5dC1d9");
	    	  
		}
		
	}

	@Override
	public JSONObject delateLaptops(int id) {
		
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Laptops> findById = laptopRepo.findById(id);
		if(findById.isPresent()) {
		laptopRepo.deleteById(id);
		return productsServ.productsResponse(ok,"Laptops Details are Getting Deleted Succesfully" , "eyJhbGciOiJIUzI1NiIsInR5dC1d10");
		}
		else
		{
			return productsServ.productsResponse(notOk,"Laptops Id does not exist So It's unable to delete" , "eyJhbGciOiJIUzI1NiIsInR5");
		}
	}

	@Override
	public List<Tv> getAllTvs() {
		 return tvRepo.findAll();
			
	}

	@Override
	public JSONObject saveTvs(Tv tv) {
		
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Tv> findById = tvRepo.findById(tv.getProductId());
		if(findById.isPresent())
		{
			return productsServ.productsResponse(notOk,"Tv With this alredy exist please try with different product Id" , "eyJhbGciOiJIUzI1NiIsInR5dC1d1");
			  
		}
		else
		{
			tvRepo.save(tv);
			return productsServ.productsResponse(ok,"Tv Details are Getting saved" , "eyJhbGciOiJIUzI1NiIsInR5dC1d10");
	    	  
		}
	}

	@Override
	public JSONObject updateTvs(TvDto tvDto, int productId) {
		Optional<Tv> findById = tvRepo.findById(productId);
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		if(findById.isPresent()) {
		Tv tv = findById.get();
		String brandName = tvDto.getBrandName();
		String type = tvDto.getType();
		String displaySize = tvDto.getDisplaySize();
		String displayType = tvDto.getDisplayType();
		int price = tvDto.getPrice();
		tv.setBrandName(brandName);
		tv.setType(type);
		tv.setDisplaySize(displaySize);
		tv.setDisplayType(displayType);
		tv.setPrice(price);
		 tvRepo.save(tv);
			return productsServ.productsResponse(ok,"Tv Details are Getting Updated" , "eyJhbGciOiJIUzI1NiIsInR5dC1d12");
	    	  
		}
		else
		{
			return productsServ.productsResponse(notOk,"Tv does not exist please enter valid Tv id" , "eyJhbGciOiJIUzI1NiIsInR5dC1d13");
	    	  
		}
		
	}

	@Override
	public JSONObject delateTvs(int id) {
		ProductsServiceImpl productsServ=new ProductsServiceImpl();
		Optional<Tv> findById = tvRepo.findById(id);
		if(findById.isPresent())
		{
		tvRepo.deleteById(id);
		return productsServ.productsResponse(ok,"Tv recdord getting deleted" , "eyJhbGciOiJIUzI1NiIsInR5dC1d14");
		}
		else
		{
			return productsServ.productsResponse(notOk,"Tv does not exist please enter valid Tv id" , "eyJhbGciOiJIUzI1NiIsInR5dC1d14");
		}
	}

}
