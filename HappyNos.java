/** Solution to the Happy Numbers problem at the Microsoft Coding Challenge
  * @author Alizishaan Khatri
  */
public class HappyNos
{
  public static void main(String[] args)
  {
    //Paste the array displayed on screen here
	long[] input={72014,2,84,101302,2,862,16,3652,480,9129};
    
	//Looping through all elements of the array
	for(byte i=0;i<input.length;i++){
		//Check if number is happy o not
      if(Happy.happy(input[i])){					//Case when the given number is a happy number
        System.out.println("happy "+Happy.getSteps());
      }else{											//Case when the given number is an unhappy number
        System.out.println("unhappy "+Happy.getSteps());
      }
    }
  }
}





