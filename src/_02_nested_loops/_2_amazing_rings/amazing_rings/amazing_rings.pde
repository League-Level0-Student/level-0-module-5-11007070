
  /*** Go to the recipe to run the demonstration before starting this program ***/
int x = 200;
int xx = 600;
int speed = 1;
int speedd = 1;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800,500);
  noFill();
  /* Call the noFill() command so all the ellipses will be transparent */
}

void draw() {
  background(200,200,200);
    /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
  int sizeX = 15;
  int sizeY = 15;
  for (int i = 0; i < 35; i++) {
    ellipse (x, 250, sizeX, sizeY);
    sizeX = sizeX + 10;
    sizeY = sizeY + 10;
  }
  x = x + speed;
   if (x == 800) {
    speed = -speed; 
   } 
   else if (x == 0) {
    speed = 1; 
   }
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
   
   int size2x = 15;
   int size2y = 15;
   for (int j = 0; j < 35; j++) {
    ellipse (xx, 250, size2x, size2y);
    size2x = size2x + 10;
    size2y = size2y + 10;
   }
   
   xx = xx + -speed;
   if (speedd == 0) {
     speedd = -speedd;
   }
   else if (speedd == 800) {
     speedd = 1;
   }
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */

         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 

  
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
