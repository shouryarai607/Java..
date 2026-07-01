import java.util.*;

class Strings{
  public static void main(String[] args){
    // String name="Tony";
    // String surname="Stark";

    // Scanner sc=new Scanner(System.in);
    // String name=sc.next();

    // System.out.println(name +" "+surname);
    // String fullName= name + " "+ surname;

    // for(int i=0;i<fullName.length();i++){
    //   System.out.println(fullName.charAt(i));
    // }


    // String name1= "Tony";
    // String name2= "Tony";


    // if(name1.equals(name2)){
    //   System.out.println("This string are equal");
    // }else{
    //   System.out.println("STring are not equal");
    // }


    // if(name1.compareTo(name2)==0){
    //   System.out.println("equal");
    // }else {
    //   System.out.println("Not equal");
    // }


    // String fullName="Shourya Rai";
    // String name=fullName.substring(0, 8);
    // System.out.println(name);


    // String str="123";
    // int number=Integer.parseInt(str);
    // System.out.println(number);


    // int number1=123;
    // String str1=Integer.toString(number1);
    // System.out.println(str1);



    // Scanner sc=new Scanner(System.in);
    // int size = sc.nextInt();

    // String array[]= new String[size];

    // int toLength=0;


    // for(int i=0;i<size;i++){
    //   array[i]= sc.next();
    //   toLength +=array[i].length();

    // }
    // System.out.println(toLength);


    // System.out.println("Enter your Email id: ");
    // Scanner sc=new Scanner(System.in);
    // String email= sc.next();
    // String username="";

    // for(int i=0;i<email.length();i++){
    //   if(email.charAt(i)=='@'){
    //     break;
    //   }
    //   username += email.charAt(i);
    // }
    // System.out.println(username);

    
    System.out.println("Enter a String: ");
    Scanner sc= new Scanner(System.in);
    String str= sc.next();

    String result="";

    for(int i=0;i<str.length();i++){
      if(str.charAt(i)=='e'){
        result +='i';
      }else{
        result += str.charAt(i);
      }
    }
    System.out.println(result);
    




  }
}