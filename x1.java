//Making a Scene
//Drake P  9/9/15

/// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 700,700);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,200,250 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  fill(255,0,0);
  rect( 150,horizon, 120,horizon-50);  // house
  fill(0);
  triangle(150,horizon,271,horizon,210,90);
                                      

  fill(0);
  text( "My name is Drake", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(50,80,150); 
  rect( x,y, 30,50 );
  fill(255,0,0);
  ellipse(x+15,y-11,20,20);  /* REPLACE THIS WITH YOUR OWN CODE! */
  fill(0,255,255);
  triangle(x+15,y-11,20,20,20,20);
  fill(255);
  text( "Jimmy", x,y+30 );

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
   
