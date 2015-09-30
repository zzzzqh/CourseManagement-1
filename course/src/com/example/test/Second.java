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
		String[]arr_data={"年级    专业     人数      课程","2013   计算机   87   软件工程 ","2013   计算机   87 eda技术  ","2013   计算机   87    计算机体系结构  ","2013   计算机   87   云计算 ","2013   计算机   87    编译方法",
				"2013   计算机  87   分布式操作系统","2013   计算机   87 IT企业项目实训 ","2013   计算机   87  Java语言程序设计","2013   计算机   87 Web程序设计","2013   计算机   87   网络工程应用开发技术",
				"2013  计算机   87   计算机图形学","2013   计算机   87   分布式系统"};
		arr_Adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr_data);
		
		dataList = new ArrayList<Map<String,Object>>();
		listview.setAdapter(arr_Adapter);
		//listview.setAdapter(sp);

		//sp = new SimpleAdapter(this, getData(), R.layout.item, new String[]{"txt0","txt1"}, new int[]{R.id.txt0,R.id.txt1});
	}
	
	
	/*private List<Map<String,Object>> getData(){
		for(int i=0;i<20;i++){
			Map<String,Object>map=new HashMap<String,Object>();
			map.put("txt0","专业");
			map.put("txt1","计算机网络体系结构");
			dataList.add(map);
		}
		
		return dataList;
	}*/

}
