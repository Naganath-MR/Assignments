package apr17_Thursday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionPractise {

	public static void main(String[] args) {
		
		Map <String,String> fruitsRow1 = new HashMap <String,String>();
		fruitsRow1.put("Name", "mango");
		fruitsRow1.put("cost", "80");
		
		System.out.println("Fruits-Row1 in Map:"+fruitsRow1);
		
		Map <String,String> fruitsRow2 = new HashMap <String,String>();
		fruitsRow2.put("Name", "apple");
		fruitsRow2.put("cost", "200");
		
		System.out.println("Fruits-Row2 in Map:"+fruitsRow2);
		
		Map <String,String> fruitsRow3 = new HashMap <String,String>();
		fruitsRow3.put("Name", "papaya");
		fruitsRow3.put("cost", "100");
		
		System.out.println("Fruits-Row3 in Map:"+fruitsRow3);
		
		List <Map<String,String>> fruitsList = new ArrayList<Map<String,String>>();
		
		fruitsList.add(fruitsRow1);
		fruitsList.add(fruitsRow2);
		fruitsList.add(fruitsRow3);
		System.out.println("All fruits rows of map in LIST:"+fruitsList);
		
		System.out.println("==========================================");
		Map <String,String> VegRow1 = new HashMap <String,String>();
		VegRow1.put("Name", "brinjal");
		VegRow1.put("cost", "70");
		
		System.out.println("Vegetables-Row1 in Map:"+VegRow1);
		
		Map <String,String> VegRow2 = new HashMap <String,String>();
		VegRow2.put("Name", "potato");
		VegRow2.put("cost", "50");
		
		System.out.println("Vegetables-Row2 in Map:"+VegRow2);
		
		Map <String,String> VegRow3 = new HashMap <String,String>();
		VegRow3.put("Name", "cucumber");
		VegRow3.put("cost", "60");
		
		System.out.println("Vegetables-Row3 in Map:"+fruitsRow3);
		
		List <Map<String,String>> Veglist = new ArrayList<Map<String,String>>();
		
		Veglist.add(VegRow1);
		Veglist.add(VegRow2);
		Veglist.add(VegRow3);
		System.out.println("All Vegetables rows of map in LIST:"+Veglist);
		
		System.out.println("==========================================");
		Map <String,String> BevRow1 = new HashMap <String,String>();
		BevRow1.put("Name", "7up");
		BevRow1.put("cost", "60");
		
		System.out.println("Bevereges-Row1 in Map:"+BevRow1);
		
		Map <String,String> BevRow2 = new HashMap <String,String>();
		BevRow2.put("Name", "Sprite");
		BevRow2.put("cost", "70");
		
		System.out.println("Bevereges-Row2 in Map:"+BevRow2);
		
		Map <String,String> BevRow3 = new HashMap <String,String>();
		BevRow3.put("Name", "bovonto");
		BevRow3.put("cost", "80");
		
		System.out.println("Bevereges-Row3 in Map:"+BevRow3);
		
		List <Map<String,String>> BevList = new ArrayList<Map<String,String>>();
		
		BevList.add(BevRow1);
		BevList.add(BevRow2);
		BevList.add(BevRow3);
		System.out.println("All Bevereges rows of map in LIST:"+BevList);
		
		
		Map <String,List<Map<String,String>>> AllListDatascombined = new HashMap <String,List<Map<String,String>>>();
		
		
		AllListDatascombined.put("AllFruitsList" ,fruitsList);
		AllListDatascombined.put("AllVegList" ,Veglist);
		AllListDatascombined.put("AllBevList", BevList);
		
		System.out.println("Overall datas:"+AllListDatascombined);
		
		System.out.println(AllListDatascombined.get("AllVegList").get(2).get("cost"));

	}

}
