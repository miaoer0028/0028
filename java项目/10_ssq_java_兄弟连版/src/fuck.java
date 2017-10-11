import java.util.Random;
	 import java.util.Scanner;

	 public class fuck {
		  public static void main(String[] args) {
			    start();
			  }
		  public static void start(){
			     //定义变量
			       int sysBlueBallNum; //系统生成的篮球号码
		      int[] sysRedBallNum = new int[10];//系统生成的红球号码
			    int userBlueBallNum;//用户输入的篮球号码
		      int[] userRedBallNum = new int[10];//用户输入的红球号码
			     
		         int blueBall = 0;//篮球号码是否正确
			   int redBallCount = 0;//红球号码正确的个数
			
			    Random r = new Random();//创建生成随机数的工具类
		       Scanner input = new Scanner(System.in);
			   
		   int[] redNum = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
			       
			   //随机生成蓝球号码
			    sysBlueBallNum = r.nextInt(10)+1;
		   
			       //随机生成红球号码
			      for(int i = 0;i<sysRedBallNum.length; i++){
			       while(true){
					              int index = r.nextInt(33);
					          if(redNum[index]!=0){
					                 sysRedBallNum[i] = redNum[index];
						                 redNum[index] = 0;
						                  break;
						     }
				       }
			      }
		      
			     //用户输入号码
			     System.out.println("双色球彩票选号开始。。。。。祝你好运！");
			     System.out.println("请选择篮球号码（16选1）:");
			      userBlueBallNum = input.nextInt();
			      System.out.println("请选择红球号码（33选6）:");
			       for(int i = 0; i<userRedBallNum.length; i++){
				        userRedBallNum[i] = input.nextInt();
				   }
			
		        
			    //判断用户选择的号码跟系统生成的号码是否匹配
		      //------验证篮球
			      if(sysBlueBallNum==userBlueBallNum){
				        blueBall = 1;
				     }
			      
		      //-----验证红球
			    for(int i= 0;i<userRedBallNum.length;i++ ){
			     for(int j = 0;j<sysRedBallNum.length;j++){
					          if(userRedBallNum[i] == sysRedBallNum[j]){
					               redBallCount++;
						                break;
						           }
					         }
				    }
			    
			      check(blueBall,redBallCount);
		      
			      bubbleSort(sysRedBallNum);
		     sysOut(sysRedBallNum,sysBlueBallNum);
		   }
		
	  //判断是否中奖了
		public static void check(int blueBall, int redBallCount){
		       if(blueBall==1 && redBallCount==7){
				       System.out.println("恭喜你中了一等奖500万!");
			      }else if(redBallCount==6){
				       System.out.println("恭喜你中了二等奖!");
				   }else if(blueBall==1 && redBallCount==5){
			         System.out.println("恭喜你中了三等奖，3000元!");
				    }else if(redBallCount==5 || (redBallCount==4 && blueBall==1)){
			            System.out.println("恭喜你中了四等奖，200元!");
				    }else if(redBallCount==4 || (redBallCount==3 && blueBall==1)){
				       System.out.println("恭喜你中了五等奖，10元!");
			      }else if(blueBall==1){
				        System.out.println("恭喜你中了六等奖，5元!");
			     }else{
			      System.out.println("革命尚未成功,同志仍需努力");
				     }
		  }
		
		
		  //公布本期中奖号码(将中奖号码进行排序)
	  public static void bubbleSort(int[] sysRedBallNum){
			    int temp;
			    for(int i =0 ;i<sysRedBallNum.length-1;i++){
			         for(int j =0; j<sysRedBallNum.length-1-i;j++){
				             if(sysRedBallNum[j]>sysRedBallNum[j+1]){
						                swap(sysRedBallNum,j,j+1);
					              }
					        }
				      }
			   }
	
		 //交换数据的方法
		     public static void swap(int[] arr,int a , int b){
			      int temp = arr[a];
			  arr[a] = arr[b];
			    arr[b] = temp;
		     }
	  
		    //输出本期中奖号码
	  public static void sysOut(int[] sysRedBallNum, int sysBlueBallNum){
			           System.out.println("本期的中奖号码为：");
		           System.out.println("红球：");
		          for(int i = 0;i<sysRedBallNum.length;i++){
			             System.out.print(sysRedBallNum[i]+" ");
				        }
		          System.out.println();
			        
			       System.out.println("篮球：");
		        System.out.println(sysBlueBallNum);
			  }
	 }

 

 
