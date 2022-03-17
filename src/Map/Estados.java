package Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Estados {
	public static void main(String[] args) {
		Map<String,Integer> estados = new HashMap<>();		
		estados.put("PE",9616621);
		estados.put("AL",3351543);
		estados.put("CE",9187103);
		estados.put("RN",3534265);
		System.out.println(estados);
		
		System.out.println("Substitua a população do RN por 3534165");
		estados.put("RN",3534165);
		System.out.println(estados);
		
		System.out.println("Confira se PB está no diciónario,caso não adicione: PB - 4039277");
		boolean temNoMap = estados.containsKey("PB");
		if(temNoMap == false) {
			estados.put("PB", 4039277);
		}
		System.out.println(estados);	
		System.out.println("Exiba a população do PE");
		System.out.println("População do PE: "+estados.get("PE"));
		
		System.out.println("Exiba todos os estados e suas populações na ordem em que foram informados");
		Map<String,Integer> estados1 = new LinkedHashMap<>();
		estados1.put("PE",9616621);
		estados1.put("AL",3351543);
		estados1.put("CE",9187103);
		estados1.put("RN",3534265);
		System.out.println(estados1);
		System.out.println("Exiba todos os estados e suas populações em ordem alfabética");
		Map<String,Integer> estados2 = new TreeMap<>(estados1);
		System.out.println(estados2);
		System.out.println("Exiba o estado com a menor população e sua quantidade");
		
		Integer menorPopulacao = Collections.min(estados.values());
		Set<Map.Entry<String,Integer>> entries = estados.entrySet();
		String estadoMenorPopulacao = "";
		
		for(Map.Entry<String,Integer> entry: entries) {
			if(entry.getValue().equals(menorPopulacao)) {
				estadoMenorPopulacao = entry.getKey();
				System.out.println(estadoMenorPopulacao+" - "+entry.getValue());
			}
		}
		System.out.println("Exiba o estado com a maior população e sua quantidade");
		Integer maiorPopulacao = Collections.max(estados.values());
		Set<Map.Entry<String,Integer>> entries2 = estados.entrySet();
		String estadoMaiorPopulacao = "";
		
		for(Map.Entry<String,Integer> entry: entries) {
			if(entry.getValue().equals(maiorPopulacao)) {
				estadoMaiorPopulacao = entry.getKey();
				System.out.println(estadoMaiorPopulacao+" - "+entry.getValue());
			}
		}
		System.out.println("Exiba a soma da população de todos os estados");
		Iterator<Integer> iterator = estados.values().iterator();
		Integer soma = 0;
		
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+(soma)/estados.size());
		System.out.println("Apagar dicionario e verificar se esta vazio!");
		//estados.clear();
		System.out.println("Esta vazio? "+(estados.isEmpty() ?"Sim":"Não"));
	}
}