/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student3
 */
abstract class alba {
    abstract void draw();
   int a=5,b=6,sum;
}
class cobweb extends alba{
    void draw(){
        sum=a+b;
        System.out.println("sum is:" +sum);
    }   
}
class music{
        public static void main(String[] args) 
        {
            alba sum=new cobweb();
            sum.draw();
        }
                             
}