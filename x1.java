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
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 100,150,200 );                // sky
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 40,40 );    // sun
  
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      // grass.
  
  /* INSERT YOUR CODE HERE! */
  triangle( 150,horizon, 120,horizon-50, 180,horizon-50  );  // tree
  text( "This is NOT a good tree; please fix it!", 150,horizon );
    
  fill(255, 0, 150); rect( width/2-20, horizon-40, 40, 40);              // house
  fill(255, 0, 50);  triangle( width/2, horizon-60, width/2-30, horizon-40, width/2+30, horizon-40);


  fill(0);
  text( "My name is Puckman, I live an evil life.", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  
  if( x > width || x < 0){
    dx *= -1;                  //making left and right borders invert x direction
  }
  if( y > height || y < 0){    //making top and bottom borders invert y direction
    dy *= -1;
  }
  
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  text( "AHH!", x+25, y );
  fill(255,200,0); arc(x, y, 80, 80, QUARTER_PI, TWO_PI-QUARTER_PI , PIE);    //Puckman Shape
  fill(255,255,255);               //White for Teeth and Eye
  line(x, y-30, x+10, y-20);       //Puckman Mad Line

  text( "Created By David Marques", width-150, height-10);
  
  stroke(255, 0, 0);               //makes Teeth and Eye red
  beginShape(TRIANGLES);           //Begin Teeth
  vertex(x,    y    );
  vertex(x+5,  y-5  );             //1st Tooth
  vertex(x+5,  y    );
  
  vertex(x+5,  y+5  );
  vertex(x+10, y+10 );             //2nd Tooth
  vertex(x+10, y+5  );
  
  vertex(x+10, y-10 );
  vertex(x+15, y-15 );             //3rd Tooth
  vertex(x+15, y-10 );
  
  vertex(x+15, y+15 );
  vertex(x+20, y+20 );             //4th Tooth
  vertex(x+20, y+15 );
   
  vertex(x+20, y-20 );
  vertex(x+25, y-25 );             //5th Tooth
  vertex(x+25, y-20 );
                                   //why so many teeth? Good Question! I'll change them to triangle(); eventually
  endShape();                      //End Tooth Shape
  
  ellipse(x, y-20, 10, 10);        //Puckman Eye
  point(x+3, y-20);                //Puckman Eye Pupil
  
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
