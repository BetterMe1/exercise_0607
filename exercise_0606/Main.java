package exercise.exercise_0606;

//火车进站（栈）

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] num = new int[N];
            for(int i=0; i<N; i++){
                num[i] = sc.nextInt();
            }
            int[] tmpNum = new int[N];
            System.arraycopy(num,0,tmpNum,0,N);
            Arrays.sort(num);
            List<String> list = new ArrayList<>();
            solution(list,num,0);
            Collections.sort(list);
            for(int i=0,len=list.size(); i<len; i++){
                String tmp = list.get(i);
                int k = 0;
                Stack<Integer> stack = new Stack<>();
                for(int m=0; m<N; m++){
                    stack.push(tmpNum[m]);
                    while(!stack.empty() && stack.peek()== (tmp.charAt(k)-'0')){
                        stack.pop();
                        k++;
                    }
                }
                if(stack.empty()){
                    for(int j=0; j<N; j++){
                        System.out.print(tmp.charAt(j)+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void solution( List<String> list,int[] num,int i){
        if(i==num.length-1){
            String str = "";
            for(int k=0; k<num.length; k++){
                str += num[k];
            }
            list.add(str);
            return;
        }else{
            for(int k=i; k<num.length;k++){
                swap(num, i, k);
                solution(list,num,i+1);
                swap(num, i, k);
            }
        }
    }
    public static void swap(int[] num, int m,int n){
        int temp = num[m];
        num[m] = num[n];
        num[n] = temp;
    }
}





