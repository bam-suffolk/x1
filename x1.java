//Making a Scene
//Drake P  9/9/15 CST 112

/// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;
float sunX, sunY;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 700,700);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  //--dx=  3;  too fast
  //--dy=  2;
  dx=  1;
  dy=  .66;
  /// start sun
  sunX=width*3/4;
  sunY=height/8;
  
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,200,250 );                // sky
  fill( 255,255,0 );
  sunX= (sunX+1) % (width+150);
 
  ellipse( sunX,sunY, 40,40 );    // sun
  
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  triangle(550,150,600,150,575,100);
  fill(139,80,13);
  rect(568,150,15,25);
  
  
  fill(255,0,0);
  rect( 150,horizon, 120,horizon-50);  // house
  fill(139,80,13);
  rect(230,250,25,50);
  fill(0);
  triangle(150,horizon,271,horizon,210,90);
  fill(255);
  rect(165,200,30,30);
  rect(225,200,30,30);
                                      

  fill(0);
  text( "My name is Drake", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  
  fill(50,80,150); 
  rect( x,y, 30,50 );
  fill(255,0,0);
  ellipse(x+15,y-11,20,20);  
  fill(255,255,0);
  stroke(255,255,0);          //Puppet Sting//
  line(x+15,y-11,350,80);  
  stroke(0);
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
   
