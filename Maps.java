import java.util.*;
class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("a",new Integer(100));
		hm.put("b",new Integer(200));
		hm.put("c",new Integer(300));
		
		for(Map.Entry<String, Integer> me :
			hm.entrySet()){
			System.out.println(me.getKey()+":");
			System.out.println(me.getValue());
		}
	}

}
