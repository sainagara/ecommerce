package com.demo.ecommerce.service;

import java.util.List;

import org.json.simple.JSONObject;


import com.demo.ecommerce.dto.LaptopsDto;
import com.demo.ecommerce.dto.TvDto;
import com.demo.ecommerce.dto.WatchesDto;
import com.demo.ecommerce.entities.Laptops;
import com.demo.ecommerce.entities.Tv;
import com.demo.ecommerce.entities.Watches;

public interface ProductsService {

	List<Watches> getAllWatches();

	JSONObject saveWatches(Watches watches);

	JSONObject updateWatch(WatchesDto watchDto, int productId);

	JSONObject delateWatch(int id);

	List<Laptops> getAllLaptops();

	JSONObject saveLaptops(Laptops laptop);

	JSONObject updateLaptops(LaptopsDto laptopDto, int productId);

	JSONObject delateLaptops(int id);

	List<Tv> getAllTvs();

	JSONObject saveTvs(Tv tv);

	JSONObject updateTvs(TvDto tvDto, int productId);

	JSONObject delateTvs(int id);

}
