//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/2;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 50,50,200 );                // sky
  fill( 250 );
  ellipse( width*1/2, height/3, 100,100 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 50,horizon, 65,horizon-80, 80,horizon  );  // tree
  text( "This is NOT a good tree; please fix it!", 150,horizon );
                                            // house

  fill(0);
  text( "My name is Mud", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255,255,255); rect( x,y, 80,50 );  /* REPLACE THIS WITH YOUR OWN CODE! */
  rect(x, y+50, 10, 40);
  rect (x+70, y+50, 10,40);
  rect (x+70,y-30, 20, 30);
  ellipse(x+100, y-30, 60,30);
  triangle(x+90, y-45, x+105,y-55,x+110,y-45);
  triangle(x+70, y-40, x+85,y-50, x+90, y-40);
 
  
  
 
  fill (0); ellipse(x+10,y+10, 20,10);
 fill (0); ellipse(x+20, y+40, 20, 10);
 fill (0); ellipse (x+60, y+20, 20, 10);
 ellipse(x+90, y-25, 10,5);
 ellipse (x+110, y-40, 7,5);
 line(x,y, x-20, y+50);
 triangle(500,200, 550,150, 600, 200); 
  text( "cow", x+40,y+40 );
  fill (255,0,0);
   rect(500,200, 100,50); 

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( +5 );                  // random speed.
  dy=  random( -10 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
