package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Second extends Activity{
	private ListView listview;
	private ArrayAdapter<String>arr_Adapter;
	private SimpleAdapter sp;
	private List<Map<String,Object>>dataList;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.secondy_view);
		listview = (ListView) findViewById(R.id.listView);
		String[]arr_data={"�꼶    רҵ     ����      �γ�","2013   �����   87   ������� ","2013   �����   87 eda����  ","2013   �����   87    �������ϵ�ṹ  ","2013   �����   87   �Ƽ��� ","2013   �����   87    ���뷽��",
				"2013   �����  87   �ֲ�ʽ����ϵͳ","2013   �����   87 IT��ҵ��Ŀʵѵ ","2013   �����   87  Java���Գ������","2013   �����   87 Web�������","2013   �����   87   ���繤��Ӧ�ÿ�������",
				"2013  �����   87   �����ͼ��ѧ","2013   �����   87   �ֲ�ʽϵͳ"};
		arr_Adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr_data);
		
		dataList = new ArrayList<Map<String,Object>>();
		listview.setAdapter(arr_Adapter);
		//listview.setAdapter(sp);

		//sp = new SimpleAdapter(this, getData(), R.layout.item, new String[]{"txt0","txt1"}, new int[]{R.id.txt0,R.id.txt1});
	}
	
	
	/*private List<Map<String,Object>> getData(){
		for(int i=0;i<20;i++){
			Map<String,Object>map=new HashMap<String,Object>();
			map.put("txt0","רҵ");
			map.put("txt1","�����������ϵ�ṹ");
			dataList.add(map);
		}
		
		return dataList;
	}*/

}
