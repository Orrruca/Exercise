package exercise007;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<Defender> defender = new ArrayList<>();
		defender.add(new Defender("冨安建洋", 25, 187, 3500));
		defender.add(new Defender("伊藤洋輝", 25, 188, 3000));
		defender.add(new Defender("板倉滉", 27, 188, 1200));
		defender.add(new Defender("菅原由勢", 23, 179, 1200));
		defender.add(new Defender("町田浩樹", 26, 190, 1000));
		defender.add(new Defender("谷口彰悟", 32, 183, 150));
		defender.add(new Defender("毎熊晟矢", 26, 179, 130));
		defender.add(new Defender("橋岡大樹", 25, 184, 200));
		
		//年齢が25歳以下
		List<Defender> ageUnder25 = defender.stream()
			.filter(d -> d.getAge() <= 25)
			.collect(Collectors.toList());
		System.out.println(ageUnder25);
		
		//身長の昇順
		final Function<Defender, Integer> byHeight = d -> d.getHeight();
		List<Defender> sortedByHeight = defender.stream()
			.sorted(Comparator.comparing(byHeight))
			.collect(Collectors.toList());
		System.out.println(sortedByHeight);
		
		//市場価値の降順
		final Function<Defender, Integer> byMarketValue = d -> d.getMarketValue();
		List<Defender> sortedByMarketValue = defender.stream()
			.sorted(Comparator.comparing(byMarketValue).reversed())
			.collect(Collectors.toList());
		System.out.println(sortedByMarketValue);
		
		//身長が185cm以上の選手の名前
		List<String> heightOver185 = defender.stream()
				.filter(d -> d.getHeight() >= 185)
				.map(d -> d.getName())
				.collect(Collectors.toList());
			System.out.println(heightOver185);
		
	}

}
