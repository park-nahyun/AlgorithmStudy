package LicenseKey;

import java.util.HashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
    	int answer[] = new int[id_list.length];
    	int cnt[]=new int[id_list.length]; 	// 신고 받은 횟수
    	HashSet<String> set = new HashSet<String>();

    	for(int i=0 ; i<report.length; i++)
    		set.add(report[i]);
    	
    	report = set.toArray(new String[0]);
    	
    	for(int i=0 ; i<report.length; i++)
    	{
    		int a = 0;
    		a = report[i].indexOf(" ");
    		
    		for(int j=0; j<id_list.length; j++)
    		{

        		if(report[i].substring(a+1)==id_list[j])
        			cnt[j]++;

        		
        		if(cnt[j]>=k)
        			set.add(id_list[j]);
    		}
        		
    	}

    		
        String repId[] = new String[set.size()];
        repId = set.toArray(new String[0]);
        
        
    	for(int i=0 ; i<report.length; i++)
    	{
    		int a = 0;
    		a = report[i].indexOf(" ");
    		
    		for(int j=0; j<repId.length; j++)
    		{
        		if(repId[j]==report[i].substring(0,a))
        			answer[i]++;
    		}
        		
    	}
    	   
        return answer;
    }


    public static void main(String[] args) {
    
    	Solution sol = new Solution();
    	
    	String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    	String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
    	int k = 2;
    	
    	int[] arr = sol.solution(id_list, report, k);
    	
    	for(int i=0; i<arr.length; i++)
    		System.out.print(arr[i] + ", ");
    }
}
  