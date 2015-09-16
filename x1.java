
//////// Rebeca Janowicz?  (CST 112; Wednesday, September 16);

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  frameRate(30);
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon+10, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  fill(66,139,18);                            //ADD
  triangle(30, 75, 58, 20, 86, 75);           //ADD
  triangle(30, 120, 58, 70, 86, 120);        //ADD

  fill(98,86,56);
  rect(55,120,10,20);                      // this is my tree
  

  fill(167,161,98);                   
  rect(50,300,150,125);                       // house
  fill(77,66,67);
  triangle(50, 300, 125, 175, 200, 300);     //roof
  fill(160,10,20);
  rect(100,200,10,20);                      //cheminee
  fill(255);
  rect(65,310,30,50);                      //windows
  rect(155,310,30,50);                    //windows
  fill(75,71,57);
  rect(105,370,30,55);                    //door
  fill(0);
  text( "My name is Rebeca", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  //fill(255,0,0); rect( x,y, 30,50 );        
  //text( "Fred", x,y );
  fill(277,181,200);                         // CREATURE "MILI"
  //ellipseMode(CENTER);                     // WHY IF I ACTIVATE THIS, THE GRASS, HORIZON AND HOUSE GETS MISPLACED. 
  ellipse(x,y-45,40,40);
  fill(0);
  ellipse(x-10,y-50,10,7);
  ellipse(x+10,y-50,10,7);
  ellipse(x+2,y-40,5,5);
  fill(88,53,165);
 // rectMode(CENTER);              ?????
  rect( x-10,y-25, 20,50 );                    /* REPLACE THIS WITH YOUR OWN CODE! */
  fill(0);
  line(x-30,y+25,x+30,y+25);  ??
  line(x-10,y-10,200,175);    ??
  line(x+10,y-10,400,175);    ??
  fill(245,32,75);
  text( "MILI", x-10,y+50 );                  //END OF CREATURE "MILI"
}



//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
   
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   
