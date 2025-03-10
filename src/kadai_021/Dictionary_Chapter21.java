package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	/*必要？
	String word;
	
	public void setSearchWord(String word) {
		this.word = word;
	
	}*/

	HashMap<String, String> dictionary = new HashMap<String, String>();

	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

	}

	public void search(String[] key) {
		for (int i = 0; i < key.length; i++) {
			if (dictionary.containsKey(key[i])) {
				System.out.println(key[i] + "の意味は" + dictionary.get(key[i]));
			} else {
				System.out.println(key[i] + "は辞書に存在しません。");
			}
		}
	}

}
/*	public Void dictionaryApp(String[] wordsSearch) {
		for (HashMap.Entry<String, String> entry : dictionary.entrySet()) {
			//29で〆てるからdictionary.entrySet()が引用出来ない。
			//しかし、〆ないとdictionaryAppのメゾットが作れない。
			if (entry.getKey() != null) {
				System.out.println(entry.getKey() + "の意味は" + entry.getValue());
			} else {
				System.out.println(entry.getKey() + "は辞書に存在しません");
			}*/