//////// What am I trying to do? Good Question!
//////// Made a bunch of changes,
//////// Made Puckman, the monster, made him bouncy, made him scary looking
//////// Made a house
//////// Added credit to me
//////// David Marques  (CST 112; 9/9/15)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  0;
  y=  0;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100, 150, 200);                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40, 40);    // sun
  
  fill( 100, 200, 100);
  stroke( 100, 200, 100);
  rect( 0, horizon, width, height*3/4);      // grass.
  
  triangle( 150, horizon-25, 120, horizon-75, 180, horizon-75);  // tree
  stroke( 139, 69, 19); fill( 139, 69, 19);  //I think it should be stated that I found the brown for my bark from google
  rect( 140, horizon-50, 20, 50);
  
  stroke(0); fill(0);
  ellipse( 145, horizon-70, 2, 2);              //Tree Smile :D
  ellipse( 155, horizon-70, 2, 2);
  arc(150, horizon-64 , 10, 10, 0, PI, CHORD);
  text( "Don't let him talk to you like that! You are a beautiful tree!", 10, horizon-80 );
    
  fill(255, 0, 150); rect( width/2-20, horizon-40, 40, 40);              // house
  fill(255, 0, 50);  triangle( width/2, horizon-60, width/2-30, horizon-40, width/2+30, horizon-40);


  fill(0);text( "My name is Puckman, I live an evil life.", 10,height-20 );                                          
  
  if( x > width || x < 0){
    dx *= -1;                  //making left and right borders invert x direction
  }
  if( y > height || y < 0){    //making top and bottom borders invert y direction
    dy *= -1;
  }
  
  x=  x + dx;    // ACTION:  move (x,y) coordinates.
  y=  y + dy;    
  translate(x,y);
  rotate( atan2( mouseY-y,mouseX-x));
  text( "AHH!", 25, 0 );
  text( "Puckman", -30, -45);
  fill(255,200,0); arc(0, 0, 80, 80, QUARTER_PI, TWO_PI-QUARTER_PI , PIE);    //Puckman Shape
  fill(255,255,255);               //White for Teeth and Eye
  line(0, -30, 10, -20);       //Puckman Eyebrow Line

  text( "Created By David Marques", width-150, height-10);
  
  stroke(255, 0, 0);               //makes Teeth and Eye red           
  triangle(0, 0, 5, -5, 5, 0);
  triangle(5, 5, 10, 10, 10, 5);                    
  triangle(10, -10, 15, -15, 15, -10);    //Teeth
  triangle(15, 15, 20, 20, 20, 15);    
  triangle(20, -20, 25, -25, 25, -20);    
  
  ellipse(0, -20, 10, 10);        //Puckman Eye
  point(3, -20);                //Puckman Eye Pupil
  
  stroke(0);                       //makes stroke color black again

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
