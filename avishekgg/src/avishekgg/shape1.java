/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avishekgg;

/**
 *
 * @author student3
 */
abstract class shape1 {
    
    abstract void draw();
}
        class rectangle1 extends shape1{
        
            void draw() {
                System.out.println("drawing rectangle");
            }
        }
            class circle1 extends shape1{
                void draw() {
                    System.out .println("drawing circle");
                }
            }
class boogy1 extends shape1{
    void draw(){
        System.out.println("boogy man hashashashas");
    }
}                
    
    class testabstracton1{
        public static void main(String[] args)
        {
           shape1 s= new circle1();
           shape1 g=new boogy1();
           s.draw();
           g.draw();
        }
    }

            
    


