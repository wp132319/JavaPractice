package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> list1 = new ArrayList<>();
		List<Music> list2 = new ArrayList<>();
		

		System.out.println("---- << 멜론 장르별 챠트 >> ----");
		
		list1.add(new Music("내 첫사랑", "배리굿굿"));
		list1.add(new Music("또 다시 사랑", "임창정"));
		list1.add(new Music("부산에 가면", "박진영"));
		
		list2.add(new Music("커피", "유재환, 장예림"));
		list2.add(new Music("다 잘될거야", "쿨"));
		
		map.put("발라드", list1);
		map.put("댄스", list2);
		
		printMap(map);
		
		
		
		
		
		
		
		
		System.out.println("---- << 발라드 3위 곡 변경 >> ----");
		
		map.get("발라드").set(2, new Music("지우고 지워도", "차수경"));
		
		printMap(map);
		
		
		
		
		
		
		
		System.out.println("---- << 발라드 1위 곡 삭제 >> ----");
		
		map.get("발라드").remove(0);
		
		printMap(map);
		
		
		
		
		
		
		
		System.out.println("---- << 전체 리스트 삭제 >> ----");
		
		map.clear();
		
		printMap(map);
		
		
		
				
		
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			for(int i=1; i<=map.get(key).size(); i++){
				System.out.println(i + ". " + map.get(key).get(i-1));
			}
		}
	}

}
